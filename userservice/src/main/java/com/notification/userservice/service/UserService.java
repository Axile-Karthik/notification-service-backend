package com.notification.userservice.service;

import com.notification.userservice.dto.UserRequest;

public interface UserService{

     void kafkaProducer(UserRequest request);


}
