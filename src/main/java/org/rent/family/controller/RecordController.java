package org.rent.family.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.rent.annotation.Resubmit;
import org.rent.base.ParamsValidHandler;
import org.rent.base.ValidationUtils;
import org.rent.controller.ExceptionHandlerController;
import org.rent.exception.ValidationException;
import org.rent.family.controller.form.AddRecordDetailForm;
import org.rent.family.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;
import java.util.Map;

/**
 * Created by chenglong on 2017/5/24.
 */
@RestController
@RequestMapping("/record")
@Api("记录controller")
public class RecordController extends ExceptionHandlerController {

    @Autowired
    private ValidationUtils validationUtils;

    @Autowired
    private RecordService recordService;

    @RequestMapping("/list/recordDetailList")
    @ApiOperation(value = "查询所有的分账单记录", response = Map.class, produces = MediaType.APPLICATION_JSON_UTF8_VALUE, httpMethod = "GET")
    public Map<String, List> getRecordList() {
        return null;
    }

    /**
     * 记一笔
     */
    @RequestMapping(value = "/add/recordDetail", produces = MediaType.APPLICATION_JSON_UTF8_VALUE, method = RequestMethod.POST)
    @ApiOperation(value = "记一笔", response = String.class, produces = MediaType.APPLICATION_JSON_UTF8_VALUE, httpMethod = "POST")
    @Resubmit(seconds = 5)
    public String addRecordDetail(@Valid @ModelAttribute AddRecordDetailForm form, BindingResult br) throws ValidationException {
        ParamsValidHandler.create(validationUtils).handle(br);
        System.out.println(form);
        return null;
    }
}
