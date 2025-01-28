import java.util.Scanner;
import java.util.Random;
public class GuessMyNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        int user=0;
        int Guess=random.nextInt(10);
        while(user!=Guess){
            System.out.println("Enter your guess:");
            user=sc.nextInt();
            if(user<Guess){
                System.out.println("too small, try again!");
            }
            else if(user>Guess){
                System.out.println("too big, try again!");
            }
            else{
                System.out.println("you won!!");
            }
        }
    }
}
