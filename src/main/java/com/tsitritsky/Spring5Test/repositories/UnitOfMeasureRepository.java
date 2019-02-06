package com.tsitritsky.Spring5Test.repositories;

import com.tsitritsky.Spring5Test.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
}
