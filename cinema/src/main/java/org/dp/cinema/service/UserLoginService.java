package org.dp.cinema.service;

import org.dp.cinema.dao.impl.UserDAOImpl;
import org.dp.cinema.model.UserModel;
import org.dp.cinema.utils.EncodedMatcher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserLoginService {

    private UserDAOImpl userDAO;

    @Autowired
    public void setUserDAO(UserDAOImpl userDAO) {
        this.userDAO = userDAO;
    }

    public boolean checkUserLoginProcess(String email, String pass) {
        UserModel user = userDAO.get(email);
        return EncodedMatcher.matches(pass, user.getUserPassword());
    }




}
