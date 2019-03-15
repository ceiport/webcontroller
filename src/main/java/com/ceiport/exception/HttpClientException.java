package com.ceiport.exception;

/**
 * http请求异常
 */
public class HttpClientException extends Exception {

    public HttpClientException(String msg) {
        super(msg);
    }
}
