/*Thongleup Boundarak
 * Version: 1.0
 * 
 * This is to program a game report to
 * display the game play results and its winner's name.*/

//import java directories
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;

public class GameReport {

	public static void main(String[] args) throws IOException 
	
	{
		File fileName = new File(System.getProperty("user.dir") + "\\GameScores.csv"); //DIRECT to system directory file.
		
		gameReport(fileName);
		addGamer(fileName, "Shayne", 210, 300, 254, 401, 555, 320, 480, 920, 882, 563); // ADD gamer's name and score.
		//addGamer(fileName, "BOB", 300, 300, 254, 401, 555, 320, 480, 920, 882, 563); Input more player's name and score if needed.
		gameReport(fileName);
		
	}

	private static void addGamer(File fileName, String gamer, // INITIALIZE gamers into string.
				
							int a, int b, int c, 
							int d, int e, int f, 
							int g, int h, int i, 
							int j) throws IOException
	
	{
		FileWriter csvWriter = new FileWriter(fileName, true); //W
	
		csvWriter.write(gamer + "," + a + "," + b + 
								"," + c + "," + d + 
								"," + e + "," + f + 
								"," + g + "," + h + 
								"," + i + "," + j + "\r\n");			
	
		System.out.printf("%n Gamer %s record added.%n%n", gamer);
		csvWriter.close();
	}

		private static void gameReport(File fileName) throws IOException
	{
		if (fileName.exists()) // If statement for variables.
		{
			BufferedReader br = null;
			String line = "";
			String cvsSplitBy = ",";
			int recordCount = 0;
			int gamerTotal = 0;
			int topGamer = 0;
			String topName = "";
			
			
			br = new BufferedReader(new FileReader(fileName));
			
			horizontalLine(93);
			System.out.println("Game Report");
			horizontalLine(93);
			System.out.println("Gamer\t1\t2\t3\t4\t5\t6\t7\t8\t9\t10\tTotal"); // Print score result in column table.
			horizontalLine(93);
			
			
			while ((line = br.readLine())	!= null)
			{
				String[] gamer = line.split(cvsSplitBy); // Split and categorize player's names and numbers into table.
				System.out.print(
						  gamer[0] + "\t" + gamer[1] + "\t"
						+ gamer[2] + "\t" + gamer[3] + "\t"
						+ gamer[4] + "\t" + gamer[5] + "\t"
						+ gamer[6] + "\t" + gamer[7] + "\t"
						+ gamer[8] + "\t" + gamer[9] + "\t"
						+ gamer[10]);
				
				gamerTotal = Integer.parseInt(gamer[1]) + Integer.parseInt(gamer[2])
							+ Integer.parseInt(gamer[3]) + Integer.parseInt(gamer[4])
							+ Integer.parseInt(gamer[5]) + Integer.parseInt(gamer[6])
							+ Integer.parseInt(gamer[7]) + Integer.parseInt(gamer[8])
							+ Integer.parseInt(gamer[9]) + Integer.parseInt(gamer[10].substring(0, 2));
				
				System.out.println("\t" + gamerTotal);
				
				if (gamerTotal > topGamer)
				{
					topGamer = gamerTotal;
					topName = gamer[0];
				}
				recordCount++;
				gamerTotal = 0;
				
			}
			
			horizontalLine(93);
			System.out.printf("# of Gamers:\t%d%n", recordCount);
			System.out.printf("Top gamer:\t%s%n", topName);
			horizontalLine(93);
			br.close();
			fileName = null;
			
				}	
				
			}

	private static void horizontalLine(int dashes) 
		
	{
		for (int i = 1; i <= dashes; i++)
		{
			System.out.print(".");
		}
		System.out.println();

	}

}
