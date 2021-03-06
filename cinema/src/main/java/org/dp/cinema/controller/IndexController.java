package org.dp.cinema.controller;

import org.dp.cinema.dao.impl.FilmDAOImpl;
import org.dp.cinema.model.FilmModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class IndexController {

    FilmDAOImpl filmDAOImpl;

    @Autowired
    public void setFilmDAOImpl(FilmDAOImpl filmDAOImpl) {
        this.filmDAOImpl = filmDAOImpl;
    }

    @GetMapping(value = "/")
    public String getHelloView(Model model) {

        List<FilmModel> filmModelList = filmDAOImpl.getAll();

//        filmEntityList.forEach(System.out::println);

        model.addAttribute("films", filmModelList);

        return "index";
    }

}
