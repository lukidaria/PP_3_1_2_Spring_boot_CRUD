package com.example.pp_3_1_2_spring_boot_crud.service;


import com.example.pp_3_1_2_spring_boot_crud.dao.UserDao;
import com.example.pp_3_1_2_spring_boot_crud.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User add(User user) {
        return userDao.add(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    public void delete(Long userId) {
        userDao.delete(userId);

    }

    @Override
    public User getUser(Long id) {
        return userDao.getUser(id);
    }

    @Override
    public void update(User user) {
        userDao.update(user);

    }
}
