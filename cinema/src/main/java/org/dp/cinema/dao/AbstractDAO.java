package org.dp.cinema.dao;

import org.dp.cinema.entity.CinemaEntity;

import java.util.List;

public interface AbstractDAO {

    List<? extends CinemaEntity> getAll();

}
