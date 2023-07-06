package com.mogila.springbootmvchibernate.service;



import com.mogila.springbootmvchibernate.entity.User;

import java.util.List;

public interface UserService {

    public void saveUser(User user);

    public User getUserById(Integer id);

    public void deleteUser(Integer id);

    public User getUser(Integer id);

    public List<User> getAllUsers();
}
