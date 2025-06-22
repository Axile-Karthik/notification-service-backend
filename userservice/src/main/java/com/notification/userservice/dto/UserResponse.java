package com.notification.userservice.dto;

public record UserResponse(String status,
                           String message,
                           Object data)
{
    public static UserResponse success(String message, Object data) {
        return new UserResponse("success", message, data);
    }

    public static UserResponse failure(String message) {
        return new UserResponse("failure", message, null);
    }

}
