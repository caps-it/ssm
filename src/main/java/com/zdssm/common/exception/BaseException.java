package com.zdssm.common.exception;

import com.zdssm.common.responses.BaseResponse;
import com.zdssm.common.responses.BaseResponseStatus;
import lombok.Getter;
import lombok.Setter;

/**
 * @Author zd
 * @Date 2020/7/22 23:05
 **/
@Setter
@Getter
public abstract class BaseException extends RuntimeException {

    private Integer code;
    private String message;


    public BaseException(BaseResponseStatus baseResponseStatus) {
        super(baseResponseStatus.getMsg());
        this.code = baseResponseStatus.getStatus();
    }

    public BaseException(BaseResponseStatus baseResponseStatus,String message){
        this.code = baseResponseStatus.getStatus();
        this.message = message;
    }

    //抽象基类异常可由子类自由扩展
    public abstract BaseResponse doException();
}
