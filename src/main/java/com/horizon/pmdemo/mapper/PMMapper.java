package com.horizon.pmdemo.mapper;


import com.horizon.pmdemo.model.PM;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.List;

@Mapper
public interface PMMapper {
    Integer addPM(PM pm);
    Integer addPMs(@Param("list") List<PM> list);
    Double getValueByNoAndTime(@Param("no") String no, @Param("curtime") Date time);
    PM findPreRecord(@Param("no") String no, @Param("curtime") Date curtime);
    PM findById(int id);
    Date getPreHour(@Param("n") int n, @Param("id") int id);
    Date getPreDay(@Param("n") int n, @Param("id") int id);
    Date getPreMonth(@Param("n") int n, @Param("id") int id);
    Date getPreYear(@Param("n") int n, @Param("id") int id);
}
