package model;

import java.util.List;

public class Film{
    private int filmID;
    private String name, film_image;
    private String date_release, film_start_date, film_end_date;
    private int duration;
    private String film_description;
    private String trailer;
    private List<Language> language;
    private List<Actor> actor;
    private List<Category> category;
    private int rating;
    public Film() {
    }

    public Film(int filmID, String name, String film_image, String date_release, String film_start_date, String film_end_date, int duration, String film_description, String trailer) {
        this.filmID = filmID;
        this.name = name;
        this.film_image = film_image;
        this.date_release = date_release;
        this.film_start_date = film_start_date;
        this.film_end_date = film_end_date;
        this.duration = duration;
        this.film_description = film_description;
        this.trailer = trailer;
    }

    public int getFilmID() {
        return filmID;
    }

    public void setFilmID(int filmID) {
        this.filmID = filmID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFilm_image() {
        return film_image;
    }

    public void setFilm_image(String film_image) {
        this.film_image = film_image;
    }

    public String getDate_release() {
        return date_release;
    }

    public void setDate_release(String date_release) {
        this.date_release = date_release;
    }

    public String getFilm_start_date() {
        return film_start_date;
    }

    public void setFilm_start_date(String film_start_date) {
        this.film_start_date = film_start_date;
    }

    public String getFilm_end_date() {
        return film_end_date;
    }

    public void setFilm_end_date(String film_end_date) {
        this.film_end_date = film_end_date;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getFilm_description() {
        return film_description;
    }

    public void setFilm_description(String film_description) {
        this.film_description = film_description;
    }

    public String getTrailer() {
        return trailer;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }

    public void setLanguage(List<Language> language) {
        this.language = language;
    }

    public void setActor(List<Actor> actor) {
        this.actor = actor;
    }

    public void setCategory(List<Category> category) {
        this.category = category;
    }
    
    public List<Language> getLanguage(){
        return language;
    }
    public List<Actor> getActor(){
        return actor;
    }
    public List<Category> getCategory(){
        return category;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
    
}
