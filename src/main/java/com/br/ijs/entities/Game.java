package com.br.ijs.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;


@Entity
@Table(name = "tb_game")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Game implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @Column(name = "game_year")
    private Integer year;

    private String genre;

    private String platforms;

    private Double score;

    @Column(name = "img_url")
    private String imgUrl;


    @Column(columnDefinition = "TEXT")
    private String shortDescription;

    @Column(columnDefinition = "TEXT")
    private String longDescription;
}
