
package edu.byu.auth.domain;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.Calendar;


/**
 *
 *
 * 						The wsSession represents a Web Service Authentication Session. This class is configured using JAXB
 * 						 to marshal XML into representing a Web Service Authentication Session. This session is created using
 * 						  the Web Service Authentication Service. A session is established by submitting a valid net-id and
 * 						  password. Upon creation a temporary API-Key is issued for the user with the corresponding shared
 * 						  secret value. To enforce the temporary nature of this session, each session has a time out.
 * 						  Sessions can be renewed and destroyed using the previously mentioned service.
 *
 *
 *
 * <p>Java class for wsSession complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="wsSession"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="personId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="apiKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sharedSecret" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="expireDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsSession", namespace = "http://ws.byu.edu/namespaces/security/authentication/v1.0", propOrder = {
    "personId",
    "apiKey",
    "sharedSecret",
    "expireDate"
})
@XmlRootElement(name = "wsSession", namespace = "http://ws.byu.edu/namespaces/security/authentication/v1.0")
public class WsSession {

    @XmlElement(namespace = "http://ws.byu.edu/namespaces/security/authentication/v1.0", required = true)
    protected String personId;

    @XmlElement(namespace = "http://ws.byu.edu/namespaces/security/authentication/v1.0", required = true)
    protected String apiKey;

    @XmlElement(namespace = "http://ws.byu.edu/namespaces/security/authentication/v1.0", required = true)
    protected String sharedSecret;

    @XmlElement(namespace = "http://ws.byu.edu/namespaces/security/authentication/v1.0", required = true)
	@XmlJavaTypeAdapter(CalendarConverter.class)
	protected Calendar expireDate;

    /**
     * Gets the value of the personId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPersonId() {
        return personId;
    }

    /**
     * Sets the value of the personId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPersonId(String value) {
        this.personId = value;
    }

    /**
     * Gets the value of the apiKey property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getApiKey() {
        return apiKey;
    }

    /**
     * Sets the value of the apiKey property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setApiKey(String value) {
        this.apiKey = value;
    }

    /**
     * Gets the value of the sharedSecret property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSharedSecret() {
        return sharedSecret;
    }

    /**
     * Sets the value of the sharedSecret property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSharedSecret(String value) {
        this.sharedSecret = value;
    }

    /**
     * Gets the value of the expireDate property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public Calendar getExpireDate() {
        return expireDate;
    }

    /**
     * Sets the value of the expireDate property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setExpireDate(Calendar value) {
        this.expireDate = value;
    }

}
