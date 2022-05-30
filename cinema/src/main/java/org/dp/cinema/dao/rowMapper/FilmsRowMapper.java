package org.dp.cinema.dao.rowMapper;

import org.dp.cinema.model.FilmModel;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class FilmsRowMapper implements RowMapper<FilmModel> {

    @Override
    public FilmModel mapRow(ResultSet resultSet, int i) throws SQLException {
        FilmModel filmModel = new FilmModel();
        filmModel.setStartDate(resultSet.getDate("start_date").toLocalDate());
        filmModel.setEndDate(resultSet.getDate("end_date").toLocalDate());
        filmModel.setFilmName(resultSet.getString("film_name"));
        filmModel.setFilmPoster(resultSet.getString("film_poster"));
        filmModel.setFilmTrailer(resultSet.getString("film_trailer"));
        filmModel.setFilmDesc(resultSet.getString("film_desc"));
        filmModel.setFilmActors(resultSet.getString("film_actors"));
        filmModel.setFilmGenres(resultSet.getString("film_genres"));
        return filmModel;
    }
}
