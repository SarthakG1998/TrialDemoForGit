import java.util.Scanner;

class SumNumbers{

   public static int getSum(int num){
	int sum = 0;
      for(int i=1;i<=num;i++){
	sum = sum + i;
	}
     return sum;

	}

	public static void main(String [] args){
       Scanner sc = new Scanner(System.in);

       System.out.println("Enter Number :");
       int no = sc.nextInt();

       int output=getSum(no);
      System.out.println("Output is given as :"+output);

      

	

	}


}