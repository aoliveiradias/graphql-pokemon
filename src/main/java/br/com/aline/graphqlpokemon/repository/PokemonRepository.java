package br.com.aline.graphqlpokemon.repository;

import br.com.aline.graphqlpokemon.domain.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PokemonRepository extends JpaRepository<Pokemon, Long> {

}