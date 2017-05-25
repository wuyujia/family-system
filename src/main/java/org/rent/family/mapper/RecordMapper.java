package org.rent.family.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.rent.family.domain.Record;

import java.util.List;

/**
 * Created by chenglong on 2017/5/24.
 */
@Mapper
public interface RecordMapper {

    /**
     * 查询所有的分账单记录
     * @return
     */
    @Select("SELECT * FROM record WHERE status!=0 AND id = #{id}")
    Record findOne(@Param("id") Integer id);
}
