package be.pxl.springdatamongodemo.service;

import be.pxl.springdatamongodemo.domain.Pokedex;

import java.util.List;

public interface PokedexService {
    void createPokedex(String name);
    List<Pokedex> getAll();
    void addSomePokemon(String pokedexId);
}
