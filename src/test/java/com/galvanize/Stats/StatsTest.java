package com.galvanize.Stats;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
public class StatsTest {

	@Autowired // Ensure Repository is wired up for Test
	StatsRepository statsRepository;

	@Test
	void canSaveStats() {
		Stats stats = new Stats(15, 10, 10, 10);
		assertNull(stats.getId());    // Id is null prior to save
		statsRepository.save(stats);  // insert due to id == null
		assertNotNull(stats.getId()); // Id is value from table

		stats.setDex(21);
		statsRepository.save(stats); // update due to id == 1L

		// Fetch current record from Database
		// Optional<T> is required as findById could return an empty result
		Optional<Stats> actual = statsRepository.findById(stats.getId());
		// Validate it stored the initial and update values for str and dex
		assertEquals(15, actual.get().getStr());
		assertEquals(21, actual.get().getDex());
	}
}
