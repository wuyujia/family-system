package org.rent.base;

import org.rent.constant.ExceptionCode;
import org.rent.exception.ValidationException;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;


/**
 * Created by wuyujia on 2017/4/16.
 */
@Component("validationUtils")
public class ValidationUtils {

    public String checkFieldError(BindingResult br) throws ValidationException {
//        logger.info(br.getTarget().getClass().getName());
//        logger.info(JSONUtil.objToStr(br.getTarget()));
        if (br.hasFieldErrors()) {
            String error = br.getFieldError().getDefaultMessage();
            throw new ValidationException(ExceptionCode.Validation.VO_VALID_ERROR_CODE, error);
        }
        return null;
    }
}
