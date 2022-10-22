package be.pxl.springdatamongodemo.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

// https://www.mongodb.com/compatibility/spring-boot

@Document(collection = "pokedex")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Pokedex {
    @Id
    private String id;

    private String name;
    private List<Pokemon> pokemons;

    public void addPokemon(Pokemon pokemon) {
        pokemons.add(pokemon);
    }
}
