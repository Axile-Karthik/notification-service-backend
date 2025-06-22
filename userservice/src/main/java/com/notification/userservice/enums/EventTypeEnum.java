package com.notification.userservice.enums;

import lombok.Getter;

@Getter
public enum EventTypeEnum {
    OTP("OTP"),
    MESSAGE("MESSAGE");

    private final String type;

    EventTypeEnum(String type) {
        this.type = type;
    }

    public static EventTypeEnum fromString(String input) {
        for (EventTypeEnum value : EventTypeEnum.values()) {
            if (value.getType().equalsIgnoreCase(input)) {
                return value;
            }
        }
        throw new IllegalArgumentException("Unknown event type: " + input);
    }
}
