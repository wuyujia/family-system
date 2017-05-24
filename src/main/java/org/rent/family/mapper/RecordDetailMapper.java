package org.rent.family.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

/**
 * Created by chenglong on 2017/5/24.
 */
@Mapper
public interface RecordDetailMapper {

    /**
     * 查询所有的分账单记录
     * @return
     */
    @Select("SELECT * FROM record_detail WHERE status!=0")
    public List findAllList();
}
