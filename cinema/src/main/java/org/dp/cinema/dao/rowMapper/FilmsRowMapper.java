package org.dp.cinema.dao.rowMapper;

import org.dp.cinema.entity.FilmEntity;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class FilmsRowMapper implements RowMapper<FilmEntity> {

    @Override
    public FilmEntity mapRow(ResultSet resultSet, int i) throws SQLException {

        FilmEntity filmEntity = new FilmEntity();
        filmEntity.setStartDate(resultSet.getDate("start_date").toLocalDate());
        filmEntity.setEndDate(resultSet.getDate("end_date").toLocalDate());
        filmEntity.setFilmName(resultSet.getString("film_name"));
        filmEntity.setFilmPoster(resultSet.getString("film_poster"));
        filmEntity.setFilmTrailer(resultSet.getString("film_trailer"));
        filmEntity.setFilmDesc(resultSet.getString("film_desc"));
        filmEntity.setFilmActors(resultSet.getString("film_actors"));
        filmEntity.setFilmGenres(resultSet.getString("film_genres"));

        return filmEntity;
    }
}
