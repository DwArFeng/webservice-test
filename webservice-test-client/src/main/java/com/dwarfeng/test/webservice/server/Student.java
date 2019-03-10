
package com.dwarfeng.test.webservice.server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>student complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="student">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="birthDay" type="{http://server.webservice.test.dwarfeng.com/}date" minOccurs="0"/>
 *         &lt;element name="gender" type="{http://server.webservice.test.dwarfeng.com/}gender" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "student", propOrder = {
    "birthDay",
    "gender",
    "name"
})
public class Student {

    protected Date birthDay;
    @XmlSchemaType(name = "string")
    protected Gender gender;
    protected String name;

    /**
     * 获取birthDay属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getBirthDay() {
        return birthDay;
    }

    /**
     * 设置birthDay属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setBirthDay(Date value) {
        this.birthDay = value;
    }

    /**
     * 获取gender属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Gender }
     *     
     */
    public Gender getGender() {
        return gender;
    }

    /**
     * 设置gender属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Gender }
     *     
     */
    public void setGender(Gender value) {
        this.gender = value;
    }

    /**
     * 获取name属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * 设置name属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
