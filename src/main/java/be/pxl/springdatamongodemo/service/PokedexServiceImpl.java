package be.pxl.springdatamongodemo.service;

import be.pxl.springdatamongodemo.domain.Move;
import be.pxl.springdatamongodemo.domain.Pokedex;
import be.pxl.springdatamongodemo.domain.Pokemon;
import be.pxl.springdatamongodemo.respository.PokedexRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class PokedexServiceImpl implements PokedexService{
    private final PokedexRepository pokedexRepository;

    @Override
    public void createPokedex(String name) {
        pokedexRepository.insert(Pokedex.builder().name(name).pokemons(new ArrayList<>()).build());
    }

    @Override
    public List<Pokedex> getAll() {
        return pokedexRepository.findAll();
    }

    @Override
    public void addSomePokemon(String pokedexId) {
        Pokedex pokedex = pokedexRepository.findById(pokedexId).orElseThrow();
        Move move = Move.builder().name("Scratch").damage(10).build();
        Move move1 = Move.builder().name("Thunderbolt").damage(30).build();
        Pokemon poke = new Pokemon("p1", "Pikachu", List.of(move, move1), List.of("this", "is an", "array", "of", "strings", "MongoDB ftw"));
        Pokemon poke1 = new Pokemon("p2", "Charmander", List.of(move),List.of());
        Pokemon poke2 = new Pokemon("p3", "Squirtle", List.of(move), List.of());
        Pokemon poke3 = new Pokemon("p4", "Bulbasaur", List.of(move), List.of());

        pokedex.addPokemon(poke);
        pokedex.addPokemon(poke1);
        pokedex.addPokemon(poke2);
        pokedex.addPokemon(poke3);

        pokedexRepository.save(pokedex);
    }


}
