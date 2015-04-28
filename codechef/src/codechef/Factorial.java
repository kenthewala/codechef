package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;

public class Factorial {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input;
		
		String firstRow = br.readLine();
//		while((input = br.readLine())!=null){
//			
//		}
		
		Integer bi = new Integer(firstRow);
		System.out.println(factorial(bi));

	}
	
	public static BigInteger factorial(Integer n){
		
		BigInteger fact = BigInteger.valueOf(1);
	    for (int i = 1; i <= n; i++)
	        fact = fact.multiply(BigInteger.valueOf(i));
	    
	    for(int i=10;;i*=10){
	    	String a = (new Integer(i)).toString();
	    	if(fact.remainder(new BigInteger(a)==0)
	    }
		
	    return fact;
	}
	
	

}
