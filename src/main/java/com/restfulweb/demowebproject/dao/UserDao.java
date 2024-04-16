package com.restfulweb.demowebproject.dao;



import com.restfulweb.demowebproject.model.UserLogin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
@EnableJpaRepositories
public interface UserDao extends JpaRepository<UserLogin, String> {


}
