package com;

import java.util.Random;
import java.util.Scanner;

class Game {
    private final int target = new Random().nextInt(100);
    private final Scanner sc = new Scanner(System.in);
    
    public boolean play() {
        System.out.print("Your guess: ");
        int guess = sc.nextInt();
        
        if (guess < 0) {
            System.out.println("Negative numbers not allowed!");
            return false;
        }
        
        if (guess == target) {
            System.out.println("Correct!");
            return true;
        }

        System.out.println(guess > target ? "Too high!" : "Too low!");
        return false;
    }
}

public class guess_game {
    public static void main(String[] args) {
        Game game = new Game();
        while(!game.play());
    }
}
