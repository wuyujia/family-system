package org.rent.utils;






import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by chenglong on 2017/5/25.
 * 数据判空操作
 */
public class ValidateUtils {

    /**
     * 判断list是否为空
     *
     * @param list
     * @return
     */
    public static Boolean ValidateListIsEmpty(List list) {
        Boolean flag = true;
        if (list == null) {
            flag = false;
        }
        if (list.size() <= 0) {
            flag = false;
        }
        for (Object o : list) {
            if (o == null) {
                flag = false;
                break;
            }
        }
        return flag;

    }

    /**
     * 判断参数
     * @param params
     * @return
     */
    public static Boolean ValidateParams(Object... params) {
        Boolean flag  = false;
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("code", BackCodeEnum.BackCodeEnumSuccess.getCode());
        resultMap.put("message", BackCodeEnum.BackCodeEnum1.getMsg());
        for (Object object : params) {
            if (object == null){
                resultMap.put("code",BackCodeEnum.BackCodeEnum3.getCode());
                resultMap.put("message",BackCodeEnum.BackCodeEnum3.getMsg());
                flag = true;
                break;
            }
        }
        return flag;
    }

    /**
     * 参数为空时的返回值
     * @return
     */
    public static Map<String,Object> EmptyParamsBackCode(){
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("code",BackCodeEnum.BackCodeEnum3.getCode());
        resultMap.put("message",BackCodeEnum.BackCodeEnum3.getMsg());
        return resultMap;
    }

}
