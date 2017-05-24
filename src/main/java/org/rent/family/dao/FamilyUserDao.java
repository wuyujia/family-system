package org.rent.family.dao;

import org.rent.family.domain.FamilyUser;
import org.rent.family.mapper.FamilyUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Copyright © 2017北京联合倍全电子商务有限公司. All rights reserved.
 *
 * @Prject: family-record
 * @Package: org.rent.family.dao
 * @Description: TODO
 * @author: wuyujia
 * @Date: 2017/5/24 23:11
 * @version: V1.0
 */
@Repository
public class FamilyUserDao {

    @Autowired
    private FamilyUserMapper familyUserMapper;

    /**
     * 查询一个用户
     * @param uid
     * @return
     */
    public FamilyUser findOne(Integer uid){
        return familyUserMapper.findOne(uid);
    }
}
