package com.baidu.day28_boot_02._03_entry;

import java.io.Serializable;

public class R<T> implements Serializable {
    private static final long serialVersionUID = 1l;
    //状态码
    private int code;
    //消息
    private String msg;
    //数据
    private T data;

    public R() {
    }

    public R(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    //成功返回
    public static <T> R<T> sucess(T data) {

        return new R<>(200, "操作成功", data);
    }

    //失败返回
    public static <T> R<T> fail(String msg) {
        return new R<>(500, msg, null);
    }

    public int getCode() {
        return code;
    }


    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}