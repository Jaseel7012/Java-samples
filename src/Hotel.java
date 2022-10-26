import java.util.Scanner;


public class Hotel {
 public static void ne(){
     System.out.println("1. menu \n 2.room availabilty \n 3.book 4.exit");
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     while (n==4){
         break;
     }
     switch (n){
         case 1:
             System.out.println(",2,3,,4,5");
             break;
         case 2:
             System.out.println("1,2,3,4,7");
             break;
         case 3:
             System.out.println("nme.contact");
             System.out.println("continue?y/n");
             Scanner scc=new Scanner(System.in);
             char st=scc.next().charAt(0);
             if (st=='y'){
                 System.out.println("got");
             } else if (st=='n') {
                 break;
             }

         case 4:
             break;

     }
 }





    public static void main(String[] args) {
     ne();
    }
}
