package com.wynx.wynx.ds;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Song {
    @Id
    public String name;
    public String movieName;
    public double songDuration;
    public String casting;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }


    public double getSongDuration() {
        return songDuration;
    }

    public void setSongDuration(double songDuration) {
        this.songDuration = songDuration;
    }

    public String getCasting() {
        return casting;
    }

    public void setCasting(String casting) {
        this.casting = casting;
    }
}
