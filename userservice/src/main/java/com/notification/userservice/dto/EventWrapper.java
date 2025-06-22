package com.notification.userservice.dto;

import com.notification.userservice.enums.EventTypeEnum;

public record EventWrapper(
        EventTypeEnum type,
        NotificationDetails notification
) {}
