package mainpackage;

public class Customers extends Users {
    // Attributes
    private String reservationId;
    private int age;

    // Constructor
    public Customers(String name, String username, String password, String email, String reservationId, int age) {
        super(name, username, password, email);
        this.reservationId = reservationId;
        this.age = age;
    }

    // Getters and Setters
    public String getReservationId() {
        return reservationId;
    }

    public void setReservationId(String reservationId) {
        this.reservationId = reservationId;
    }
        
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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
