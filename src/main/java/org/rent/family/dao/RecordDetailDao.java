package org.rent.family.dao;

import org.rent.family.mapper.RecordDetailMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by chenglong on 2017/5/24.
 */
@Repository
public class RecordDetailDao {
    @Autowired
    private RecordDetailMapper recordDetailMapper;

    /**
     * 查询所有的分账单记录
     * @return
     */
    public List findAllList(){
        return recordDetailMapper.findAllList();
    }
}
