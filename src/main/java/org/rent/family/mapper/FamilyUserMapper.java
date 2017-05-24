package org.rent.family.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.rent.family.domain.FamilyUser;
import org.springframework.cache.annotation.Cacheable;

/**
 * Copyright © 2017北京联合倍全电子商务有限公司. All rights reserved.
 *
 * @Prject: family-record
 * @Package: org.rent.family.mapper
 * @Description: TODO
 * @author: wuyujia
 * @Date: 2017/5/24 23:05
 * @version: V1.0
 */
@Mapper
public interface FamilyUserMapper {

    @Select("SELECT * FROM family_user WHERE username = #{username} AND password = #{password}")
    FamilyUser findFamilyUserByUnameAndPwd(@Param("username") String username, @Param("password") String password);

    @Select("SELECT * FROM family_user WHERE uid = #{uid}")
    @Cacheable(value = "FamilyUserMapper.findOne", key = "'UID' + #p0")
    FamilyUser findOne(@Param("uid") Integer uid);
}
