package mainpackage;

public class Customers extends Users {
    // Attributes
    private String reservationId;

    // Constructor
    public Customers(String name, String username, String password, String email, String reservationId) {
        super(name, username, password, email);
        this.reservationId = reservationId;

    // Getters and Setters
    public String getReservationId() {
        return reservationId;
    }

    public void setReservationId(String reservationId) {
        this.reservationId = reservationId;
    }

    // Methods
    public void showAvailableFilms() {
       
    }

    public void makeReservation() {
    
    }

    public void viewReservation() {
    
    }
        
    public void updatePersonalInfo(){
    }

}
