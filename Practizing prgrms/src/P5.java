
public class P5 {
	public static void main(String[] args) {
		 
        int num=1569 , rem, sum=0;
        for (int i = num; i > 0; i = i / 10)
        {
            rem = i % 10;
            sum = sum + (rem)*6;
        }
            System.out.print("power of sum of  digits:" +sum);
        if(sum==num)
        {
            System.out.print("\n" + num + " is an Armstrong Number\n");
        }
        else
        {
            System.out.print("\n" + num + " is Not an Armstrong Number\n");
        }
 
    }
 
}

