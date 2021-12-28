package lotion2morrow.model;

import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class TVEpisodes {

    private String name;
    private String date;
    private String creator;
    private List<String> stars;
    private List<String> genre;
    private String release;
    private String rating;
    private String story;
    private HashMap<String, List<String>> seasonAndEpisodes;
    private String lastUpdated;

    public TVEpisodes() {
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

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
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

    public HashMap<String, List<String>> getSeasonAndEpisodes() {
        return seasonAndEpisodes;
    }

    public void setSeasonAndEpisodes(HashMap<String, List<String>> seasonAndEpisodes) {
        this.seasonAndEpisodes = seasonAndEpisodes;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TVEpisodes)) return false;
        TVEpisodes that = (TVEpisodes) o;
        return Objects.equals(getName(), that.getName())
                && Objects.equals(getDate(), that.getDate())
                && Objects.equals(getCreator(), that.getCreator())
                && Objects.equals(getStars(), that.getStars())
                && Objects.equals(getGenre(), that.getGenre())
                && Objects.equals(getRelease(), that.getRelease())
                && Objects.equals(getRating(), that.getRating())
                && Objects.equals(getSeasonAndEpisodes(), that.getSeasonAndEpisodes())
                && Objects.equals(getLastUpdated(), that.getLastUpdated());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(),
                getDate(),
                getCreator(),
                getStars(),
                getGenre(),
                getRelease(),
                getRating(),
                getSeasonAndEpisodes(),
                getLastUpdated());
    }

    @Override
    public String toString() {
        return "TVEpisodes{" +
                "name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", story='" + story + '\'' +
                '}';
    }

}
