package com.br.ijs.repository;

import com.br.ijs.entities.Game;
import com.br.ijs.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList,Long>{
}
