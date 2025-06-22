package com.notification.userservice.dto;

import com.notification.userservice.enums.NotificationTypeEnum;

public record NotificationDetails(
        NotificationTypeEnum type,
        MailBody mailBody
) {}

