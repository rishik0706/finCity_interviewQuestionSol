package fincity_assignment;

import java.util.Scanner;

public class Arkhamcity {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int patient=in.nextInt();
		int stepP1=in.nextInt();
		
		System.out.println( batman(patient,stepP1));
	}
	
	public static int batman(int n,int b) {
		return n*b;
	}
}
