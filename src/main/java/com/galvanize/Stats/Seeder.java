// Seeder.java
package com.galvanize.Stats;

/* imports */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component // Required to expose this to Spring for DI
public class Seeder {
	@Autowired // Using DI connect this to our implementation
	StatsRepository statsRepository;

	public void loadStats() {
		// Create empty stats List
		List<Stats> statsList = new ArrayList<>();

		// Add some statsList to the List
		statsList.add(new Stats(15, 10, 10, 10));
		statsList.add(new Stats(10, 15, 10, 10));
		statsList.add(new Stats(10, 10, 15, 10));
		statsList.add(new Stats(10, 10, 10, 15));
		statsList.add(new Stats(12, 12, 12, 12));
		statsList.add(new Stats(9, 7, 11, 13));

		// Insert these statsList into the statsList table
		statsRepository.saveAll(statsList);
	}
}