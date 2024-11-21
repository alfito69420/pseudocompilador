package utils;

import java.util.ArrayList;
import java.util.List;

import static utils.MyStrings.*;

public class ErrorStack {
    private List<String> error;

    public ErrorStack(String error) {
        this.error = new ArrayList<>();
        this.error.add(error);
    } // close method

    public List<String> getErrorStack() {
        return error;
    } // close method

    public void cleanErrorStack() {
        error.clear();
    } // close method

    public void pushErrorStack(int code, int line) {
        String message = errorMessageSp(code);
        this.error.add(String.format("%d en la linea %d: %s", code, line, message));
        System.out.println(error);
    } // close method

    public void popErrorStack() {
        if (!error.isEmpty()) {
            error.removeLast();
        }
    } // close method

    private String errorMessageSp(int code) {
        switch (code) {
            case 101:
                return error501;
            case 102:
                return error502;
            case 103:
                return error503;
            case 200:
                return error420;
            case 301:
                return error421;
            case 302:
                return error422;
            case 303:
                return error423;
            case 304:
                return error424;
            case 305:
                return error425;
            default:
                return null;
        }
    } // close method
}
