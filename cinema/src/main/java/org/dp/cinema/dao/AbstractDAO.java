package org.dp.cinema.dao;

import org.dp.cinema.model.CinemaModel;

import java.util.List;

public interface AbstractDAO<T extends CinemaModel> {

    T get(String str);

    List<T> getAll();

    Long save(T obj);

    void delete(T obj);



}
