package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    void create(User user);
    List<User> index();
    User read(int id);
    void update(int id, User updatedUser);
    void delete(int id);
}
