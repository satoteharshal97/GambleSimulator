package com.example.gamblesimulator;

public class GambleSimulator {
    public static  int everyDayStake = 100;
    public static  int eachGameBet = 1;
    public static final int WON_GAME = 1;
    public static final int LOST_GAME = 0;

    public static void main(String[] args) {
        gamble();
    }
    static void gamble(){
        int bet = (int) Math.floor(Math.random() * 2);
        switch(bet){
            case WON_GAME:
                System.out.println("Player won :" + (eachGameBet) + "$");
                break;
            case LOST_GAME:
                System.out.println("Player lost :" + (eachGameBet) + "$");
                break;
        }
        everyDayStake = (everyDayStake * 50) / 100;
        System.out.println("Stake would become: " + everyDayStake);
    }
}
