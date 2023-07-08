class Fibonacci{
public static void main(String args[])
{
 
 int n1=0,n2=1,n3,i,count=0;  
 count = Integer.parseInt(args[0]);
 System.out.print(n1+" "+n2);
 
 if(count<1)
 {
	 System.out.print(n2);
 }
  
 else{ 
 for(i=2;i<count;i++)  
 {  
	n3=n1+n2;  
	System.out.print(" "+n3);  
	n1=n2;  
	n2=n3;  
 } 
 } 

}}

 /*
D:\Aurionpro 22\cmdJavaPrograms>java Fibonacci 8
0 1 1 2 3 5 8 13
 
 */