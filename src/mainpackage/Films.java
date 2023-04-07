package mainpackage;

public class Films {
    // Attributes
    private int filmId;
    private String filmTitle;
    private String filmCategory;
    private String filmDescription;
    private int requiredAge;

    // Constructor
    public Films(int filmId, String filmTitle, String filmCategory, String filmDescription, int requiredAge) {
        this.filmId = filmId;
        this.filmTitle = filmTitle;
        this.filmCategory = filmCategory;
        this.filmDescription = filmDescription;
        this.requiredAge = requiredAge;
    }

    // Getters and Setters
    public int getFilmId() {
        return filmId;
    }

    public void setFilmId(int filmId) {
        this.filmId = filmId;
    }

    public String getFilmTitle() {
        return filmTitle;
    }

    public void setFilmTitle(String filmTitle) {
        this.filmTitle = filmTitle;
    }

    public String getFilmCategory() {
        return filmCategory;
    }

    public void setFilmCategory(String filmCategory) {
        this.filmCategory = filmCategory;
    }

    public String getFilmDescription() {
        return filmDescription;
    }

    public void setFilmDescription(String filmDescription) {
        this.filmDescription = filmDescription;
    }
    
    public int getRequiredAge() {
        return requiredAge;
    }

    public void requiredAge(int requiredAge) {
        this.requiredAge = requiredAge;
    }
}
