package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;


public class ATM {
	 public static void main(String s[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		String input = br.readLine();
		
			String[] Arrinput = input.split("\\s");
			int withdrawalAmount = Integer.parseInt(Arrinput[0]);
			float accountBalance = Float.parseFloat(Arrinput[1]);
			
			
			if((withdrawalAmount<accountBalance-0.50) && (withdrawalAmount%5==0))
			{
				accountBalance -= withdrawalAmount+0.50;
			}
				pw.printf("%3.2f",accountBalance);
			
		pw.close();
		br.close();
	}

}
