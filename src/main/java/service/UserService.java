package service;

import Model.User;
import java.util.List;

public interface UserService {

    User getUserByEmail(String email);

    List<User> getAllUsers();

}
