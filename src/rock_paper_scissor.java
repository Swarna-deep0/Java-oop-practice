import java.util.Random;
import java.util.Scanner;

class rockgame {
    int guess;
    int no;
    String[]input={"rock","paper","scissor"};

    rockgame() {
        System.out.println("choose 0 for rock , 1 for paper , 2 for scissor");
        Random rn = new Random();
        no = rn.nextInt(3);
    }

    public void userinput() {
        Scanner sc = new Scanner(System.in);
        while(true){ //infinite loop
            System.out.print("Guess it! : ");
            if(sc.hasNextInt()){
                guess=sc.nextInt();
                if (guess>=0 && guess<=2){
                    break;
                }
                else {
                    System.out.println("invalid input");
                }
            }
            else {
                System.out.println("Give number not words or letter");
                sc.next(); //clear
            }
        }
    }
    public void checking(){
        if(guess==no){
            System.out.println("Draw !");
        }
        else if (guess==0 && no==2 || guess==1 && no==0 || guess==2 && no==1) {
            System.out.println("you win dude");
        }
        else {
            System.out.println("computer win ");
        }
        System.out.println("computer choice was : " + input[no]);
    }
}
public class rock_paper_scissor {
    public static void main(String[] args) {
        rockgame game = new rockgame();
        game.userinput();
        game.checking();
    }
}
