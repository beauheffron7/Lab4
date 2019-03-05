//Beau Heffron
//Period 9
//

import java.util.*;
public class L4P3
{
	public static void main(String args[])
	{
			Scanner sc = new Scanner(System.in);
			System.out.print("input a magic number;\t\t");
			int magic = sc.nextInt();
				while ((magic <3 || magic > 20)||(magic%2==0))
				{
					System.out.println("THAT IS NOT AN ODD NUMBER WITHIN THE RANGE OF 3 AND 20!");
					System.out.print("input new magic number;\t\t");
					magic = sc.nextInt();
				}

			int [][] magics = new int [magic][magic];

			int x = 0;
			int y = ((magic-1)/2);
			int w = 0;
			int z = ((magic-1)/2);
			magics[x][y]=1;
			for(int q = 2;q<=(magic*magic);q++)
			{
				x--;
				y++;

				if (x<0)
				{
					x=(magic-1);

				}
				if(y>magic-1)
				{
					y=0;
				}

				if(magics[x][y]==0)
				{

					magics[x][y]= q;
				}else
				{
					x=w+1;
					y=z;
					magics[x][y]=q;
				}
				w=x;
				z=y;
			}
		for(int r = 0; r<(magic);r++)
		{
			for(int c = 0; c<(magic);c++)
			{
				System.out.print(magics[r][c]+"\t");
			}
			System.out.println();
		}
	}

}