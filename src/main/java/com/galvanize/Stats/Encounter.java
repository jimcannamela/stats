package com.galvanize.Stats;
import javax.persistence.*;
@Entity
public class Encounter {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	@ManyToOne
	private Hero hero;

	public Encounter() {}; // Required when overloading constructors

	public Encounter(Hero hero) { this.hero = hero; }

}
