import java.util.*;

public class longestPrefix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of String:");
		int n=Integer.parseInt(sc.nextLine());
		String[] strs=new String[n];
		if(n==0)
			return;
		if(n==1)
			return;
		for(int i=0; i<n; i++)
		{
			strs[i]=sc.nextLine();
		}
		String pf="";
		int min=getMin(strs,n);
		for(int i=0; i<min; i++)
		{
			int flag=0;
			int count=0;
			while(count<n-1)
			{
				if(strs[count].charAt(i)==strs[count+1].charAt(i))
				{
					count++;
					continue;
				}
				flag=1;
				break;
			}
			if(flag==0)
			{
				pf=pf+ strs[0].charAt(i);
				continue;
			}
			break;
			
		}
		System.out.println(pf);
	}
	public static int getMin(String[] a,int num)
	{
		int min=a[0].length();
		for(int i=1; i<num; i++)
		{
			if(min>a[i].length())
				min=a[i].length();
		}
		return min;
	}
}
