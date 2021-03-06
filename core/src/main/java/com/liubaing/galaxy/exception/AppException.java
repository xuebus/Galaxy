package com.liubaing.galaxy.exception;

/**
 * 类说明:所有异常基类，运行时异常不强制捕捉
 *
 * @author heshuai
 * @version 2012-11-2
 */
public class AppException extends RuntimeException {

    public AppException() {
        super();
    }

    public AppException(String msg) {
        super(msg);
    }

    public AppException(Throwable cause) {
        super(cause);
    }

    public AppException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
