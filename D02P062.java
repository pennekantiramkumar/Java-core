package com.learning.core.day2session2;
import java.util.Scanner;

class NotEligibleException extends Exception {
    public NotEligibleException(String message) {
        super(message);
    }
}

class D02P0062 {
    private String playerName;
    private float critic1;
    private float critic2;
    private float critic3;
    private float avgRating;
    private String coins;

    public D02P0062(String playerName, float critic1, float critic2) throws NotEligibleException {
        this.playerName = playerName;
        this.critic1 = critic1;
        this.critic2 = critic2;
        calculateAverageRating(critic1, critic2);
        this.coins = calculateCoins();
    }

    public D02P0062(String playerName, float critic1, float critic2, float critic3) throws NotEligibleException {
        this.playerName = playerName;
        this.critic1 = critic1;
        this.critic2 = critic2;
        this.critic3 = critic3;
        calculateAverageRating(critic1, critic2, critic3);
        this.coins = calculateCoins();
    }

    public void calculateAverageRating(float critic1, float critic2) throws NotEligibleException {
        avgRating = (critic1 + critic2) / 2;
        if (avgRating < 2)
            throw new NotEligibleException("Player is not eligible.");
    }

    public void calculateAverageRating(float critic1, float critic2, float critic3) throws NotEligibleException {
        avgRating = (critic1 + critic2 + critic3) / 3;
        if (avgRating < 2)
            throw new NotEligibleException("Player is not eligible.");
    }

    public String calculateCoins() {
        if (avgRating >= 7)
            return "Gold";
        else if (avgRating >= 5)
            return "Silver";
        else if (avgRating >= 2)
            return "Copper";
        else
            return "Not Eligible";
    }

    public void display() {
        System.out.println(playerName + " " + avgRating + " " + coins + ".");
    }
}

public class D02P062 {
    public static void main(String[] args) throws NotEligibleException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter player details: (name critic1 critic2 [critic3])");
        String playerName = sc.next();
        float critic1 = sc.nextFloat();
        float critic2 = sc.nextFloat();
        float critic3 = 0;

        if (sc.hasNextFloat()) {
            critic3 = sc.nextFloat();
            D02P0062 player = new D02P0062(playerName, critic1, critic2, critic3);
			player.display();
        } else {
            D02P0062 player = new D02P0062(playerName, critic1, critic2);
			player.display();
        }

        sc.close();
    }
}

