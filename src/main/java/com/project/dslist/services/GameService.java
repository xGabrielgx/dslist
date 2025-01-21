package com.project.dslist.services;

import com.project.dslist.dto.GameMinDTO;
import com.project.dslist.entities.Game;
import com.project.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

// opção também utilizando lombok
//    private final GameService service;
//    @Autowired
//    public GameService(GameService service) {
//        this.service = service;
//    }


    public List<GameMinDTO> findAll () {
        List<Game> games = gameRepository.findAll();
        return games.stream().map(GameMinDTO::new).toList();

    }

}
