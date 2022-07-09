package ru.leks3472.web.PP_3_3_1.dao;


import ru.leks3472.web.PP_3_3_1.models.User;

import java.util.List;

public interface UserDao {
    List<User> index();
    User show(int id);
    void save(User user);
    void update(User updatedUser);
    void delete(int id);
}
