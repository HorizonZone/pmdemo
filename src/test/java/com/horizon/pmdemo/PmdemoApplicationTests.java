package com.horizon.pmdemo;

import com.horizon.pmdemo.mapper.PMMapper;
import com.horizon.pmdemo.model.PM;
import com.horizon.pmdemo.utils.ReadFiles;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class PmdemoApplicationTests {

    @Autowired
    PMMapper pmMapper;

    SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");

    @Test
    public void findById() {
        System.out.println(pmMapper.findById(5572));
    }
    @Test
    public void writeOne() throws ParseException {
        PM pm = new PM();
        pm.setNo("170700000000001017020");
        pm.setDeviceId("170700000000001");
        pm.setMpId("017020");
        pm.setSignalNumber("000");
        pm.setMpDes("门碰告警");
        pm.setMpType("4");
        pm.setCurTime(sdf.parse("20210708172517"));
        pm.setCurValue(1);
        System.out.println(pm);
        pmMapper.addPM(pm);
    }
    @Test
    public void getPreValue() throws ParseException {
        System.out.println(pmMapper.findPreRecord("020100000000001002307",sdf.parse("20210708235817")));
    }
    @Test
    public void getDifValue() throws ParseException {
        Date preHour = pmMapper.getPreHour(-5,11075);
        PM pm = pmMapper.findPreRecord("020100000000001002307", preHour);
        Double a = pmMapper.getValueByNoAndTime("020100000000001002307", sdf.parse("20210708235817"));
                Double b =  pm.getCurValue();
        System.out.println(a+ "+" + b);
        System.out.println(a-b);
    }
    @Test
    public void write() throws IOException, ParseException {
        ReadFiles readFiles = new ReadFiles();
        List<PM> list = readFiles.importFile("C:\\Users\\LX\\Documents\\WeChat Files\\Zxh867565726\\FileStorage\\File\\2021-07\\PM_20202004187363_202107081723.csv", 1000);
        pmMapper.addPMs(list);
    }
    @Test
    void contextLoads() {

    }

}
