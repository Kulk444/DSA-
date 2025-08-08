import java.util.*;
public class palindromeno {

	public static boolean checkno(int number)
	{
		if (number < 0) return false;

        int original = number;
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10; 
            reversed = reversed * 10 + digit;
            number /= 10; 
        }

        return original == reversed;
	}
	
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the no");
      int number=sc.nextInt();
      
     System.out.println(checkno(number));
      
	}

}
