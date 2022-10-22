package be.pxl.springdatamongodemo.respository;

import be.pxl.springdatamongodemo.domain.Pokedex;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PokedexRepository extends MongoRepository<Pokedex, String> {

}
