package main.java.philipp;
import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;


public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
			String s=null;
		System.out.println(" ");
		if(scn.hasNext()){
			 s = scn.nextLine();
			System.out.println("You entered: " + s);
	        System.out.println("It Substringded: " + StringUtils.substring(s, 1));		
		}else{
			System.out.println("Enter your number");
			
		}
		scn.close();
		
  	}

}
