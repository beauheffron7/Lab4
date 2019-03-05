//Beau Heffron
//Period 9
//"S:\\HS\\COMPSCI2\\REPOSITORY\\data\\fnum1.txt"
//int num = inFile.nextInt();
import java.util.Scanner;
import java.io.*;
public class L4P1
{
	public static void main(String args[])
	{
		try
							{

								Scanner sc = new Scanner(System.in);
								System.out.print("What is the name of your file?");
								String fileName = sc.nextLine();
								Scanner inFile = new Scanner(new File(fileName));
								int count = 0;
								while(inFile.hasNextInt())
								{
									int num = inFile.nextInt();
									count++;
								}
								Scanner file = new Scanner(new File(fileName));
								int[] nums = new int[count];
								while(file.hasNextInt())
								{
									int num;

									for (int a=0; a<count; a++)
									{
									num = file.nextInt();
									nums[a] = num;
									//System.out.println(nums[a]);
									}
								}
								System.out.println(L4P1.length(nums));
								System.out.println(L4P1.mean(nums));
								System.out.println(L4P1.results(nums)[0]);
								System.out.println(L4P1.results(nums)[1]);
								System.out.println(L4P1.even(nums));
								//System.out.println(count);
							}catch(FileNotFoundException e)
							{
								System.out.println("BAD FILE!");
							}
}


					public static int length(int[] nums)
					{
						return 	nums.length;
					}



					public static int mean(int[] nums)
					{
						int sum = 0;
						for (int x = 0;x<nums.length;x++)
						{
						 sum +=	nums[x];

						}
						int mean = sum/(nums.length);
						return mean;
					}


					public static int[] results(int[] nums)
					{
						int min = nums[0];
						int max = nums[0];
						int[] results = new int[2];
						for (int x = 0;x<nums.length;x++)
						{
							if (nums[x]<min)
							{
								min = nums[x];
							}
							if (nums[x]>max)
							{
								max = nums[x];
							}


						}
							results[0]=min;
							results[1]=max;
							return results;
					}
					public static int even(int[] nums)
							{
								int even = 0;
								int number = 0;
								for (int x = 0;x<nums.length;x++)
									{
									   number=	nums[x];
									   if (number%2==0)
									   {
										   even++;
										}

									}
									return even;
							}
}