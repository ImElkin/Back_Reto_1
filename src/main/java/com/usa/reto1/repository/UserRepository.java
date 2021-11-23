package com.usa.reto1.repository;

import java.util.List;
import java.util.Optional;

import com.usa.reto1.crud.UserCrudRepository;
import com.usa.reto1.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class UserRepository {

    @Autowired // atributo de relacion 
    private UserCrudRepository userCrudRepository;

    public List<User> getAll(){
        return (List<User>) userCrudRepository.findAll();
    }
    public Optional <User> getUser (int id){
        return userCrudRepository.findById(id);
    }
    public User save (User user){
        return userCrudRepository.save(user);
    }
    public boolean existeEmail(String email){
        Optional<User> usuario = userCrudRepository.findByEmail(email);
        return  !usuario.isEmpty();
        // si existe es verdadero
        // falso si no eciste
    }
    public Optional<User> autenticarUsuario(String email,String password){
        return userCrudRepository.findByEmailAndPassword(email, password);
    }
    
}
