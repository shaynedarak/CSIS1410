/**
 * This is an assignment for homework week 2 Itinerary 
 * Thongleup Boundarak @shaynedarak
 * Version: 1.0
 */

// import Java libraries.
import java.util.Scanner;
import java.lang.StringBuilder;
import java.util.ArrayList;

//stated a class Thongleup Boundarak Itinerary.
	public class thongleup_boundarak_Itinerary2 

		{
			public static void main(String[] args) 
				{
		
					Scanner input = new Scanner(System.in);
					StringBuilder sb = new StringBuilder();
					ArrayList<String> destinations = new ArrayList<String>();
		

						String entry;
						
						while (true)
				{
						System.out.print("Destination: ");
						entry = input.nextLine();
						
					// ignore the input when user type "done"
						if (entry != null) 
							{
								if (entry.equalsIgnoreCase("done"))
									{
									break;
									}
								destinations.add(entry);
												}
			else
				break;
		}
		
					int i=0;
					int listSize = destinations.size();
					System.out.print("Itinerary: ");
					for (String str : destinations)
		{

			i++;
			// print destination outcome to caps.
			if (i < listSize) 
			{
				System.out.print(str.toUpperCase() + " to ");
			}
			else
				System.out.print(str.toUpperCase());
			
		}

	}

}
