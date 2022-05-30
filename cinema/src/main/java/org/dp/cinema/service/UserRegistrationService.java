package org.dp.cinema.service;

import org.dp.cinema.dao.impl.UserDAOImpl;
import org.dp.cinema.model.UserModel;
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

    public Long setUserDetails(String email, String pass) {
        UserModel userModel = new UserModel();
        userModel.setUserEmail(email);
        userModel.setUserPassword(encryptUserData(pass));
        return userDAO.save(userModel);
    }

    private String encryptUserData(String str) {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        return bCryptPasswordEncoder.encode(str);
    }

}
