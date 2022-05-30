package org.dp.cinema.dao.impl;

import org.dp.cinema.dao.AbstractDAO;
import org.dp.cinema.model.CustomerModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.util.List;
import java.util.Objects;

@Repository
public class CustomerDAOImpl implements AbstractDAO<CustomerModel> {

    private static final String SAVE_CUSTOMER = "insert into customers_info(cust_first_name, cust_last_name) values (?, ?)";

    JdbcTemplate jdbcTemplate;

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public CustomerModel get(String str) {
        return null;
    }

    @Override
    public List<CustomerModel> getAll() {
        return null;
    }

    @Override
    public Long save(CustomerModel customerModel) {
        KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update(connection -> {
            PreparedStatement ps = connection
                    .prepareStatement(SAVE_CUSTOMER);
            ps.setString(1, customerModel.getCustomerFirstName());
            ps.setString(2, customerModel.getCustomerLastName());
            return ps;
        }, keyHolder);
        return Objects.requireNonNull(keyHolder.getKey()).longValue();
    }

    @Override
    public void delete(CustomerModel obj) {

    }
}
