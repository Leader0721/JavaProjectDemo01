package util;

import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by 83731 on 2017/11/26.
 */

//封装请求数据到JavaBean中
public class FillBeanUtil {
    public static <T> T fillBean(HttpServletRequest request,Class<T> clazz){
        try {
            T bean = clazz.newInstance();
            BeanUtils.copyProperties(bean, request.getParameterMap());
            return bean;
        }catch( Exception e) {
            throw new RuntimeException(e);
        }
    }
}
