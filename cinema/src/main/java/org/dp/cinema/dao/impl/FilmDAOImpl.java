package org.dp.cinema.dao.impl;

import org.dp.cinema.dao.AbstractDAO;
import org.dp.cinema.dao.rowMapper.FilmsRowMapper;
import org.dp.cinema.model.FilmModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FilmDAOImpl implements AbstractDAO<FilmModel> {

    private static final String GET_ALL_FILMS = "select * from now_in_cinema";

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public FilmModel get(String str) {
        return null;
    }

    @Override
    public List<FilmModel> getAll() {
        return jdbcTemplate.query(GET_ALL_FILMS, new FilmsRowMapper());
    }

    @Override
    public Long save(FilmModel filmModel) {
        return null;
    }

    @Override
    public void delete(FilmModel obj) {

    }

}
