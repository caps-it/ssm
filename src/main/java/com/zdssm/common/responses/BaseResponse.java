package com.zdssm.common.responses;


import lombok.Getter;
import lombok.Setter;


/**
 * @Author zd
 * @Date 2020/7/22 19:53
 **/


/**
 * 基础返回体
 */

@Setter
@Getter
public class BaseResponse {

    private int status;
    private String msg;

    public BaseResponse(){}

    public BaseResponse(int status, String msg) {
        this.status = status;
        this.msg = msg;
    }
}
