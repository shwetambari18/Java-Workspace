package Interfaces;

import java.awt.List;

public class Monster implements ISaveable {

	private String name;
	private int score;
	private String weapon;
	public Monster(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public int getScore() {
		return score;
	}
	
	public String getWeapon() {
		return weapon;
	}
	@Override
	public void storeValues(List myList) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List retrieveValues() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String toString() {
		return "Monster [name=" + name + ", score=" + score + ", weapon="
				+ weapon + "]";
	}
	
	
	
}
