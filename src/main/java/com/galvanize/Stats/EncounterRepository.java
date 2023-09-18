package com.galvanize.Stats;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EncounterRepository extends CrudRepository<Encounter, Long> {
}
