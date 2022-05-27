package org.dp.cinema.dao.impl;

import org.dp.cinema.dao.AbstractDAO;
import org.dp.cinema.model.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.sql.PreparedStatement;
import java.util.List;

@Repository
public class UserDAOImpl implements AbstractDAO<UserEntity> {

    private static final String SAVE_USER = "insert into users_info(user_login, user_password, user_role) values (?, ?, ?)";
    private static final String SAVE_CUSTOMER = "insert into customers_info(cust_first_name, cust_last_name) values (?, ?)";
    private static final String GET_EMAIL = "select user_id from users_info where user_login = ?";

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<UserEntity> getAll() {
        return null;
    }

    @Override
    public BigInteger save(UserEntity userEntity) {
        userSave(userEntity);
        return customerSave(userEntity);
    }

    private BigInteger userSave(UserEntity userEntity) {
//        KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update(connection -> {
            PreparedStatement ps = connection
                    .prepareStatement(SAVE_USER);
            ps.setString(1, userEntity.getUserEmail());
            ps.setString(2, userEntity.getUserPassword());
            ps.setString(3, "USER");
            return ps;
        });
//        }, keyHolder);
        return null; //BigInteger.valueOf((long)Objects.requireNonNull(keyHolder.getKey()));
    }

    private BigInteger customerSave(UserEntity userEntity) {
//        KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update(connection -> {
            PreparedStatement ps = connection
                    .prepareStatement(SAVE_CUSTOMER);
            ps.setString(1, userEntity.getUserFirstName());
            ps.setString(2, userEntity.getUserLastName());
            return ps;
        });
//        }, keyHolder);
        return null; //BigInteger.valueOf((long)Objects.requireNonNull(keyHolder.getKey()));
    }

    public String getUserEmail(String email) {
        try {
            return jdbcTemplate.queryForObject(GET_EMAIL, new Object[]{email}, String.class);
        } catch (EmptyResultDataAccessException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

}

