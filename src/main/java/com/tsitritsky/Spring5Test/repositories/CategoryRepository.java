package com.tsitritsky.Spring5Test.repositories;

import com.tsitritsky.Spring5Test.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
