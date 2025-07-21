import java.util.Random;
import java.util.Scanner;

class game{
    int num;
    int guess;
    game(){ //constructor
        Random rn = new Random();
        num = rn.nextInt(0, 100);
    }
    public void guess(){
        Scanner sc = new Scanner(System.in);
        System.out.print("what is your guess : ");
        guess = sc.nextInt();
        if (guess<0){
            System.out.println("No ! negative integer is allowed in game");
        }
    }
    public boolean check(){
        if (guess==num){
            System.out.println("ah! you are correct");
            return true;
        }
        else if (guess>num) {
            System.out.println("Too greater , Try again baby .");
        }
        else {
            System.out.println("Too lower , Try again baby .");
        }
        return false;
    }
}
public class guess_game {
    public static void main(String[] args) {
        game guessit = new game();
        boolean iscorrect = false;
        while (iscorrect==false){
            guessit.guess();
            iscorrect = guessit.check(); // return the value until it get matched
        }
    }
}
