package com.horizon.pmdemo.utils;

import com.horizon.pmdemo.mapper.PMMapper;
import com.horizon.pmdemo.model.PM;
import com.horizon.pmdemo.service.PMService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class ReadFiles {
    PM pm = null;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");

    public List importFile(String filePath, Integer size) throws IOException, ParseException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream(filePath), "GB2312");
        BufferedReader br = new BufferedReader(isr, 10*1024*1024);
        List<PM> list = new ArrayList<>();
        String line = null;
        String title = br.readLine();
        while ((line = br.readLine()) != null) {
            String[] arr = line.split(",");
            pm = new PM();
            pm.setYear(arr[1].substring(0, 4));
            pm.setMonth(arr[1].substring(0, 6));
            pm.setDay(arr[1].substring(0, 8));
            pm.setHour(arr[1].substring(0,10));
            pm.setCurTime(sdf.parse(arr[1]));
            pm.setDeviceId(arr[2]);
            pm.setMpId(arr[3]);
            pm.setSignalNumber(arr[4]);
            pm.setMpDes(arr[5]);
            pm.setMpType(arr[6]);
            pm.setCurValue(Double.valueOf(arr[7]));
            pm.setNo(arr[2] + arr[3]);
            list.add(pm);
            if(list.size() >= size) {
//                for (int i = 0; i < list.size(); i++) {
//                    PM pm = list.get(i);
//                    System.out.println(pm);
//                }
//                list.clear();
            }
        }
        if(list.size() > 0) {
//                for (int i = 0; i < list.size(); i++) {
//                    PM pm = list.get(i);
//                    System.out.println(pm);
//                }
//            list.clear();
        }
        return list;
    }
}
