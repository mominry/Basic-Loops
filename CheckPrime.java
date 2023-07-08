class CheckPrime{
	public static void main(String args[]){
		
		int middleNumber,i;
		int flag = 0;
		int checkNumber = Integer.parseInt(args[0]);
		middleNumber = checkNumber/2;
		
		if(checkNumber ==0 || checkNumber == 1)
		{
		
			System.out.println("number is not prime");
		
		}
		
		else
		{
			for(i=2;i<middleNumber;i++)
			{
				if(checkNumber%i==0)
				{
					flag = 1;
					break;
				}
			
			
			}
			
			if(flag==1)
			{
				System.out.println("number is not prime");
			
			}
			else
			{
				System.out.println("number is prime");
			}
		
		
		}
	}



}

/*
D:\Aurionpro 22\cmdJavaPrograms>java CheckPrime 7
number is prime


*/