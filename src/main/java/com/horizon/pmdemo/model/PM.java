package com.horizon.pmdemo.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.xml.soap.SAAJResult;
import java.util.Date;

public class PM {
    private int id;
    private String no;
    private String deviceId;
    private String mpId;
    private String signalNumber;
    private String mpDes;
    private String mpType;
    private String year;
    private String month;
    private String day;
    private String hour;
    @JsonFormat(pattern = "yyyy-MM-ss HH:mm:ss", timezone="Asia/Shanghai")
    private Date curTime;
    private double curValue;
    @JsonFormat(pattern = "yyyy-MM-ss HH:mm:ss", timezone="Asia/Shanghai")
    private Date preHour;
    private double preHourValue;
    private double difHour;
    @JsonFormat(pattern = "yyyy-MM-ss HH:mm:ss", timezone="Asia/Shanghai")
    private Date preDay;
    private double preDayValue;
    private double difDay;
    @JsonFormat(pattern = "yyyy-MM-ss HH:mm:ss", timezone="Asia/Shanghai")
    private Date preMonth;
    private double preMonthValue;
    private double difMonth;
    @JsonFormat(pattern = "yyyy-MM-ss HH:mm:ss", timezone="Asia/Shanghai")
    private Date preYear;
    private double preYearValue;
    private double difYear;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getMpId() {
        return mpId;
    }

    public void setMpId(String mpId) {
        this.mpId = mpId;
    }

    public String getSignalNumber() {
        return signalNumber;
    }

    public void setSignalNumber(String signalNumber) {
        this.signalNumber = signalNumber;
    }

    public String getMpDes() {
        return mpDes;
    }

    public void setMpDes(String mpDes) {
        this.mpDes = mpDes;
    }

    public String getMpType() {
        return mpType;
    }

    public void setMpType(String mpType) {
        this.mpType = mpType;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public Date getCurTime() {
        return curTime;
    }

    public void setCurTime(Date curTime) {
        this.curTime = curTime;
    }

    public double getCurValue() {
        return curValue;
    }

    public void setCurValue(double curValue) {
        this.curValue = curValue;
    }

    public Date getPreHour() {
        return preHour;
    }

    public void setPreHour(Date preHour) {
        this.preHour = preHour;
    }

    public double getPreHourValue() {
        return preHourValue;
    }

    public void setPreHourValue(double preHourValue) {
        this.preHourValue = preHourValue;
    }

    public double getDifHour() {
        return difHour;
    }

    public void setDifHour(double difHour) {
        this.difHour = difHour;
    }

    public Date getPreDay() {
        return preDay;
    }

    public void setPreDay(Date preDay) {
        this.preDay = preDay;
    }

    public double getPreDayValue() {
        return preDayValue;
    }

    public void setPreDayValue(double preDayValue) {
        this.preDayValue = preDayValue;
    }

    public double getDifDay() {
        return difDay;
    }

    public void setDifDay(double difDay) {
        this.difDay = difDay;
    }

    public Date getPreMonth() {
        return preMonth;
    }

    public void setPreMonth(Date preMonth) {
        this.preMonth = preMonth;
    }

    public double getPreMonthValue() {
        return preMonthValue;
    }

    public void setPreMonthValue(double preMonthValue) {
        this.preMonthValue = preMonthValue;
    }

    public double getDifMonth() {
        return difMonth;
    }

    public void setDifMonth(double difMonth) {
        this.difMonth = difMonth;
    }

    public Date getPreYear() {
        return preYear;
    }

    public void setPreYear(Date preYear) {
        this.preYear = preYear;
    }

    public double getPreYearValue() {
        return preYearValue;
    }

    public void setPreYearValue(double preYearValue) {
        this.preYearValue = preYearValue;
    }

    public double getDifYear() {
        return difYear;
    }

    public void setDifYear(double difYear) {
        this.difYear = difYear;
    }

    @Override
    public String toString() {
        return "PM{" +
                "id=" + id +
                ", no='" + no + '\'' +
                ", deviceId='" + deviceId + '\'' +
                ", mpId='" + mpId + '\'' +
                ", signalNumber='" + signalNumber + '\'' +
                ", mpDes='" + mpDes + '\'' +
                ", mpType='" + mpType + '\'' +
                ", year='" + year + '\'' +
                ", month='" + month + '\'' +
                ", day='" + day + '\'' +
                ", hour='" + hour + '\'' +
                ", curTime=" + curTime +
                ", curValue=" + curValue +
                ", preHour=" + preHour +
                ", preHourValue=" + preHourValue +
                ", difHour=" + difHour +
                ", preDay=" + preDay +
                ", preDayValue=" + preDayValue +
                ", difDay=" + difDay +
                ", preMonth=" + preMonth +
                ", preMonthValue=" + preMonthValue +
                ", difMonth=" + difMonth +
                ", preYear=" + preYear +
                ", preYearValue=" + preYearValue +
                ", difYear=" + difYear +
                '}';
    }
}
