package org.dp.cinema.dao.rowMapper;

import org.dp.cinema.model.UserModel;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRowMapper implements RowMapper<UserModel> {

    @Override
    public UserModel mapRow(ResultSet resultSet, int i) throws SQLException {
        UserModel userModel = new UserModel();
        userModel.setUserId(resultSet.getLong("user_id"));
        userModel.setUserEmail(resultSet.getString("user_login"));
        userModel.setUserPassword (resultSet.getString("user_password"));
        userModel.setUserRole(resultSet.getString("user_role"));
        return userModel;
    }
}
