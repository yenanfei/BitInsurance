package com.project.dao.daointerface;

import com.project.model.Record;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by ZZDELY on 2017/9/3.
 */
public interface RecordDao {
    void InsertRecord(Record record);
    List<Record>FindRecord();
    List<Record> FindRecordbyUserid(String from);
    Record FindRecordfortop();
}
