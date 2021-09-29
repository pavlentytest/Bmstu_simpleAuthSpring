package com.example.demo;

import org.springframework.data.repository.CrudRepository;

public interface UserAction extends CrudRepository<User,Integer> {
}
