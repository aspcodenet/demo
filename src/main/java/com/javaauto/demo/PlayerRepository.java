package com.javaauto.demo;

import org.springframework.data.repository.CrudRepository;

import com.javaauto.demo.Player;

// This will be AUTO IMPLEMENTED by Spring into a Bean called playerRepository
// CRUD refers Create, Read, Update, Delete

public interface PlayerRepository extends CrudRepository<Player, Integer> {

}