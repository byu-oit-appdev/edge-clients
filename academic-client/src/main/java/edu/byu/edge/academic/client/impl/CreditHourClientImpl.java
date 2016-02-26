package edu.byu.edge.academic.client.impl;

import com.google.common.base.Charsets;
import com.google.common.base.Function;
import com.google.common.collect.Lists;
import com.google.common.io.CharStreams;
import edu.byu.auth.client.ApiKeyClient;
import edu.byu.edge.academic.client.CreditHourClient;
import edu.byu.edge.academic.client.ServiceException;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.util.Assert;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by eric on 2/4/16.
 */
public class CreditHourClientImpl implements CreditHourClient, InitializingBean {
	private static final Logger LOG = Logger.getLogger(CreditHourClientImpl.class);

	private String baseUrl;
	private ApiKeyClient apiKeyClient;

	public CreditHourClientImpl(final String url, ApiKeyClient apiKeyClient) {
		this.baseUrl = _cleanUrl(url);
		this.apiKeyClient = apiKeyClient;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		Assert.hasText(baseUrl);
		Assert.notNull(apiKeyClient);
	}

	@Override
	public double getCreditHoursByPersonIdAndYearTerm(String personId, String yearTerm) throws ServiceException {
		try {
			final URL url = new URL(baseUrl + personId + "/" + yearTerm);
			final HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			connection.setRequestProperty("Accept", "application/json");
			connection.setRequestProperty("Authorization", apiKeyClient.obtainAuthorizationHeaderString());
//			connection.setRequestProperty("Content-Type", "application/xml");

			final String result = CharStreams.toString(new InputStreamReader(connection.getInputStream(), Charsets.UTF_8));
			final List<String> list = new LinkedList<String>();
			final Matcher matcher = CRED_HRS.matcher(result);
			while (matcher.find()) {
				list.add(matcher.group(1));
			}
			return getTotal(Lists.transform(list, STR_TO_DBL_FUNC));
		} catch (MalformedURLException e) {
			LOG.error("Error in identity client", e);
			throw new ServiceException("Error determining credit hours.", e);
		} catch (IOException e) {
			LOG.error("Error in identity client", e);
			throw new ServiceException("Error determining credit hours.", e);
		}
	}

	private static double getTotal(final Collection<Double> coll) {
		double total = 0.0;
		for (final Double d : coll) {
			total += d;
		}
		return total;
	}

	private static final Pattern CRED_HRS = Pattern.compile("\"credit_hours\"[^:]*:\\s*\"([0-9\\.]+)\"");

	private static final Function<String, Double> STR_TO_DBL_FUNC = new Function<String, Double>() {
		@Override
		public Double apply(final String input) {
			return Double.parseDouble(input);
		}
	};

	private static String _cleanUrl(final String base) {
		if (base.endsWith("/")) return base;
		else return base + '/';
	}

}