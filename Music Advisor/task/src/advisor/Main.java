package advisor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        while (scanner.hasNext()){
            String input = scanner.nextLine();
            if(input.equals("new")){
                printnew();
            }else if(input.equals("featured")){
                printFeatured();
            }else if(input.equals("categories")){
                printCategories();
            }else if(input.equals("playlists Mood")){
                printPlaylistMood();
            }else if(input.equals("exit")){
                doexit();
                break;
            }
        }




    }

    private static void doexit() {
        System.out.println("---GOODBYE!---");
    }

    private static void printPlaylistMood() {
        System.out.println("---MOOD PLAYLISTS---");
        System.out.println("Walk Like A Badass");
        System.out.println("Rage Beats");
        System.out.println("Arab Mood Booster");
        System.out.println("Sunday Stroll");
    }

    private static void printCategories() {
        System.out.println("---CATEGORIES---");
        System.out.println("Top Lists");
        System.out.println("Pop");
        System.out.println("Mood");
        System.out.println("Latin");
    }

    private static void printFeatured() {
        System.out.println("---FEATURED---");
        System.out.println("Mellow Morning");
        System.out.println("Wake Up and Smell the Coffee");
        System.out.println("Monday Motivation");
        System.out.println("Songs to Sing in the Shower");

    }

    private static void printnew() {
        System.out.println("---NEW RELEASES---");
        System.out.println("Mountains [Sia, Diplo, Labrinth]");
        System.out.println("Runaway [Lil Peep]");
        System.out.println("The Greatest Show [Panic! At The Disco]");
        System.out.println("All Out Life [Slipknot]");
    }
}
