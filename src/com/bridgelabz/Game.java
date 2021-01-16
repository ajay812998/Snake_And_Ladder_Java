package com.bridgelabz;

public class Game {
    public int user_pos1,user_pos2;
    
	public static void main(String[] args) {
		Game g=new Game();
		System.out.println("Let's start the game play with two player");
		while(g.user_pos1<=100 && g.user_pos2<=100) {
			g.user1();
			g.user2();
		}
		if(g.user_pos1>g.user_pos2)System.out.println("Player1 wins as player2 reaches only to the position of "+g.user_pos2);
		else System.out.println("Player2 wins as player1 reches only to the position of "+g.user_pos1);
		
	}
	public void user1() {
		int position=option();
		user_pos1=user_pos1+position;
		
	}
	public void user2() {
		int position=option();
		user_pos2=user_pos2+position;
		
	}
    public static int rolls_dice() {
    	int dice=(int)(Math.floor(Math.random()*10)%6+1);
    	return dice;
    }
    public static int option() {
    		int position=0;
    		int luck=(int)(Math.floor(Math.random()*10)%3+1);
    		int dice=rolls_dice();
    		
    		switch (luck) {				
    		case 1:position=position+0;  //no play means there will be no increament in the position 
    				break;
			case 2:	position+=dice;      //there is a ladder means there will be increament in the position on the basis of dice
    			option();
    			break;
    		case 3:position=position-dice;   //There is a snake there will be the decreament the position of the dice
    			if(position<0){position=0;};
    			break;
    		}
    		return position;
    }
    
}