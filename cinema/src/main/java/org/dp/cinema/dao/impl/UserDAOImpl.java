package org.dp.cinema.dao.impl;

import org.dp.cinema.dao.AbstractDAO;
import org.dp.cinema.dao.rowMapper.UserRowMapper;
import org.dp.cinema.model.UserModel;
import org.dp.cinema.model.UserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.List;
import java.util.Objects;

@Repository
public class UserDAOImpl implements AbstractDAO<UserModel> {

    private static final String SAVE_USER = "insert into users_info(user_login, user_password, user_role) values (?, ?, ?)";
    private static final String GET_EMAIL = "select user_id from users_info where user_login = ?";
    private static final String GET_USER = "select * from users_info where user_login = ?";

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public UserModel get(String str) {
        return jdbcTemplate.queryForObject(GET_USER, new Object[]{str}, new UserRowMapper());
    }

    @Override
    public List<UserModel> getAll() {
        return null;
    }

    @Override
    public Long save(UserModel userModel) {
        KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update(connection -> {
            PreparedStatement ps = connection
                    .prepareStatement(SAVE_USER, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, userModel.getUserEmail());
            ps.setString(2, userModel.getUserPassword());
            ps.setString(3, UserRole.USER.toString());
            return ps;
        }, keyHolder);
        return Objects.requireNonNull(keyHolder.getKey()).longValue();
    }

    public String getUserEmail(String email) {
        try {
            return jdbcTemplate.queryForObject(GET_EMAIL, new Object[]{email}, String.class);
        } catch (EmptyResultDataAccessException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public void delete(UserModel obj) {

    }
}

