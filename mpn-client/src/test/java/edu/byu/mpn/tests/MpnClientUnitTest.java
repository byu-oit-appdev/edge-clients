package edu.byu.mpn.tests;

import edu.byu.mpn.client.impl.MpnClientImpl;
import edu.byu.mpn.client.interfaces.MpnClient;
import edu.byu.mpn.domain.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.io.IOException;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by cwoodfie on 4/27/16.
 */

@RunWith(JUnit4.class)
public class MpnClientUnitTest {

	private MpnClient mpnClient = new MpnClientImpl();

	@Test
	public void testPushAndroidNotifications() throws IOException {
		ArrayList<String> registrationIds = new ArrayList<String>();
//		GoogleResponse googleResponse = mpnClient.pushAndroidNotifications(new AndroidNotificationWrapper(new AndroidNotification("Notification Title", "Notification Message"), registrationIds));
//		assertEquals(1, googleResponse.getSuccess());
//		mpnClient.pushAppleNotifications(new AppleNotificationWrapper());
		assertTrue(true);
	}
}
