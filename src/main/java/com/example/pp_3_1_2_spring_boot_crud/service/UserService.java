package com.example.pp_3_1_2_spring_boot_crud.service;





import com.example.pp_3_1_2_spring_boot_crud.model.User;

import java.util.List;

public interface UserService {

    User add(User user);

    List<User> getAllUsers();

    void delete(Long userId);

    User getUser(Long id);

    void update(User user);
}
