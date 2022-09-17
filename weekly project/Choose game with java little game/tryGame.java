import java.util.Random;
import java.util.Scanner;

public class tryGame {
    public static void main(String[]args) {
        Random r=new Random();
        int x=r.nextInt(10);
        System.out.println("Choose the number for (you have 5 chance and number willbw in 0-10:\n");
        for(int i=4;i>=0;i--){
        Scanner scanner = new Scanner(System.in);
            int a=scanner.nextInt();
           
          
                //System.out.println(x);
                if(a==x){
                    System.out.println("CONGRATULLATION!");
                    break;
                }else if(a>x){
                    
                   System.out.println("Oppos! you have "+i+" time \n Choose lower number:");

                }else if(a>x){
                    System.out.println("Oppos! you have "+i+" time \n Choose bigger number:");
                  
            }    
            
   }
        }
    
}



