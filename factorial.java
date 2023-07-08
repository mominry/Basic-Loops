class factorial{
	public static void main(String args[]){
		
		int number = Integer.parseInt(args[0]);
		int factorialOfNumber = 1;
		
		for(int i=1;i<=number;++i){
		
		factorialOfNumber = factorialOfNumber*i;
		
		}
	
		System.out.println("factorial is "+factorialOfNumber);
	
	}



}

/*

D:\Aurionpro 22\cmdJavaPrograms>java factorial 5
factorial is 120


*/