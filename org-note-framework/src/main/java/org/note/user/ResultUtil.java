package org.note.user;

public class ResultUtil {

    private ResultUtil() {
    }

    public static ResultInfo success(Object data) {
        return new ResultInfo(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMsg(), data);
    }

    public static ResultInfo fail(ResultCode resultCode) {
        return fail(resultCode.getCode(), resultCode.getMsg(), (Object) null);
    }

    public static ResultInfo fail(Integer resultCode, String resultMessage, Object data) {
        return new ResultInfo(resultCode, resultMessage, data);
    }

}
