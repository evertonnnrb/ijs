package com.br.ijs.entities.dto;

import com.br.ijs.entities.Game;
import com.br.ijs.entities.GameList;
import lombok.Getter;

@Getter
public class GameListDTO {
    private Long id;
    private String name;

    public GameListDTO(GameList list) {
        id = list.getId();
        name = list.getName();
    }
}
