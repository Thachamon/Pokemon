import java.util.ArrayList;
import java.util.Scanner;

public class PokemonGame {
    public static void main(String args[]) {
        Boolean start;
        int number;
        Scanner get = new Scanner((System.in));
        //Pokemon pokemon = new Pokemon();
        // pokemon.run();
        //Pokemon player = new Pokemon(100);
        Pokemon pokemon = new Pokemon("Pokeball", 100);
        start = true;

       while (start) {
        System.out.println("****************************");
        //System.out.println("Welcome new player");
        System.out.println("Please Enter the activity number to do");
        System.out.println("Enter 1 : Eat");
        System.out.println("Enter 2 : Sleep");
        System.out.println("Enter 3 : Attack");
        System.out.println("Enter 4 : Show Skill");
        System.out.println("Enter 0 : Exit");
        System.out.println();
        System.out.println("****************************");
        System.out.print("Enter number : ");
        number = get.nextInt();
        System.out.println("****************************");

        if (number == 1) {

            System.out.println("Enter 1 : Eat Berry");
            System.out.println("Enter 2 : Eat Water");
            System.out.println("****************************");
            System.out.print("Please Enter the number: ");
            int key = get.nextInt();

            if (key == 1) {
                pokemon.increaseHP(5);
            }
            if (key == 2) {
                pokemon.increaseHP(10);
            }
        }

        if (number == 2){
            pokemon.increaseHP(15);
        }

        if (number == 3) {

            System.out.println("Enter 1 : Attack fish");
            System.out.println("Enter 2 : Attack rabbit");
            System.out.println("Enter 3 : Attack fox");
            System.out.print("Please Enter the number: ");
            int key = get.nextInt();

            if (key == 1) {
                pokemon.decreaseHP(10);
            }
            if (key == 2) {
                pokemon.decreaseHP(5);
            }
            if (key == 3) {
                pokemon.decreaseHP(15);
            }
        }
        if (number == 4){
            
        }
        if (number == 0){
            start = false;
                System.out.println();
                System.out.print("Bye Bye!!");
        }

        }
    }
}