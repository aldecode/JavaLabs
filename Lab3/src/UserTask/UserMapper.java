package UserTask;

public class UserMapper {
    public static UserDTO mapToDTO(User user){
        return new UserDTO(user.getName(), user.getAge(), user.getEmail());
    }
    public User mapToUser(UserDTO userDTO){
        return new User(userDTO.getName(), userDTO.getAge(), 0, 0, null, userDTO.getEmail());
    }
}
