import java.util.Scanner;

public class primeinrange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();
        for (int i=low; i <= high; i++ )
        {
            Boolean isPrime = true;
            for(int div = 2; div*div <= i; div++)
            {
            if(i%div==0)
            {
                isPrime = false;
                break;

            }
             }
            if(isPrime == true)
            {
             System.out.println(i);
            }
       
        }
    }
}
