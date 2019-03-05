//Beau Heffron
//Period 9
//

import java.util.*;
public class L4P2
{
	public static void main(String args[])
	{

		int [][] gameBoard = {{1,1,1,1,1},
							 {1,2,2,2,1},
							 {1,2,3,2,1},
							 {1,2,2,2,1},
							 {1,1,1,1,1}};
		Random rand = new Random();
		int y;
		int x;
		int score = 0;
		int roll= rand.nextInt(10) + 1;

		for (int q=0;q<roll;q++)
		{
			x = rand.nextInt(4) + 1;
			y = rand.nextInt(4) + 1;
			score += gameBoard[x][y];
			gameBoard[x][y]= 0;
		}

		System.out.println("Your score is:\t\t" + score);

			for (int qq = 0; qq<5;qq++)
				{
					for (int zz=0; zz<5;zz++)
					{
						System.out.print(gameBoard[qq][zz]);
					}
						System.out.println();
				}

	}
}