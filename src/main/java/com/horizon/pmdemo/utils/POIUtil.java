package com.horizon.pmdemo.utils;

import com.horizon.pmdemo.model.PM;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class POIUtil {
    public static List<PM> excel2PM(MultipartFile file) {
        List<PM> list = new ArrayList<>();
        PM pm = null;
        try{

            HSSFWorkbook workbook = new HSSFWorkbook(file.getInputStream());
            int numberOfSheets = workbook.getNumberOfSheets();
            for (int i = 0; i < numberOfSheets; i++) {
                HSSFSheet sheet = workbook.getSheetAt(i);
                int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
                for (int j = 0; j < physicalNumberOfRows; j++) {
                    if(j == 0) {
                        continue;
                    }
                    HSSFRow row = sheet.getRow(j);
                    if(row == null) {
                        continue;
                    }
                    int physicalNumberOfCells = row.getPhysicalNumberOfCells();
                    pm = new PM();
                    for (int k = 0; k < physicalNumberOfCells; k++) {
                        HSSFCell cell = row.getCell(k);
                        switch (cell.getCellType()) {
                            case STRING:
                                String stringValue = cell.getStringCellValue();
                                switch (k) {
                                    case 1:
                                        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
                                        pm.setCurTime(sdf.parse(stringValue)); break;
                                    case 2: pm.setDeviceId(stringValue); break;
                                    case 3: pm.setMpId(stringValue); break;
                                    case 4: pm.setSignalNumber(stringValue); break;
                                    case 5: pm.setMpDes(stringValue); break;
                                    case 6: pm.setMpType(stringValue); break;
                                }
                                break;
                            default: {
                                if(k == 7) {
                                    pm.setCurValue(cell.getNumericCellValue());
                                }
                            }
                            break;
                        }
                    }
                    pm.setNo(pm.getDeviceId()+pm.getMpId());
                    CalculateUtil calculateUtil = new CalculateUtil();
                    double[]  dif = calculateUtil.calDif(pm.getNo(), pm.getCurTime());
                    pm.setDifHour(dif[0]);
                    pm.setDifDay(dif[1]);
                    pm.setDifMonth(dif[2]);
                    pm.setDifYear(dif[3]);
                    list.add(pm);
                }
            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
        return list;
    }
}
