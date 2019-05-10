
package com.evry.employee.resources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for employeeEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="employeeEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="employeeAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="employeeEmailId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="employeeId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="employeeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="employeePassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="employeePhoneNumber" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "employeeEntity", propOrder = {
    "employeeAddress",
    "employeeEmailId",
    "employeeId",
    "employeeName",
    "employeePassword",
    "employeePhoneNumber"
})
public class EmployeeEntity {

    protected String employeeAddress;
    protected String employeeEmailId;
    protected int employeeId;
    protected String employeeName;
    protected String employeePassword;
    protected long employeePhoneNumber;

    /**
     * Gets the value of the employeeAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeAddress() {
        return employeeAddress;
    }

    /**
     * Sets the value of the employeeAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeAddress(String value) {
        this.employeeAddress = value;
    }

    /**
     * Gets the value of the employeeEmailId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeEmailId() {
        return employeeEmailId;
    }

    /**
     * Sets the value of the employeeEmailId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeEmailId(String value) {
        this.employeeEmailId = value;
    }

    /**
     * Gets the value of the employeeId property.
     * 
     */
    public int getEmployeeId() {
        return employeeId;
    }

    /**
     * Sets the value of the employeeId property.
     * 
     */
    public void setEmployeeId(int value) {
        this.employeeId = value;
    }

    /**
     * Gets the value of the employeeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeName() {
        return employeeName;
    }

    /**
     * Sets the value of the employeeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeName(String value) {
        this.employeeName = value;
    }

    /**
     * Gets the value of the employeePassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeePassword() {
        return employeePassword;
    }

    /**
     * Sets the value of the employeePassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeePassword(String value) {
        this.employeePassword = value;
    }

    /**
     * Gets the value of the employeePhoneNumber property.
     * 
     */
    public long getEmployeePhoneNumber() {
        return employeePhoneNumber;
    }

    /**
     * Sets the value of the employeePhoneNumber property.
     * 
     */
    public void setEmployeePhoneNumber(long value) {
        this.employeePhoneNumber = value;
    }

}
