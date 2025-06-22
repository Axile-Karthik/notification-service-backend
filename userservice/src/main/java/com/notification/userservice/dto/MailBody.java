package com.notification.userservice.dto;

public record MailBody(
        String to,
        String cc,
        String bcc,
        String body
) {}

