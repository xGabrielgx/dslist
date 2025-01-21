package com.project.dslist.controllers;

import com.project.dslist.dto.GameMinDTO;
import com.project.dslist.entities.Game;
import com.project.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/games")
public class GameController {

    @Autowired
    private GameService gameService;


    @GetMapping
    public List<GameMinDTO> findAll() {
        return gameService.findAll();
    }

}
