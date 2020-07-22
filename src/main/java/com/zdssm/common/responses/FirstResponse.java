package com.zdssm.common.responses;

import lombok.Getter;
import lombok.Setter;

/**
 * @Author zd
 * @Date 2020/7/22 19:58
 **/


@Getter
@Setter
public class FirstResponse extends BaseResponse {

    Object data;

    public FirstResponse(){}

    public FirstResponse(int status, String message,Object data) {
        super(status, message);
        this.data = data;
    }
}
