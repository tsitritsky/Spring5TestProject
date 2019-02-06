package com.tsitritsky.Spring5Test.repositories;

import com.tsitritsky.Spring5Test.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
