package com.notification.userservice.service;

import com.notification.userservice.dto.UserRequest;

public interface KafkaService {
    void kafkaProducer(UserRequest request);
}
