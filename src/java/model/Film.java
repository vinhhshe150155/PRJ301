
package model;

import java.sql.Date;

public class Film{
    private int filmID;
    private String name, film_image, daodien, actor;
    private int category_id;
    private String date_release, film_start_date, film_end_date;
    private int duration;
    private String languages;
    private String film_description;

    public Film() {
    }

    public Film(int filmID, String name, String film_image, String daodien, String actor, int category_id, String date_release, String film_start_date, String film_end_date, int duration, String languages, String film_description) {
        this.filmID = filmID;
        this.name = name;
        this.film_image = film_image;
        this.daodien = daodien;
        this.actor = actor;
        this.category_id = category_id;
        this.date_release = date_release;
        this.film_start_date = film_start_date;
        this.film_end_date = film_end_date;
        this.duration = duration;
        this.languages = languages;
        this.film_description = film_description;
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

    public String getDaodien() {
        return daodien;
    }

    public void setDaodien(String daodien) {
        this.daodien = daodien;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
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

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public String getFilm_description() {
        return film_description;
    }

    public void setFilm_description(String film_description) {
        this.film_description = film_description;
    }

    @Override
    public String toString() {
        return actor+" "+ filmID+" "+film_end_date+"\n"; //To change body of generated methods, choose Tools | Templates.
    }

    

}
