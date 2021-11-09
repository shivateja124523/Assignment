1
-------------------------------------------------------------------
FIND ARMSTRONG NUMBER
-------------------------------------------------------------------
import java.io.*;

import java.util.*;

import java.lang.Math;

public class ArmstrongNumber
{
	
static void checkArmstrong(int n)
	
{
		
int count=0,rem=0,temp=n;
		
double x=0.0;
		
while(temp!=0)
		
{			
temp=temp/10;
			
count=count+1;
		
}
		
System.out.println("Number of digits is "+count);
		
temp=n;
		
while(temp!=0)
		
{
			
rem=temp%10;
			
x= x + Math.pow(rem,count);
			
temp=temp/10;
		
}
		
if(x==n)
		
{
			
System.out.println("Given number " + n + " is an armstrong number");
		
}
		
else
		
{
			
System.out.println("Given number " + n + " is not an armstrong number");
		
}	
	
}
	
public static void main(String[] args) 
{
		
Scanner sc=new Scanner(System.in);
		
System.out.println("Enter a number:");
		 
int a=sc.nextInt();
		 
System.out.println("Entered number:"+a);
		 
checkArmstrong(a);
	
}

}
-----------------------------------------------------------------------
2 FIND ARMSTRONG NUMBER RANGE BETWEEN 100-999
--------------------------------------------------------------------
import java.io.*;

import java.lang.Math;

import java.util.*;

public class ArmstrongNumberRange

{
	
static void checkArmstrongRange()
	
{
		
int i;
		
for(i=101;i<1000;i++)
		
{

int count=0,rem=0,temp=i;
			
double x=0.0;
			
while(temp!=0)
			
{
				
temp=temp/10;
				
count=count+1;
			
}
			
//System.out.println("Number of digits is "+count);
			
temp=i;
			
while(temp!=0)
			
{
				
rem=temp%10;
				
x= x + Math.pow(rem,count);
				
temp=temp/10;
			
}
			
if(x==i)
			
{

System.out.println("Given number " + i + " is an armstrong number");
			
}
		
}
	
}
	
public static void main(String[] args) 
	
{
		
checkArmstrongRange();
	
}

}
----------------------------------------------------------
3 FIND SIMPLE AND COMPOUND INTEREST
-------------------------------------------------------------
import java.io.*;

import java.util.*;

import java.lang.Math;

public class SimpleAndCompoundInterest 
{
	
static double simpleInterest(double p,double t,double r)
	
{
		
double simple;
		
simple=(p*t*r)/100;
		
return simple;
		
	
}
	
static double compoundInterest(double p,double t,double r) 
	
{
		
double compound;
		
compound= p*(Math.pow((1 + (r/100)),t));
		
return compound;
	
}
	
public static void main(String[] args) 

{
		
Scanner sc = new Scanner(System.in);
		
double p,t,r;
		
double s,c;
		
System.out.println("Enter Principal: ");
		
p=sc.nextInt();
		
System.out.println("Enter Time: ");
		
t=sc.nextInt();
		
System.out.println("Enter Rate: ");
		
r=sc.nextInt();
		
s=simpleInterest(p,t,r);
		
c=compoundInterest(p,t,r);
		
System.out.println("Simple Interest is "+ s + " and Compound Interest is " + c);
		
	
}
}
----------------------------------------------------------------
4 FIND THE RESULTS OF EACH SUBJECTS
----------------------------------------------------------------
import java.io.*;

import java.util.*;

import java.lang.Math;

public class ResultOfThreeSubjects 

{
	
static void result(int [] x)
	
{
		
if(x[0] > 60)
		
{
			
if(x[1] > 60)
			
{
				
if(x[2] > 60)
				
{
					
System.out.println("Passed");
				
}
				
else
				
{
					
System.out.println("Promoted");
				
}	
			
}
			
else
			
{
				
System.out.println("Failed");
			
}
		
}

else
		
{
			
System.out.println("Failed");
		
}
	
}

	
public static void main(String[] args) 
	
{
		
Scanner sc=new Scanner(System.in);
		
int i=0,j=0,temp;
		
int a[]=new int[3];
		
System.out.println("Enter marks of three subjects: ");
		
for(i=0;i<3;i++)
		
{
			
a[i]=sc.nextInt();
		
		
}
		
for(i=0;i<3;i++)
		
{
			
for(j=i+1;j<3;j++)
			
{
				
if(a[i] < a[j])
				
{
					
temp=a[i];
					
a[i]=a[j];
					
a[j]=temp;
							
				
}
			
}
		
}
		
result(a);
	
}

}
------------------------------------------------------------
5 CALCULATE THE INCOME TAX
------------------------------------------------------------
import java.io.*;

import java.util.*;

import java.lang.Math;

public class IncomeTax 
{
	
public static void main(String[] args) 
{
		
Scanner sc=new Scanner(System.in);
		
double tax=0.0;
		
System.out.println("Enter your salary (per annum): ");
		
double salary=sc.nextDouble();
		
System.out.println("You salary per annum is "+salary);
		
if((salary > 0) && (salary < 180000))
		
{
			
tax=0.0;
		
}
		
else if((salary > 181001.0) && (salary < 300000.0))
		
{
			
tax=salary*(0.1);
		
}
		
else if((salary > 300001) && (salary < 500000))
		
{
			
tax=salary*(0.2);
		
}
		
else if((salary > 500001) && (salary < 1000000))
		
{
			
tax=salary*(0.3);
		
}
		
System.out.println("The income tax amount need to be paid is " +tax);
	
}

}
---------------------------------------------------------------------
6 VALIDATE LOGIN FOR A USER
---------------------------------------------------------------------
import java.io.*;

import java.util.*;

import java.lang.Math;

class ValidateLogin 

{
	
static void validation(String name,String pwd,int attempts)
	
{
		
String n="Shuaib",p="123";
		
int result;
		
if(attempts!=3)
		
{
			
if(name.equals(n) && pwd.equals(p))
			
{
				
System.out.println("Welcome " + name);
			
}
			
else
			
{
				
System.out.println("Invalid Login");
				
attempts=attempts+1;
				
enterDetails(attempts);
				
if(attempts==3)
				
{
					
System.out.println("Login limit exceeded....!!!");
				
}
			
}

		
}
	
}
	
static void enterDetails(int attempts)
	
{
		
Scanner sc=new Scanner(System.in);
		
String password,name;
		
System.out.println("Enter the username:");
		
name=sc.next();
		
System.out.println("Enter password:");
		
password=sc.next();
		
//System.out.println(name+"  "+password);
		
validation(name,password,attempts);
	
}
	
public static void main(String[] args) 
	
{
		
int attempts=1;
		
enterDetails(attempts);
	
}
	
	


}
---------------------------------------------------------------
7 SEARCH IN ARRAY
----------------------------------------------------------------
import java.io.*;

import java.util.*;

import java.lang.Math;

public class SearchInArray 

{
	
public static void main(String[] args) 
	
{
		
Scanner sc=new Scanner(System.in);
		
int a[]=new int[15];
		
int i,key;
		
boolean found=false;
		
System.out.println("Enter 15 elements in the array: ");
		
for(i=0;i<15;i++)
		
{
			
a[i]=sc.nextInt();
		
}
		
System.out.println("Enter the element to be searched: ");
		
key=sc.nextInt();
		
for(i=0;i<15;i++)
		
{
			
if(a[i]==key)
			
{
				
found=true;
				
System.out.println("Key " + key + " found in the array");
				
break;
			
}
		
}
		
if(found==false)
		
{
			
System.out.println("Key " + key + " not found in the array");
		
}

	
}

}
---------------------------------------------------------------
8 BUBBLE SORT IN AN ARRAY
-----------------------------------------------------------
import java.io.*;

import java.util.*;

import java.lang.Math;

public class BubbleSort

{
	
static void bubbleSort(int a[],int key)
	
{
		
int i,j,temp;
		
boolean found=false;
		
for(i=0;i<14;i++)
		
{
			
for(j=0;j<(14-i);j++)
			
{
				
if(a[j] > a[j+1])
				
{
					
temp=a[j];
					
a[j]=a[j+1];
					
a[j+1]=temp;
				
}
				
			
}
		
}
		
for(i=0;i<15;i++)
		
{
			
if(a[i]==key)
			
{
				
found=true;
				
System.out.println("Key " + key + " found in the array");
				
break;
			
}
		
}
		
if(found==false)
		
{
			
System.out.println("Key " + key + " not found in the array");
		
}
		
	
}

	
	
public static void main(String[] args)
	
{
		
Scanner sc=new Scanner(System.in);
		
int a[]=new int[15];
		
int i,key;
		
System.out.println("Enter 15 elements in the array: ");
		
for(i=0;i<15;i++)
		
{
			
a[i]=sc.nextInt();
		
}
		
System.out.println("Enter the element to be searched: ");
		
key=sc.nextInt();
		
bubbleSort(a,key);
	
}

}
---------------------------------------------------------
9 FIND TOTAL AND AVERAGE
--------------------------------------------------------------
import java.io.*;

import java.util.*;

import java.lang.Math;

public class TotalAndAvg 

{
	
public static void main(String[] args) 
	
{
		
Scanner sc=new Scanner(System.in);
		
int a,b,c,total;
		
double avg=0.0;
		
System.out.println("Enter the marks of A subject: ");
		
a=sc.nextInt();
		
System.out.println("Enter the marks of B subject: ");
		
b=sc.nextInt();
		
System.out.println("Enter the marks of C subject: ");
		
c=sc.nextInt();
		
total=a+b+c;
		
avg=(total/3);
		
System.out.println("Total marks scored is "+total+" and average is "+avg);
		
//System.out.println("Total marks in A subject is "+a+" its average is "+(a/100));
		
	
}

}