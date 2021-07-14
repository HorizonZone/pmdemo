package com.horizon.pmdemo.utils;

import com.horizon.pmdemo.mapper.PMMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Calendar;
import java.util.Date;

public class CalculateUtil {
    @Autowired
    PMMapper pmMapper;

    Calendar ca = Calendar.getInstance();
    private double nowValue = 0;
    private double preValue = 0;

    public double[] calDif(String no, Date time) {
        double[] dif = new double[4];
        nowValue = pmMapper.getValueByNoAndTime(no, time);
        dif[0] = nowValue - getPreHourValue(no, time);
        dif[1] = nowValue - getPreDayValue(no, time);
        dif[2] = nowValue - getPreMonthValue(no, time);
        dif[3] = nowValue - getPreYearValue(no, time);
        return dif;
    }

    private double getPreHourValue(String no, Date time) {
        ca.setTime(time);
        ca.add(Calendar.HOUR, -1);
        return pmMapper.getValueByNoAndTime(no, time);
    }
    private double getPreDayValue(String no, Date time) {
        ca.setTime(time);
        ca.add(Calendar.DAY_OF_MONTH, -1);
        return pmMapper.getValueByNoAndTime(no, time);
    }
    private double getPreMonthValue(String no, Date time) {
        ca.setTime(time);
        ca.add(Calendar.MONTH, -1);
        return pmMapper.getValueByNoAndTime(no, time);
    }
    private double getPreYearValue(String no, Date time) {
        ca.setTime(time);
        ca.add(Calendar.YEAR, -1);
        return pmMapper.getValueByNoAndTime(no, time);
    }
}
