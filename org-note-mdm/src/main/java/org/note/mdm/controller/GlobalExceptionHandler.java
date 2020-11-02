package org.note.mdm.controller;

import org.note.mdm.exception.BizException;
import org.note.user.ResultCode;
import org.note.user.ResultInfo;
import org.note.user.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class GlobalExceptionHandler {

    Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    /**
     * 处理自定义异常
     *
     * @param ex
     * @return
     */
    @ExceptionHandler(NullPointerException.class)
    public ResultInfo handleNullPointerException(NullPointerException ex) {
        return ResultUtil.fail(ResultCode.CONNECT_ERROR.getCode(),ex.getMessage(),null);
    }


    /**
     * 处理自定义异常
     *
     * @param ex
     * @return
     */
    @ExceptionHandler(BizException.class)
    public ResultInfo handleBizException(BizException ex) {
        return ResultUtil.fail(ex.getResultCode());
    }




    /**
     * 其他未知异常
     * @param ex
     * @return
     */
    @ExceptionHandler(value = Exception.class)
    public ResultInfo handleUnknownException(Exception ex) {
        logger.error(ex.getMessage(), ex);
        return ResultUtil.fail(ResultCode.UNKNOWN_ERROR);
    }



}
