package com.bridgelabz;

public class Game {
	public static void main(String[] args) {
		System.out.println("only one user can play");
		option();
	}
    
	public static int rolls_dice() {
    	int dice=(int)(Math.floor(Math.random()*10)%6+1);
    	return dice;
    }
    
	public static void option() {
    	int position=0;
    	while (position<100) {
    		int luck=(int)(Math.floor(Math.random()*10)%3+1);
    		int dice=rolls_dice();
    		System.out.println("the dice is "+dice);
    		switch (luck) {
    		case 1:System.out.println("the position is "+position);
    			break;
    		case 2:	position=position+dice;
    			if(position>100) {position=position-dice;}
    			System.out.println("the position is "+position);
    			break;
    		case 3:position=position-dice;
    			System.out.println("the postition is "+position);
    			if(position<0){position=0;};
    			break;
    		}	
    	}
    }
}    
    