// UserService.java

public class UserService {

    public UserService() {
        // Constructor for initializing the UserService
    }

    public User getUserById(int userId) {
        // Retrieve and return user information from the database
        // You would typically have more complex logic here
        return new User(userId, "John Doe");
    }

    public void updateUser(User user) {
        // Update user information in the database
        // You would typically have more complex logic here
        System.out.println("Updated user: " + user.getName());
    }
}
