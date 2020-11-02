package org.note.mdm.exception;

import org.note.user.ResultCode;

public class BizException extends RuntimeException {
    private static final long serialVersionUID = 2863942771987879963L;

    private ResultCode resultCode;

    public BizException() {
    }

    public BizException(ResultCode resultCode) {
        this.resultCode = resultCode;
    }

    public BizException(String message) {
        super(message);
    }

    public BizException(Throwable cause) {
        super(cause);
    }

    public BizException(ResultCode resultCode,Throwable cause) {
        super(cause);
        this.resultCode = resultCode;
    }

    public BizException(String message, Throwable cause) {
        super(message,cause);
    }

    public ResultCode getResultCode() {
        return resultCode;
    }
}
