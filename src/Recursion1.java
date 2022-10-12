import java.util.Scanner;

public class Recursion1 {
    public static void main(String[] args) {

        System.out.println("enter two number");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        for (int i=a;i>0;i--){
            System.out.println(1*i);
        }
        while (b>1){
            int m=b*1;
            b-=1;System.out.println(m);
        }

    }
    //method

}
