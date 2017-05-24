package org.rent.family.service;

import org.rent.family.dao.FamilyUserDao;
import org.rent.family.domain.FamilyUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Copyright © 2017北京联合倍全电子商务有限公司. All rights reserved.
 *
 * @Prject: family-record
 * @Package: org.rent.family.service
 * @Description: TODO
 * @author: wuyujia
 * @Date: 2017/5/24 23:14
 * @version: V1.0
 */
@Service
public class UserService {

    @Autowired
    private FamilyUserDao familyUserDao;

    public FamilyUser findFamilyUserById(Integer uid){
        return familyUserDao.findOne(uid);
    }
}
