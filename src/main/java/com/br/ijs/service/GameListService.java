package com.br.ijs.service;

import com.br.ijs.entities.dto.GameListDTO;
import com.br.ijs.repository.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        return gameListRepository.
                findAll().stream().map(GameListDTO::new).toList();
    }

    @Transactional(readOnly = true)
    public Optional<GameListDTO> findById(Long id) {
        return Optional.of(new GameListDTO(gameListRepository.findById(id).get()));
    }
}
