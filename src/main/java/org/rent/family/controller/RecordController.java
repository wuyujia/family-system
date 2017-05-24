package org.rent.family.controller;

import io.swagger.annotations.ApiOperation;
import org.rent.family.domain.FamilyUser;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * Created by chenglong on 2017/5/24.
 */
@RestController
@RequestMapping("/record")
public class RecordController {

    @RequestMapping("/list/recordList")
    @ApiOperation(value = "查询所有的分账单记录", response = Map.class, produces = MediaType.APPLICATION_JSON_UTF8_VALUE, httpMethod = "GET")
    public Map<String,List> getRecordList(){
        return null;
    }
}
