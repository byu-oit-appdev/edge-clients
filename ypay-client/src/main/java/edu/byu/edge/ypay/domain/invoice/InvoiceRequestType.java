
package edu.byu.edge.ypay.domain.invoice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Use to create an invoice id. At least one line item is needed, but
 * 				can have as many as are wanted.
 * 			
 * 
 * <p>Java class for InvoiceRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.byu.edu/payment/invoice}InvoiceBaseType">
 *       &lt;sequence>
 *         &lt;element name="returnUrl" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="notificationUrl" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="clientSystemTransactionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceRequestType", propOrder = {
    "returnUrl",
    "notificationUrl",
    "clientSystemTransactionId"
})
public class InvoiceRequestType
    extends InvoiceBaseType
{

    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "anyURI")
    protected String returnUrl;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "anyURI")
    protected String notificationUrl;
    @XmlElement(required = true)
    protected String clientSystemTransactionId;

    /**
     * Gets the value of the returnUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnUrl() {
        return returnUrl;
    }

    /**
     * Sets the value of the returnUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnUrl(String value) {
        this.returnUrl = value;
    }

    /**
     * Gets the value of the notificationUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationUrl() {
        return notificationUrl;
    }

    /**
     * Sets the value of the notificationUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationUrl(String value) {
        this.notificationUrl = value;
    }

    /**
     * Gets the value of the clientSystemTransactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientSystemTransactionId() {
        return clientSystemTransactionId;
    }

    /**
     * Sets the value of the clientSystemTransactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientSystemTransactionId(String value) {
        this.clientSystemTransactionId = value;
    }

}
