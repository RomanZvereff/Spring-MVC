package org.dp.cinema.dao.impl;

import org.dp.cinema.dao.AbstractDAO;
import org.dp.cinema.dao.rowMapper.FilmsRowMapper;
import org.dp.cinema.model.CinemaEntity;
import org.dp.cinema.model.FilmEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;

@Repository
public class FilmDAOImpl implements AbstractDAO<FilmEntity> {

    private static final String GET_ALL_FILMS = "select * from now_in_cinema";

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<FilmEntity> getAll() {
        return jdbcTemplate.query(GET_ALL_FILMS, new FilmsRowMapper());
    }

    @Override
    public BigInteger save(FilmEntity filmEntity) {
        return null;
    }
}
