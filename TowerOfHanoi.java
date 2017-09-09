/*
TowerOfHanoi.java
Written by Thomas Besenski in CSC 115: Introduction to Programming 2
an iterative alternative to the classical recursive solution to an old school game. 

The general findings, and what the algorithm is based on, is the fact, that at any given time,
the best move to find the lowest number of moves, is to move the largest disc possible either 1 or 2 spaces forward, depending on if the 
total number of discs is odd or even.

Admittedly, this java program isn't really written like how I would now imagine a java program should be.
Can you tell I learned Python first?
:)

*/


import java.util.Scanner;
public class TowerOfHanoi
{
	
	static Stack<Integer> pile1;
	static Stack<Integer> pile2;
	static Stack<Integer> pile3;
	static int numOfDiscs;
	static int numberOfMoves;
    
    
    
	// move(): the method employed to find the best move, and alter the contents of the stacks/piles accordingly.
    //Every time this is called, a turn of play or move takes place.
	static public void move()
	{	
		Stack<Integer> pointer;
		//CHECKING IF THE BIGGEST VALUE CAN MOVE ---> THE SMALLEST VALUE can move, and then printing when a move is made to show progress
		if (numOfDiscs%2==1)//IF The num of discs is odd
        {		
            for (int i = numOfDiscs; i >0; i--)
            {
                if (pile1.peek() == i)
                {	//checking if pile1 has a smaller value than 3, or 3 is empty
                    if (pile1.peek() < pile3.peek() || pile3.peek() ==0)
                    {	//moving the value from pile 1 to pile 3
                        numberOfMoves++;
                        pile3.push(pile1.pop());
                        System.out.println(pile1.toString() + "	   	" + pile2.toString() + "		 " +pile3.toString());
                    }
                    //checking to see if pile1 has a smaller value than 2, or 2 is empty
                    else if (pile1.peek() < pile2.peek() || pile2.peek()==0)
                    {//moving the value from pile 1 to pile 2
                        pile2.push(pile1.pop());
                        numberOfMoves++;
                        System.out.println(pile1.toString() + "	   	" + pile2.toString() + "		 " +pile3.toString());
                    }
                }
                else if (pile2.peek()==i)
                {
                    if (pile2.peek() < pile1.peek() || pile1.peek() ==0)
                    {	//moving the value from pile 2 to pile 1
                        numberOfMoves++;
                        pile1.push(pile2.pop());
                        System.out.println(pile1.toString() + "	   	" + pile2.toString() + "		 " +pile3.toString());
                    }
                    //checking to see if pile2 has a smaller value than 1, or 2 is empty
                    else if (pile2.peek() < pile3.peek() || pile3.peek()==0)
                    {//moving the value from pile 1 to pile 2
                        pile3.push(pile2.pop());
                        numberOfMoves++;
                        System.out.println(pile1.toString() + "	   	" + pile2.toString() + "		 " +pile3.toString());
                    }
                }
		
                else if (pile3.peek()==i)
                {
                    if (pile3.peek() < pile2.peek() || pile2.peek() ==0)
                    {	//moving the value from pile 3 to pile 2
                        numberOfMoves++;
                        pile2.push(pile3.pop());
                        System.out.println(pile1.toString() + "	   	" + pile2.toString() + "		 " +pile3.toString());
                    }
                    //checking to see if pile3 has a smaller value than 1, or 1 is empty
                    else if (pile3.peek() < pile1.peek() || pile1.peek()==0)
                    {//moving the value from pile 3 to pile 1
                        pile1.push(pile3.pop());
                        numberOfMoves++;
                        System.out.println(pile1.toString() + "	   	" + pile2.toString() + "		 " +pile3.toString());
                    }
                }
            }
        }
        else//IF THE NUMBER OF DISCS IS EVEN
        {
            for (int i = numOfDiscs; i >0; i--)
            {	
            //checking which pile has the largest value, then checking if it can move
                if (pile1.peek() == i)
                {	//checking if pile1 has a smaller value than 2, or 2 is empty
                    if (pile1.peek() < pile2.peek() || pile2.peek() ==0)
                    {	//moving the value from pile 1 to pile 2
                        numberOfMoves++;
                        pile2.push(pile1.pop());
                        System.out.println(pile1.toString() + "	   	" + pile2.toString() + "		 " +pile3.toString());
                    }
                    //checking to see if pile1 has a smaller value than 3, or 3 is empty
                    else if (pile1.peek() < pile3.peek() || pile3.peek()==0)
                    {//moving the value from pile 1 to pile 3
                        pile3.push(pile1.pop());
                        numberOfMoves++;
                        System.out.println(pile1.toString() + "	   	" + pile2.toString() + "		 " +pile3.toString());
                    }
                }
                else if (pile2.peek()==i)
                {
                    if (pile2.peek() < pile3.peek() || pile3.peek() ==0)
                    {	//moving the value from pile 2 to pile 3
                        numberOfMoves++;
                        pile3.push(pile2.pop());
                        System.out.println(pile1.toString() + "	   	" + pile2.toString() + "		 " +pile3.toString());
                    }
                    //checking to see if pile2 has a smaller value than 2, or 1 is empty
                    else if (pile2.peek() < pile1.peek() || pile1.peek()==0)
                    {//moving the value from pile 1 to pile 3
                        pile1.push(pile2.pop());
                        numberOfMoves++;
                        System.out.println(pile1.toString() + "	   	" + pile2.toString() + "		 " +pile3.toString());
                    }
                }
		
                else if (pile3.peek()==i)
                {
                    if (pile3.peek() < pile1.peek() || pile1.peek() ==0)
                    {	//moving the value from pile 3 to pile 1
                        numberOfMoves++;
                        pile1.push(pile3.pop());
                        System.out.println(pile1.toString() + "	   	" + pile2.toString() + "		 " +pile3.toString());
                    }
                    //checking to see if pile3 has a smaller value than 2, or 2 is empty
                    else if (pile3.peek() < pile2.peek() || pile2.peek()==0)
                    {//moving the value from pile 3 to pile 2
                        pile2.push(pile3.pop());
                        numberOfMoves++;
                        System.out.println(pile1.toString() + "	   	" + pile2.toString() + "		 " +pile3.toString());
                    }
                }
            }
        }
	}
	
	
	
	
	public static void main(String[] args)
	{
		
		
		//INITIALIZING THE TOWERS OF HANOI
		//each stack represents one of the piles in the game, and 0 is meant to represent the bottom.
        //(an embarassing way to signal the bottom of the stack without having to account for a possible null)
        pile1 = new Stack();
		pile1.push(0);
		pile2 = new Stack();
		pile2.push(0);
		pile3 = new Stack();
		pile3.push(0);
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of discs you would like to have for the perfect solution of the TOWER OF HANOI");
		int num= input.nextInt();
		numOfDiscs = num;
        //Filling up the first stack in descending order, setting up the board for gameplay
		for (int i = numOfDiscs ; i > 0 ; i--)
		{
			pile1.push(i);
		}
		
		//MAIN ALGORITHM FOR TOWER OF HANOI PROBLEM SOLVING BEGINS//
		numberOfMoves = 0;
		System.out.println(pile1.toString() + "	   	" + pile2.toString() + "		 " +pile3.toString());
		for(;;)
		{ 
			move();
			//CHECK WIN CONDITION
			if (pile3.peek()==1 && pile2.peek() == 0 && pile1.peek()==0)
			{	
				System.out.println(numberOfMoves + " number of moves taken to reach win");
				break;
			}
        }
	}
}