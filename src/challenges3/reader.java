package challenges3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;


public class reader {
	
	static String folderLocation = "C:\\Users\\anjac\\OneDrive\\Desktop\\challenges\\2024q4\\";

	//static String LocatieBepaling = folderLocation+"Bepaling.txt"; // txt file met hoeveel pannekoeken iedereen doet en vanaf welke week ze mee doen
	static String LocatieW0 = folderLocation+"chatW0.txt"  ;
	static String LocatieW1 = folderLocation+"chatW1.txt"  ; // txt file met voorgaande discord chatlogs
	static String LocatieW2 = folderLocation+"chatW2.txt"; 
	static String LocatieW3 = folderLocation+"chatW3.txt"; 
	static String LocatieW4 = folderLocation+"chatW4.txt"; 
	static String LocatieW5 = folderLocation+"chatW5.txt";
	static String LocatieW6 = folderLocation+"chatW6.txt";
	static String LocatieW7 = folderLocation+"chatW7.txt";
	static String LocatieW8 = folderLocation+"chatW8.txt";
	static String LocatieW9 = folderLocation+"chatW9.txt";
	static String LocatieW10 = folderLocation+"chatW10.txt";
	static String LocatieW11 = folderLocation+"chatW11.txt";
	static String LocatieW12 = folderLocation+"chatW12.txt";
	
	
	static String LocatiePromise = folderLocation+"promise.txt"; // txt file met de emoji's die geteld moeten worden met hun punten en commando
	static String LocatieDone = folderLocation+"done.txt"; // txt file met de emoji's die geteld moeten worden met hun punten en commando
	static String LocatieBonus = folderLocation+"bonus.txt"; // txt file met de bonus emoji's die geteld moeten worden met hun punten
	
	public static void main(String[] args) throws Exception {
		ArrayList<BufferedReader> br_week_list = new ArrayList<>();
		//File bepaling = new File(LocatieBepaling);
		File emojiPromise = new File(LocatiePromise);
		File emojiDone = new File(LocatieDone);
		File emojiBonus = new File(LocatieBonus);
		File w0 = new File(LocatieW0);
		File w1 = new File(LocatieW1);
		File w2 = new File(LocatieW2);
		File w3 = new File(LocatieW3);
		File w4 = new File(LocatieW4);
		File w5 = new File(LocatieW5);
		File w6 = new File(LocatieW6);
		File w7 = new File(LocatieW7);
		File w8 = new File(LocatieW8);
		File w9 = new File(LocatieW9);
		File w10 = new File(LocatieW10);
		File w11 = new File(LocatieW11);
		File w12 = new File(LocatieW12);
		//File w1 = new File(LocatieW1);
		//File w1 = new File(LocatieW1);
		//BufferedReader br_bepaling = new BufferedReader(new FileReader(bepaling));
		BufferedReader br_emoji_promise = new BufferedReader(new FileReader(emojiPromise));
		BufferedReader br_emoji_done = new BufferedReader(new FileReader(emojiDone));
		BufferedReader br_emoji_bonus = new BufferedReader(new FileReader(emojiBonus));
		br_week_list.add( new BufferedReader(new FileReader(w0)));
		br_week_list.add( new BufferedReader(new FileReader(w1)));
		br_week_list.add( new BufferedReader(new FileReader(w2)));
		br_week_list.add( new BufferedReader(new FileReader(w3)));
		br_week_list.add( new BufferedReader(new FileReader(w4)));
		br_week_list.add( new BufferedReader(new FileReader(w5)));
		br_week_list.add( new BufferedReader(new FileReader(w6)));
	    br_week_list.add( new BufferedReader(new FileReader(w7)));
		br_week_list.add( new BufferedReader(new FileReader(w8)));
		br_week_list.add( new BufferedReader(new FileReader(w9)));
		//br_week_list.add( new BufferedReader(new FileReader(w10)));
		//br_week_list.add( new BufferedReader(new FileReader(w11)));
		//br_week_list.add( new BufferedReader(new FileReader(w12)));
		Process process = new Process(br_emoji_promise, br_emoji_done, br_emoji_bonus, br_week_list);
		
	}	
}

/**
public class reader {

	static String LocatieAocDag1 = "C:\\Users\\anjac\\AoC\\aoc01.txt"; // txt file waar je de input in copy-paste
	
	public static void main(String[] args) throws Exception {
		File aocDag1 = new File(LocatieAocDag1); 
		BufferedReader br = new BufferedReader(new FileReader(aocDag1));
		ArrayList<String> regels = new ArrayList<>();
		String ss;
		while ((ss=br.readLine())!= null) {
			regels.add(ss);
		}
		// dan heb je nu een ArrayList<String> met alle input; dan kan je helemaal los gaan :)
		System.out.println(regels);
	}	
}**/