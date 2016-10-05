package longestPanlindromeSubstring;
import java.util.*;

public class palindrome {
	
	static String l_pal=new String("");
	static int length=0;
	static String inp=new String("");

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		inp=sc.nextLine();
		
		//check for palindrome with odd length		
		for(int i=0; i<inp.length(); i++)
		{
			expandOdd(i);
		}
		
		for(int i=0; i<inp.length()-1; i++)
		{
			expandEven(i);
		}
		System.out.println("\n" + l_pal);
	}
	
	static void expandOdd(int index)
	{
		int i=0,j=0;
		if(index==0)
		{
			l_pal=inp.substring(0, 1);
			return;
		}
		if(index==inp.length()-1)
		{
			return;
		}
		i=index-1;
		j=index+1;
		while(inp.charAt(i)==inp.charAt(j))
		{

			
			i--;
			j++;
			
			if(i<=0 || j>=inp.length()-1) 
				break;
		}
		if(i==-1)
			i=0;
		if(j==inp.length()+1)
			j--;
		String temp=inp.substring(i, j);
				if(temp.length()>l_pal.length())
				{
					l_pal=temp;
				}
	}
	
	static void expandEven(int index)
	{
		int i=0,j=0;
		if(index==0)
		{
			if(inp.charAt(index)==inp.charAt(index+1))
			l_pal=inp.substring(0, 2);
			return;
		}
		if(index==inp.length()-1)
		{
			return;
		}
		i=index;
		j=index+1;
		while(inp.charAt(i)==inp.charAt(j))
		{			
			i--;
			j++;
			
			if(i<=0 || j>=inp.length()-1) 
				break;
			
			i--;
			j++;
		}
		if(i==-1)
			i=0;
		if(j>inp.length())
			j--;
		String temp=inp.substring(i, ++j);
				if(temp.length()>l_pal.length())
				{
					l_pal=temp;
				}
	}
	

}
