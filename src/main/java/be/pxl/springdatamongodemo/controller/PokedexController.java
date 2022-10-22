package be.pxl.springdatamongodemo.controller;

import be.pxl.springdatamongodemo.domain.Pokedex;
import be.pxl.springdatamongodemo.service.PokedexService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pokedex")
@RequiredArgsConstructor
public class PokedexController {
    private final PokedexService pokedexService;

    @GetMapping
    public ResponseEntity<List<Pokedex>> getPokedexi() {
        return new ResponseEntity<>(pokedexService.getAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Void> addPokedex(@RequestBody String name) {
        pokedexService.createPokedex(name);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("/addpokemons/{pokedexId}")
    public ResponseEntity<Void> addPokemons(@PathVariable String pokedexId) {
        pokedexService.addSomePokemon(pokedexId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
