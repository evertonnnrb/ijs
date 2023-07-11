package com.br.ijs.repository;

import com.br.ijs.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game,Long>{
}
