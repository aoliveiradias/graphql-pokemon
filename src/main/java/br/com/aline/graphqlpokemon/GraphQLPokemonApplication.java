package br.com.aline.graphqlpokemon;

import br.com.aline.graphqlpokemon.domain.Pokemon;
import br.com.aline.graphqlpokemon.repository.PokemonRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GraphQLPokemonApplication {

    public static void main(String[] args) {
        SpringApplication.run(GraphQLPokemonApplication.class, args);
    }

    @Bean
    ApplicationRunner init(PokemonRepository pokemonRepository) {
        return args -> {
            Pokemon charmander = new Pokemon("charmander", "fogo", 5);
            Pokemon pikachu = new Pokemon("pikachu", "elétrico", 15);
            Pokemon bulbassour = new Pokemon("bulbassour", "planta", 2);
            Pokemon squirtle = new Pokemon("squirtle", "águe", 0);

            pokemonRepository.save(charmander);
            pokemonRepository.save(pikachu);
            pokemonRepository.save(bulbassour);
            pokemonRepository.save(squirtle);
        };
    }
}


