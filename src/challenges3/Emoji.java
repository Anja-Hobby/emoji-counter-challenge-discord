package challenges3;

import challenges3.Process.EmojiType;

public class Emoji {
	private String symbol = "";
	private String command = "";
	private int points = 0;
	private EmojiType type; 
	
	public Emoji(String string, String c, int p, EmojiType t) {
		symbol = string;
		command = c;
		points = p;
		type = t;
	}

	public String getChar() {
		return symbol;
	}
	
	
	public String getCommand() {
		return command;
	}
	
	public int getPoints() {
		return points;
	}
	
	public EmojiType getType() {
		return type;
	}
	
	public void print() {
		System.out.println("'"+ command + "' is waard " + points + " en is van type " + type  );
	}

}
