package org.dp.cinema.dao;

import org.dp.cinema.model.CinemaEntity;

import java.util.List;

public interface AbstractDAO {

    List<? extends CinemaEntity> getAll();



}
