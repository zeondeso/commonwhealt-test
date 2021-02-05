package com.commonwealth.contact.test;

import java.util.Scanner;

public class StairCase {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter total row(s) : ");
		
		int row = Integer.parseInt(sc.nextLine());
		
		for(int x=0; x<row; x++) {
			for(int y=2*(row-x); y>=0; y--){
                System.out.print(" ");
            }
            for (int y=0; y<=x; y++){
                System.out.print("# ");
            }
            System.out.println();
		}
	}

}
