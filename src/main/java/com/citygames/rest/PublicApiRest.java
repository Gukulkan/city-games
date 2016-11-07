package com.citygames.rest;


import com.citygames.entity.Game;
import com.citygames.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/public/api")
public class PublicApiRest {

    @Autowired
    private GameService gameService;

    @RequestMapping("/getGames")
    public List<Game> getGamesOnIndex() {
        return gameService.getAllGames(0, 10);
    }
}
