// Program to print n  natural number
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        int n,i,sum=0;
        Scanner scanobj=new Scanner(System.in);
         System.out.println("Enter a number  ");
        n=scanobj.nextInt();
        for(i=1;i<=n;i++){
         sum=sum+i;   
        }
        System.out.println(" Sum of first "+n+" natural num is "+sum);
    }
}
