package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class EnormousInputTest {
	 public static void main(String s[]) throws IOException{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter pw = new PrintWriter(System.out);
			int iCnt = 0;
			
			String input = br.readLine();
			String[] firstLine = input.split("\\s");
			
			Integer n = Integer.parseInt(firstLine[0]);
			Integer k = Integer.parseInt(firstLine[1]);
			if(k<Math.pow(10, 7))
			{
			for(int i=1;i<=n && (input = br.readLine())!=null;i++){
				Integer m = Integer.parseInt(input);
				if(m%k==0 && m<Math.pow(10, 9)) 
					iCnt++;
			}
			}
			
					pw.print(iCnt);
				
			pw.close();
			br.close();
}
}
