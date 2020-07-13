package com.blog.common.lang;

import lombok.Data;

import java.io.Serializable;
@Data
public class Result implements Serializable {
    private int code;//200为正常，非200异常
    private String message;
    private Object data;

    public static Result succ(Object data){
        return succ(200,"操作成功",data);
    }
    public static Result succ(int code,String message,Object data){
        Result r =new Result();
        r.setCode(code);
        r.setData(data);
        r.setMessage(message);
        return r;
    }
    public static Result fail(String msg){
        return fail(400,msg,null);
    }
    public static Result fail(String msg,Object data){
        return fail(400,msg,data);
    }
    public static Result fail(int code,String message,Object data){
        Result r =new Result();
        r.setCode(code);
        r.setData(data);
        r.setMessage(message);
        return r;
    }
}
