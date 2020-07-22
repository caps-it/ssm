package com.zdssm.common.exception.handle;

import com.zdssm.common.exception.BaseException;
import com.zdssm.common.responses.BaseResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author zd
 * @Date 2020/7/22 23:09
 **/
public class ExceptionHandle {

    @ExceptionHandler(value = BaseException.class)
    @ResponseBody
    public BaseResponse handle(BaseException e) {
        return e.doException();
    }
}
