package org.rent.family.dao;

import org.rent.family.domain.Record;
import org.rent.family.mapper.RecordMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by chenglong on 2017/5/25.
 */
@Repository
public class RecordDao {

    @Autowired
    private RecordMapper recordMapper;

    /**
     * 查询一条AA记录
     * @param id
     * @return
     */
    public Record findOneByRecordId(Integer id) {
        return recordMapper.findOne(id);
    }
}
