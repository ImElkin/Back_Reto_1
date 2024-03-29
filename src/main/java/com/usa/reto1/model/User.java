package com.usa.reto1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity// la que permite que la clase represente una DB
@Data
@RequiredArgsConstructor
@NoArgsConstructor
@Table (name = "user",indexes = @Index(name = "indx_email",columnList = "user_email",unique = true))
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NonNull
    @Column(name = "user_email",nullable = false,length = 50)
    private String email;
    @NonNull
    @Column(name = "user_password",nullable = false,length = 50)
    private String password;
    @NonNull
    @Column(name = "user_name",nullable = false,length = 80)
    private String name;

 
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
