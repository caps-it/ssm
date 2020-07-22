package com.zdssm.common.responses;


/**
 * @Author zd
 * @Date 2020/7/22 22:14
 **/
public final class HttpResponses {


    public static BaseResponse baseResponse(int status){
        return new BaseResponse(status,BaseResponseStatus.getMsgByStatus(status));
    }


    public static BaseResponse baseResponse(int status,Object object){
        return baseResponse(status,BaseResponseStatus.getMsgByStatus(status),object);
    }


    public static BaseResponse baseResponse(int status,String msg,Object data){

        FirstResponse response = new FirstResponse();
        response.setStatus(status);

        if(msg != null){
            response.setMsg(msg);
        }else{
            response.setMsg(BaseResponseStatus.getMsgByStatus(status));
        }
        response.setData(data);

        return response ;
    }
}
