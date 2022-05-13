package progs;

import java.util.*;


public class Test 
{
public static void main(String args[])
{
//	*******************************Arrays***************************
	int a[]={1,2,3,4};
//	for(int i: a)
//	System.out.println(i);	
	
	int b[]= new int[5];
	b[0]=1;
	b[1]=2;
	b[2]=3;
	b[3]=4;
	b[4]=5;
	System.out.println(b.length);
	
	
	for(int i=0;i<b.length;i++)
		System.out.println(b[i]);
	
	int a2[][]= new int[2][2];
	int b2[][]= {{1,2,3},
				 {4,5,6},
				 {7,8,9}};
	
	System.out.println("2d");
	System.out.println(b2.length);
	
	for(int i=0;i<b2.length;i++)
	{
		for(int j=0;j<b2[0].length;j++)
		{
			System.out.print(b2[i][j]);
		}
		System.out.println();
	}
	//------------------------------------------------
	
	Integer sortarray[]= {1,2,5,7,8,3,6,7,34,2};
	System.out.println("array index");
	
	System.out.println(Arrays.binarySearch(sortarray, 2));
	
	Arrays.sort(sortarray,Collections.reverseOrder());
	
	System.out.println(Arrays.toString(sortarray));
	
//********************************Strings****************************
	
	System.out.println("Strings");
	
	String s= "Sukumar";
	System.out.println(s.length());
	
	
	
		
		
}

}
