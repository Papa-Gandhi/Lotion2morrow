package lotion2morrow.model;

import java.util.List;
import java.util.Objects;

public class Movie {

    private String name;
    private String date;
    private String coverSrc;
    private String director;
    private List<String> stars;
    private List<String> genre;
    private String release;
    private String rating;
    private String story;
    private String videoSrc;

    public Movie() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCoverSrc() {
        return coverSrc;
    }

    public void setCoverSrc(String coverSrc) {
        this.coverSrc = coverSrc;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public List<String> getStars() {
        return stars;
    }

    public void setStars(List<String> stars) {
        this.stars = stars;
    }

    public List<String> getGenre() {
        return genre;
    }

    public void setGenre(List<String> genre) {
        this.genre = genre;
    }

    public String getRelease() {
        return release;
    }

    public void setRelease(String release) {
        this.release = release;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }

    public String getVideoSrc() {
        return videoSrc;
    }

    public void setVideoSrc(String videoSrc) {
        this.videoSrc = videoSrc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Movie)) return false;
        Movie movie = (Movie) o;
        return getName().equals(movie.getName()) && getDate().equals(movie.getDate()) && Objects.equals(getCoverSrc(), movie.getCoverSrc()) && getDirector().equals(movie.getDirector()) && getStars().equals(movie.getStars()) && getGenre().equals(movie.getGenre()) && getRelease().equals(movie.getRelease()) && Objects.equals(getRating(), movie.getRating()) && getStory().equals(movie.getStory()) && Objects.equals(getVideoSrc(), movie.getVideoSrc());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getDate(), getCoverSrc(), getDirector(), getStars(), getGenre(), getRelease(), getRating(), getStory(), getVideoSrc());
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", story='" + story + '\'' +
                '}';
    }
}
