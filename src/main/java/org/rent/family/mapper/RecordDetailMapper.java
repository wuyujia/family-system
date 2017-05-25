package org.rent.family.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.rent.family.domain.RecordDetail;

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
    List findAllList();

    /**
     * 查询AA记录详情
     * @param id
     * @return
     */
    @Select("SELECT * FROM record_detail WHERE record_id = #{id} AND status != 0")
    List<RecordDetail> findRecordDetailListByRecordId(Integer id);
}
