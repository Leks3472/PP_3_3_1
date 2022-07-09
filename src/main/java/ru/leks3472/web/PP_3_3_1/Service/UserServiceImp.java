package ru.leks3472.web.PP_3_3_1.Service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.leks3472.web.PP_3_3_1.dao.UserDao;
import ru.leks3472.web.PP_3_3_1.models.User;


import java.util.List;

@Service
public class UserServiceImp implements UserService{

    private UserDao userDao;

    public UserServiceImp(UserDao userDao) {
       this.userDao = userDao;
    }

    @Override
    @Transactional(readOnly = true)
    public List<User> index() {
        return userDao.index();
    }

    @Override
    @Transactional(readOnly = true)
    public User show(int id) {
        return userDao.show(id);
    }

    @Override
    @Transactional
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    @Transactional
    public void update(User updatedUser) {
        userDao.update(updatedUser);
    }

    @Override
    @Transactional
    public void delete(int id) {
        userDao.delete(id);
    }
}