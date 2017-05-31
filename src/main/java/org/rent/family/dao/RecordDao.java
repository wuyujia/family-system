package org.rent.family.dao;

import org.rent.family.domain.Record;
import org.rent.family.domain.RecordDetail;
import org.rent.family.mapper.RecordMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

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

    /**
     * 查询多条AA分账单记录
     * @param recordIdList
     * @return
     */
    public List<RecordDetail> findListByIdList(List recordIdList) {
        return recordMapper.findListByIdList(recordIdList);
    }
}
