package com.longxl.demo;

public class MyException extends Exception {
    int errorCode;

    public int getErrorCode() {
        return errorCode;
    }

    public MyException() {
        super();
    }

    public MyException(int errorCode, String str) {
        super(str);
        this.errorCode = errorCode;
    }
}
