package advisor;

import java.util.Scanner;

public class Main {
    public static boolean auth_flag = false;
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
            }else if(input.equals("playlists Mood")) {
                printPlaylistMood();
            }else if(input.equals("auth")){
                auth();
            }else if(input.equals("exit")){
                doexit();
                break;
            }
        }




    }

    private static void auth(){
        auth_flag = true;
        System.out.println("https://accounts.spotify.com/authorize?client_id=20f41923e4c143d89ab5824c109beda7&redirect_uri=http://localhost:8080&response_type=code");
        System.out.println("---SUCCESS---");
    }



    private static void doexit() {
        System.out.println("---GOODBYE!---");
    }

    private static void printPlaylistMood() {
        if(auth_flag){
            System.out.println("---MOOD PLAYLISTS---");
            System.out.println("Walk Like A Badass");
            System.out.println("Rage Beats");
            System.out.println("Arab Mood Booster");
            System.out.println("Sunday Stroll");
        }else{
            System.out.println("Please, provide access for application.");
        }

    }

    private static void printCategories() {
        if(auth_flag){
            System.out.println("---CATEGORIES---");
            System.out.println("Top Lists");
            System.out.println("Pop");
            System.out.println("Mood");
            System.out.println("Latin");
        }else{
            System.out.println("Please, provide access for application.");
        }

    }

    private static void printFeatured() {
        if(auth_flag){
            System.out.println("---FEATURED---");
            System.out.println("Mellow Morning");
            System.out.println("Wake Up and Smell the Coffee");
            System.out.println("Monday Motivation");
            System.out.println("Songs to Sing in the Shower");
        }else{
            System.out.println("Please, provide access for application.");
        }


    }

    private static void printnew() {
        if(auth_flag){
            System.out.println("---NEW RELEASES---");
            System.out.println("Mountains [Sia, Diplo, Labrinth]");
            System.out.println("Runaway [Lil Peep]");
            System.out.println("The Greatest Show [Panic! At The Disco]");
            System.out.println("All Out Life [Slipknot]");
        }else{
            System.out.println("Please, provide access for application.");
        }

    }
}
