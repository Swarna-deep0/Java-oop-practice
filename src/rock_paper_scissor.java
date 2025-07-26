import java.util.Random;
import java.util.Scanner;

class RockPaperScissorGame {
    private int userChoice;
    private int computerChoice;
    private final String[] choices = {"Rock", "Paper", "Scissor"};
    private Scanner scanner;

    public RockPaperScissorGame() {
        scanner = new Scanner(System.in);
        generateComputerChoice();
    }

    private void generateComputerChoice() {
        Random random = new Random();
        computerChoice = random.nextInt(3);
    }

    public void displayMenu() {
        System.out.println("\n=== ROCK PAPER SCISSOR GAME ===");
        System.out.println("Choose your option:");
        System.out.println("0 - Rock");
        System.out.println("1 - Paper");
        System.out.println("2 - Scissor");
        System.out.println("================================");
    }

    public void getUserInput() {
        while (true) {
            System.out.print("Enter your choice (0-2): ");
            if (scanner.hasNextInt()) {
                userChoice = scanner.nextInt();
                if (userChoice >= 0 && userChoice <= 2) {
                    break;
                } else {
                    System.out.println("❌ Invalid input! Please enter 0, 1, or 2.");
                }
            } else {
                System.out.println("❌ Please enter a number, not text!");
                scanner.next();
            }
        }
    }

    public void playGame() {
        System.out.println("\n--- GAME RESULT ---");
        System.out.println("You chose: " + choices[userChoice]);
        System.out.println("Computer chose: " + choices[computerChoice]);
        System.out.println("-------------------");
        
        if (userChoice == computerChoice) {
            System.out.println("🤝 It's a DRAW!");
        } else if ((userChoice == 0 && computerChoice == 2) || 
                   (userChoice == 1 && computerChoice == 0) || 
                   (userChoice == 2 && computerChoice == 1)) {
            System.out.println("🎉 YOU WIN!");
        } else {
            System.out.println("🤖 COMPUTER WINS!");
        }
    }

    public void closeScanner() {
        scanner.close();
    }
}
public class rock_paper_scissor {
    public static void main(String[] args) {
        RockPaperScissorGame game = new RockPaperScissorGame();
        game.displayMenu();
        game.getUserInput();
        game.playGame();
        game.closeScanner();
        
        System.out.println("\nThanks for playing! 🎮");
    }
}
