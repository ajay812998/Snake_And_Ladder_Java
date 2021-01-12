package com.bridgelabz;

public class Game {
	 int position=0;
		public static void main(String[] args) {
			System.out.println("only one user can play");
			rolls_dice();
		}
	    
		public static void rolls_dice() {
	    	int dice=(int)(Math.floor(Math.random()*10)%6+1);
	    	System.out.println("the dice is "+dice);
	   }
}
	