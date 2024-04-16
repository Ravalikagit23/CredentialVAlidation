package com.restfulweb.demowebproject.service;

import com.restfulweb.demowebproject.dao.UserDao;
import com.restfulweb.demowebproject.model.UserLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
@Component
public class UserService {
    @Autowired
    UserDao userDao;

    public ResponseEntity<String> createUser(@RequestBody UserLogin user1) {

    userDao.save(user1);
        return new ResponseEntity<>("Sucess",HttpStatus.OK);
    }
}
