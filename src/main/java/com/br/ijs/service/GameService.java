package com.br.ijs.service;

import com.br.ijs.entities.dto.GameDTO;
import com.br.ijs.entities.dto.GameMinDTO;
import com.br.ijs.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() {
        return gameRepository.findAll().stream().map(GameMinDTO::new).toList();
    }

    @Transactional(readOnly = true)
    public Optional<GameDTO> findById(Long id) {
        return Optional.of(new GameDTO(gameRepository.findById(id).get()));
    }
}
