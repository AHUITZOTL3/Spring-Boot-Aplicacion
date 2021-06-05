package com.ahuigarBlog.aplicacion.service;

import javax.validation.Valid;

import com.ahuigarBlog.aplicacion.entity.User;

public interface UserService {

	public Iterable<User> getAllUsers();

	public User createUser(User user) throws Exception;
}
