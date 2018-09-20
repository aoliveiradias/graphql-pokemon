package br.com.aline.graphqlpokemon.query;

import br.com.aline.graphqlpokemon.domain.Pokemon;
import br.com.aline.graphqlpokemon.repository.PokemonRepository;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class QueryResolver implements GraphQLQueryResolver {

    @Autowired
    private PokemonRepository pokemonRepository;

    public List<Pokemon> obterPokemons() {
        return pokemonRepository.findAll();
    }


    public Pokemon obterPokemonPorId(Long id) {
        return pokemonRepository.findById(id).orElseThrow(null);
    }

}
