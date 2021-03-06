
package edu.byu.auth.domain;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.Calendar;


/**
 *
 *
 * 						The credential is used when doing web service authentication. The wsId is passed along with a
 * 						signature that was obtained using the shared secret.  Upon successful validation of the HMAC
 * 						based authentication the identity associated with this credential is known.
 *
 *
 *
 * <p>Java class for credential complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="credential"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="personId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="wsId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sharedSecret" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="expirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "credential", namespace = "http://ws.byu.edu/namespaces/security/authentication/v1.0", propOrder = {
    "personId",
    "wsId",
    "sharedSecret",
    "expirationDate"
})
@XmlRootElement(name = "credential", namespace = "http://ws.byu.edu/namespaces/security/authentication/v1.0")
public class Credential {

    @XmlElement(namespace = "http://ws.byu.edu/namespaces/security/authentication/v1.0", required = true)
    protected String personId;

	@XmlElement(namespace = "http://ws.byu.edu/namespaces/security/authentication/v1.0", required = true)
    protected String wsId;

	@XmlElement(namespace = "http://ws.byu.edu/namespaces/security/authentication/v1.0", required = true)
    protected String sharedSecret;

    @XmlElement(namespace = "http://ws.byu.edu/namespaces/security/authentication/v1.0", required = true)
	@XmlJavaTypeAdapter(CalendarConverter.class)
	protected Calendar expirationDate;

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
     * Gets the value of the wsId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getWsId() {
        return wsId;
    }

    /**
     * Sets the value of the wsId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setWsId(String value) {
        this.wsId = value;
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
     * Gets the value of the expirationDate property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public Calendar getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setExpirationDate(Calendar value) {
        this.expirationDate = value;
    }

}
