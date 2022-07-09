package ru.leks3472.web.PP_3_3_1.Service;


import ru.leks3472.web.PP_3_3_1.models.User;

import java.util.List;

public interface UserService {
    List<User> index();
    User show(int id);
    void save(User user);
    void update(User updatedUser);
    void delete(int id);
}
