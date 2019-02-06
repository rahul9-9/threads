import java.util.Scanner;
import java.util.*;
class pattern
{

public static void main(String[] args)
{
int i;
int a=12;
int b=8;
int c=0;
int d=0;

int[] x = new int[10];
int[] y=new int[10];
for(i=2;i<b;i++)
{
	if(a%i==0)
	{
		x[c]=i;
		c++;
	}
	
	
}

for(i=2;i<b;i++)
{
	if(b%i==0)
	{
	y[d]=i;
	d++;
	}
	
	
}
int k;
for(i=0;i<10;i++)
{
	if(x[i]==y[i])
	{
	 k=x[i];
	}
	
	
}	

System.out.print(k);
}

}