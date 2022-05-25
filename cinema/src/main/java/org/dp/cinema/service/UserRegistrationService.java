package org.dp.cinema.service;

import org.dp.cinema.dao.impl.UserDAOImpl;
import org.dp.cinema.model.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserRegistrationService {

    UserDAOImpl userDAO;

    @Autowired
    public void setUserDAO(UserDAOImpl userDAO) {
        this.userDAO = userDAO;
    }

    public void setUserDetails(String firstName, String lastName, String email, String pass) {
        UserEntity userEntity = new UserEntity();
        userEntity.setUserFirstName(firstName);
        userEntity.setUserLastName(lastName);
        userEntity.setUserEmail(email);
        userEntity.setUserPassword(encryptUserData(pass));
        userDAO.save(userEntity);
    }

    private String encryptUserData(String str) {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        return bCryptPasswordEncoder.encode(str);
    }

}
