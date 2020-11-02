package org.note.user;

import java.io.Serializable;

public class ResultInfo<T> implements Serializable {
    private static final long serialVersionUID = -661691749587872714L;
    private Integer code;
    private String message;
    private T data;

    public ResultInfo() {
    }

    public ResultInfo(Integer code,String message,T data) {
        this.message = message;
        this.code = code;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
