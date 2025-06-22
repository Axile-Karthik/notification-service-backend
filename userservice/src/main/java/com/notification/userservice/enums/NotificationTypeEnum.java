package com.notification.userservice.enums;

import lombok.Getter;

@Getter
public enum NotificationTypeEnum {
    EMAIL("email"),
    SMS("sms");

    private final String type;

    NotificationTypeEnum(String type) {
        this.type = type;
    }


    public static NotificationTypeEnum getString(String input) {
        for (NotificationTypeEnum value : NotificationTypeEnum.values()) {
            if (value.type.equalsIgnoreCase(input)) {
                return value;
            }
        }
        throw new IllegalArgumentException("Unknown notification type: " + input);
    }
}
