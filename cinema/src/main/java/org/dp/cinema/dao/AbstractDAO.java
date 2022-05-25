package org.dp.cinema.dao;

import org.dp.cinema.model.CinemaEntity;

import java.math.BigInteger;
import java.util.List;

public interface AbstractDAO<T extends CinemaEntity> {

    List<T> getAll();

    BigInteger save(T obj);



}
