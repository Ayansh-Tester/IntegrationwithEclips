package abcd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

public class GoibiboTest {

	public static void main(String[] args) throws IOException 
	{
		System.out.println("enter something");
		//Reader in = new Reader;
		//Scan sr = new Scanner(System.in);
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		String s  = br.readLine();
		
		
	//	String s = sr.nextLine();
		
		System.out.println(s);
		//sr.close();
	}

}
