package com.br.ijs.service;

import com.br.ijs.entities.Game;
import com.br.ijs.entities.dto.GameMinDTO;
import com.br.ijs.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        return gameRepository.findAll().stream().map(GameMinDTO::new).toList();
    }

    public Optional<Game> findById(Long id){
        return gameRepository.findById(id);
    }
}
