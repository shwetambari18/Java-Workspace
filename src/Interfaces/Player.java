package Interfaces;

import java.awt.List;
import java.util.ArrayList;

public class Player implements ISaveable{
	
	private String playerName;
	private int playerScore;
	private ArrayList<Object> playersList;
	
	public ArrayList<Object> getPlayersList() {
		return playersList;
	}

	public Player(String playerName, int playerScore) {
		super();
		this.playerName = playerName;
		this.playerScore = playerScore;
	}
	
	public String getPlayerName() {
		return playerName;
	}

	public int getPlayerScore() {
		return playerScore;
	}



	@Override
	public void storeValues(List myList) {
		// TODO Auto-generated method stub
		List<String> values = new ArrayList<String>();
		values.add(0,this.playerName);
		values.add(1,this.playerScore);
	}
		
	@Override
	public List retrieveValues() {
		// TODO Auto-generated method stub
		return null;
	}

}
