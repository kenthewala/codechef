package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class TestClass {
	public static void main(String s[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		
		String input;
		
		while((input = br.readLine())!=null){
			if(!(42 ==Integer.parseInt(input))){		
			System.out.println(input);
			}
			else
				break;
		}
		pw.close();
		br.close();
	}


}
