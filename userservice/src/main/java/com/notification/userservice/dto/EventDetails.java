package com.notification.userservice.dto;

import com.notification.userservice.enums.NotificationTypeEnum;

public record EventDetails(
        NotificationTypeEnum type,
        MailBody mailBody
) {}
