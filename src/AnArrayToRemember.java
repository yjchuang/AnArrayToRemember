
import java.util.Scanner;

public class AnArrayToRemember {

	public static void main(String[] args) {
		
		String[] name = new String[50];
		int count = 0, i;

		Scanner sc = new Scanner(System.in);
		
		for(i = 0; i < 50; i++)
		{
			name[i] = "";
		}
		
		System.out.println("Type in the names of the presidents in" +
		" the order they were elected. ");
		
		for(i = 0; i < 50; i++)
		{
			name[i] = sc.next();
			
			count = i;
			
			if (name[i].equalsIgnoreCase("history"))
			{
				break;
			}
		}
		
		count += 1;	//storing the number of names, including the work "history"
		
		for(i = (count-1); i >= 0; i--)		//starting from the last one
		{
			if(!name[i].equalsIgnoreCase("history"))
			{
				System.out.println(name[i]);
			}
		}
		
		sc.close();
		
	}

}
