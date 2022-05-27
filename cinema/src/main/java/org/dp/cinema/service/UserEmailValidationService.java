package org.dp.cinema.service;

import org.dp.cinema.dao.impl.UserDAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class UserEmailValidationService {

    private UserDAOImpl userDAO;

    @Autowired
    public void setUserDAO(UserDAOImpl userDAO) {
        this.userDAO = userDAO;
    }

    public boolean validateEmail(String email) {
        return Objects.nonNull(userDAO.getUserEmail(email));
    }

}
