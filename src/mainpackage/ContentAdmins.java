package mainpackage;

public class ContentAdmins extends Users {
    // Attributes
    private String adminId;
    private String cinemaId;

    // Constructor
    public ContentAdmins(String name, String username, String password, String email, String adminId, String cinemaId) {
        super(name, username, password, email);
        this.adminId = adminId;
        this.cinemaId = cinemaId;
    }
    // Getters and Setters
    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String AdminId) {
        this.adminId = adminId;
    }
    
    public String getCinemaId() {
        return cinemaId;
    }

    public void setCinemaId(String cinemaId) {
        this.cinemaId = cinemaId;
    }

    // Methods
    public void insertFilm() {
       
    }

    public void deleteFilm() {
       
    }

    public void assignFilmToCinema() {
       
    }
}
