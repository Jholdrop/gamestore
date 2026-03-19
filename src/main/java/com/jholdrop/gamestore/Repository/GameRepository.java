package com.jholdrop.gamestore.Repository;

import org.springframework.data.repository.CrudRepository;

import com.jholdrop.gamestore.Model.Game;

public interface GameRepository extends CrudRepository<Game,Integer>{
    
}
