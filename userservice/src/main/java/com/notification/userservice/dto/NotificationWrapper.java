package com.notification.userservice.dto;

import com.notification.userservice.enums.EventTypeEnum;

public record NotificationWrapper(
        EventTypeEnum type,
        EventDetails eventType,
        String eventTypeRaw,
        String message
) {}
