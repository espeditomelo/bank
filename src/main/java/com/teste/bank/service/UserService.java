package com.teste.bank.service;

import com.teste.bank.domain.model.User;

public interface UserService {

    public User findById(Long id);

    public User create(User userToCreate);
}
