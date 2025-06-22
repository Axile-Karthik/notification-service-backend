package com.notification.userservice.dto;

public record UserRequest( String userId,
                           String userName,
                           NotificationWrapper notification,
                           EventWrapper event) {
}
