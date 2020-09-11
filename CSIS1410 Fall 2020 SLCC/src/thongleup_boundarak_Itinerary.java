/**
 * This is an assignment for homework week 2 Itinerary 
 * Thongleup Boundarak @shaynedarak
 * Version: 1.0
 */

import java.util.Scanner;
import java.lang.StringBuilder;
import java.util.ArrayList;

public class thongleup_boundarak_Itinerary 

{

	public static void main(String[] args) 
	
	{
		
		Scanner input = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		ArrayList<String> destinations = new ArrayList<String>();
		
//		destinations.add("Salt Lake City");
//		sb.append("New York");
		
		String entry;
		
		while (true)
		{
			System.out.print("Destination: ");
			entry = input.nextLine();
			if (entry != null) {
				if (entry.equalsIgnoreCase("done"))
				{
					break;
				}
				destinations.add(entry);
			}
			else
				break;
//			
////			entry = input.nextLine();
//			if (entry != null)
//			{
//				entry = entry.trim();
//				if (entry.equalsIgnoreCase("done"))
//				{
//					break;
//				}
//				
//				System.out.print("Destination: ");
//				entry = input.nextLine();
//				destinations.add(entry);
//			}			
//			else
//			{
//				break;
//			}
		}
		
		int i=0;
		int listSize = destinations.size();
		System.out.print("Itinerary: ");
		for (String str : destinations)
		{
//			i++;
//			if (i==listSize)
//			{
//				sb.append(str.toUpperCase());
//			}
//			else
//			{
//				sb.append(str.toUpperCase()).append(" to ");
//			}
			
			
			i++;
			
			if (i < listSize) {
				System.out.print(str.toUpperCase() + " to ");
			}
			else
				System.out.print(str.toUpperCase());
			
		}		
		
	}

}
