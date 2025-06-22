package com.notification.userservice.controller;

import com.notification.userservice.dto.UserRequest;
import com.notification.userservice.dto.UserResponse;
import com.notification.userservice.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/notifications")
@Slf4j
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    public ResponseEntity<UserResponse> sendNotification(@RequestBody UserRequest request) {
     log.info("Received request : {}",request);
    userService.kafkaProducer(request);
     return ResponseEntity.ok(UserResponse.success("Notification received successfully", null));
    }
}
