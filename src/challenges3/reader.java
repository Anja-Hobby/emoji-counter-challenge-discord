package challenges3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;


public class reader {
	// Change this string to the amount of weeks
	static int amount_of_weeks = 12;
	
	// Change this string to the folderLocation all the txt files are in.
	static String folderLocation = "C:\\Users\\anjac\\OneDrive\\Desktop\\challenges\\2024q4\\";

	//static String LocatieBepaling = folderLocation+"Bepaling.txt"; // txt file met hoeveel pannekoeken iedereen doet en vanaf welke week ze mee doen

	static String LocatiePromise = folderLocation+"promise.txt"; // txt file met de emoji's die geteld moeten worden met hun punten en commando
	static String LocatieDone = folderLocation+"done.txt"; // txt file met de emoji's die geteld moeten worden met hun punten en commando
	static String LocatieBonus = folderLocation+"bonus.txt"; // txt file met de bonus emoji's die geteld moeten worden met hun punten
	
	public static void main(String[] args) throws Exception {
		// get file locations, and files
		int week = 0 ;
		ArrayList<String> locations = new ArrayList<>();
		ArrayList<BufferedReader> br_week_list = new ArrayList<>();
		
		// Start with week 0: here people can input their promises for the first week.
		while (week <= amount_of_weeks) {
			String file_name = folderLocation+"chatW"+week+".txt";
			locations.add(file_name);
			File file = new File(file_name);
			if (file.exists() && file.isFile()) {
				br_week_list.add(new BufferedReader(new FileReader(file)));
			}
			week++;
		}
		
		//File bepaling = new File(LocatieBepaling);
		File emojiPromise = new File(LocatiePromise);
		File emojiDone = new File(LocatieDone);
		File emojiBonus = new File(LocatieBonus);
		//BufferedReader br_bepaling = new BufferedReader(new FileReader(bepaling));
		BufferedReader br_emoji_promise = new BufferedReader(new FileReader(emojiPromise));
		BufferedReader br_emoji_done = new BufferedReader(new FileReader(emojiDone));
		BufferedReader br_emoji_bonus = new BufferedReader(new FileReader(emojiBonus));
		
		Process process = new Process(br_emoji_promise, br_emoji_done, br_emoji_bonus, br_week_list);
		
	}	
}