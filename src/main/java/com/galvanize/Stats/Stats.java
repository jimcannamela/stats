package com.galvanize.Stats;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Stats {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Integer str;
	private Integer dex;
	private Integer itg;
	private Integer cha;

	public Stats() {
	}

	public Stats(Integer str, Integer dex, Integer itg, Integer cha) {
		this.str = str;
		this.dex = dex;
		this.itg = itg;
		this.cha = cha;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getStr() {
		return str;
	}

	public void setStr(Integer str) {
		this.str = str;
	}

	public Integer getDex() {
		return dex;
	}

	public void setDex(Integer dex) {
		this.dex = dex;
	}

	public Integer getItg() {
		return itg;
	}

	public void setItg(Integer itg) {
		this.itg = itg;
	}

	public Integer getCha() {
		return cha;
	}

	public void setCha(Integer cha) {
		this.cha = cha;
	}
}
