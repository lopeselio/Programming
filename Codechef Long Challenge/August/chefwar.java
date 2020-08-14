/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Sanner scanner = new Scanner(Sytem.in);
		int test = scanner.nextInt();
		while(test!=0){
		    String s[]= scanner.nextLine().split(" ");
            
            int H = Integer.parseInt(s[0]);
            int P = Integer.parseInt(s[1]);
		    while(H != 0 && P != 0){
		        if(H>P){
		            H-=P;
		        }
		        else{
		            H=0;
		        }
		        P /= 2;
		    }
		    if(H!=0){
		        System.out.println(0);
		    }
		    else{
		        System.out.println(1);
		    }
		    test -= 1;
		}
// 		sc.close();
	}
}
