package dev.java1.Pokedex.Pokemon;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class PokedexController {

    @GetMapping("/testerota")
    public String testeRota(){
        return"Este é um teste de rota";
    }

}
