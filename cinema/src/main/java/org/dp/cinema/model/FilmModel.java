package org.dp.cinema.model;


import java.time.LocalDate;

public class FilmModel extends CinemaModel {

    private LocalDate startDate;
    private LocalDate endDate;
    private String filmName;
    private String filmPoster;
    private String filmTrailer;
    private String filmDesc;
    private String filmActors;
    private String filmGenres;

    public FilmModel() {
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public String getFilmPoster() {
        return filmPoster;
    }

    public void setFilmPoster(String filmPoster) {
        this.filmPoster = filmPoster;
    }

    public String getFilmTrailer() {
        return filmTrailer;
    }

    public void setFilmTrailer(String filmTrailer) {
        this.filmTrailer = filmTrailer;
    }

    public String getFilmDesc() {
        return filmDesc;
    }

    public void setFilmDesc(String filmDesc) {
        this.filmDesc = filmDesc;
    }

    public String getFilmActors() {
        return filmActors;
    }

    public void setFilmActors(String filmActors) {
        this.filmActors = filmActors;
    }

    public String getFilmGenres() {
        return filmGenres;
    }

    public void setFilmGenres(String filmGenres) {
        this.filmGenres = filmGenres;
    }

    @Override
    public String toString() {
        return "FilmEntity{" +
                "startDate=" + startDate +
                ", endDate=" + endDate +
                ", filmName='" + filmName + '\'' +
                ", filmPoster='" + filmPoster + '\'' +
                ", filmTrailer='" + filmTrailer + '\'' +
                ", filmDesc='" + filmDesc + '\'' +
                ", filmActors='" + filmActors + '\'' +
                ", filmGenres='" + filmGenres + '\'' +
                '}';
    }
}
