
package com.dwarfeng.test.webservice.server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>date complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="date">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="day" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="month" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="year" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "date", propOrder = {
    "day",
    "month",
    "year"
})
public class Date {

    protected int day;
    protected int month;
    protected int year;

    /**
     * 获取day属性的值。
     * 
     */
    public int getDay() {
        return day;
    }

    /**
     * 设置day属性的值。
     * 
     */
    public void setDay(int value) {
        this.day = value;
    }

    /**
     * 获取month属性的值。
     * 
     */
    public int getMonth() {
        return month;
    }

    /**
     * 设置month属性的值。
     * 
     */
    public void setMonth(int value) {
        this.month = value;
    }

    /**
     * 获取year属性的值。
     * 
     */
    public int getYear() {
        return year;
    }

    /**
     * 设置year属性的值。
     * 
     */
    public void setYear(int value) {
        this.year = value;
    }

}
