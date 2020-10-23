package com.example.android_eventbus_test;

public class MessageEventBus {
    private String message;

    public MessageEventBus(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
