package com.mycscode.sms.login.model;

public class Errors {
    private String type;
    private String message;
    public Errors() {
    }
    public Errors(String type, String message) {
        this.type = type;
        this.message = message;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    @Override
    public String toString() {
        return "Error [message=" + message + ", type=" + type + "]";
    }

    
}
