package com.restfulweb.demowebproject.service;

import com.restfulweb.demowebproject.dao.UserDao;
import com.restfulweb.demowebproject.model.UserLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

@Service
@Component
public class UserService {
    @Autowired
    UserDao userDao;

    public ResponseEntity<String> createUser(@RequestBody UserLogin user1) {

    userDao.save(user1);
        return new ResponseEntity<>("Sucess",HttpStatus.OK);
    }

    public ResponseEntity<String> getUser(String userName) {


       Optional<UserLogin> userLoginOptional=userDao.findById(userName);//Asking

        //if userLoginOptional has data return success
        if(userLoginOptional.isPresent()){
            return new ResponseEntity<>("success",HttpStatus.OK);
        }
       else { //else return unsuccess

            return new ResponseEntity<>("unSucessful", HttpStatus.BAD_REQUEST);
        }
    }

    }
