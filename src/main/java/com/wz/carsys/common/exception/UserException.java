package com.wz.carsys.common.exception;


/**
 * @deprecated 会员异常 自定义异常
 */
public class UserException extends Exception {
    public UserException() {
        super();
    }
    public UserException(String msg) {
        super(msg);
    }
}
