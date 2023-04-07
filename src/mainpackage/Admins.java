package mainpackage;

public class Admins extends Users{
    // Attributes
    private String adminId;

    // Constructor
    public Admins(String name, String username, String password, String email, String adminId) {
        super(name, username, password, email);
        this.adminId = adminId;
    }

    // Getters and Setters
    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    // Methods
    public void createUser() {

    }

    public void updateUser() {

    }

    public void deleteUser() {

    }

    public void searchUser() {

    }

    public void viewAllUsers() {

    }

    public void registerAdmin() {

    } 
}
