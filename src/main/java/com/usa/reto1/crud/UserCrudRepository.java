package com.usa.reto1.crud;

import java.util.Optional;

import com.usa.reto1.model.User;

import org.springframework.data.repository.CrudRepository;


public interface UserCrudRepository extends CrudRepository<User, Integer> {
    // Buscar un registro por id
    Optional<User> findByEmail(String email);
    // Buscar un registro por email and password
    Optional<User> findByEmailAndPassword(String email, String password);
}
