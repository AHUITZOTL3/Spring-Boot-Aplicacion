package com.ahuigarBlog.aplicacion.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ahuigarBlog.aplicacion.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{

}
