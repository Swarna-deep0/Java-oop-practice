package com;

import java.util.Random;
import java.util.Scanner;

class RockPaperScissorGame {
    private static final String[] CHOICES = {"Rock", "Paper", "Scissor"};
    private static final Random RANDOM = new Random();
    
    private final Scanner scanner;
    private int userChoice;
    private int computerChoice;

    public RockPaperScissorGame() {
        this.scanner = new Scanner(System.in);
    }

    public void play() {
        try {
            displayMenu();
            getUserInput();
            generateComputerChoice();
            showResult();
        } catch (Exception e) {
            System.err.println("Game error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private void displayMenu() {
        System.out.println("\n=== ROCK PAPER SCISSOR ===");
        for (int i = 0; i < CHOICES.length; i++) {
            System.out.println(i + " - " + CHOICES[i]);
        }
        System.out.println("==========================");
    }

    private void getUserInput() {
        while (true) {
            System.out.print("Enter choice (0-2): ");
            try {
                String input = scanner.nextLine().trim();
                if (input.isEmpty()) {
                    System.out.println("Please enter a number!");
                    continue;
                }
                
                userChoice = Integer.parseInt(input);
                if (userChoice >= 0 && userChoice < CHOICES.length) {
                    break;
                }
                System.out.println("Enter 0, 1, or 2 only!");
            } catch (NumberFormatException e) {
                System.out.println("Numbers only!");
            }
        }
    }

    private void generateComputerChoice() {
        computerChoice = RANDOM.nextInt(CHOICES.length);
    }

    private void showResult() {
        System.out.println("\nYou: " + CHOICES[userChoice]);
        System.out.println("Computer: " + CHOICES[computerChoice]);
        
        int result = (userChoice - computerChoice + 3) % 3;
        switch (result) {
            case 0 -> System.out.println("DRAW!");
            case 1 -> System.out.println("YOU WIN!");
            case 2 -> System.out.println("COMPUTER WINS!");
        }
    }
}
public class rock_paper_scissor {
    public static void main(String[] args) {
        new RockPaperScissorGame().play();
        System.out.println("\nThanks for playing!");
    }
}
