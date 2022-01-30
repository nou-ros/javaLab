package adventureGame;
import java.util.Scanner;
import java.util.Random;

public class TextAdventureGame {
    public static void main(String args[]){

        // System objects
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        //Game variables - enemy
        String enemies[] = {"Skeleton", "Zombie", "Warrior", "Assassin"};
        int maxEnemyHealth = 75;
        int enemyAttackDamage = 25;

        //player 
        int health = 100;
        int attackDamage = 50;
        int numHealthPotions = 3;
        int healthPotionHealAmount = 30;
        int healthPotionDropChance = 50; //percentage

        boolean running = true;

        System.out.println("Welcome to the adventure Dungeon");
        
        //labeling while loop as game
        GAME:
        while(running){
            System.out.println("------------------------------------------");
            int enemyHealth = rand.nextInt(maxEnemyHealth);
            String enemy = enemies[rand.nextInt(enemies.length)];
            System.out.println("\t# " + enemy + " has appeared! #\n");
            while(enemyHealth > 0){
                System.out.println("\tYour HP: " + health);
                System.out.println("\t" + enemy + "'s HP: " + enemyHealth);
                System.out.println("\n\tWhat would you like to do?");
                System.out.println("\t1. Attack");
                System.out.println("\t2. Drink health potion");
                System.out.println("\t3. Run!");
                
                String input = scan.nextLine();
                if(input.equals("1")){
                        int damageDealt = rand.nextInt(attackDamage);
                        int damageTaken = rand.nextInt(enemyAttackDamage);
                        enemyHealth -= damageDealt;
                        health -= damageTaken;
                        System.out.println("\t> You strike the " + enemy + " for " + damageDealt + " damage.");
                        System.out.println("\t> You took " + damageTaken + " in retaliation.");
                        if(health < 1){
                            System.out.println("\t> You have taken too much damage, you are too weak to go on!");
                            break;
                        }
                }else if(input.equals("2")){
                    if(numHealthPotions > 0){
                        health += healthPotionHealAmount;
                        numHealthPotions--;
                        System.out.println("\t>You drink a health potion of " + healthPotionHealAmount + ".\n\t>Your current health is: " + health + "HP" + 
                        "\n\t> You have " + numHealthPotions + " health potion left.");
                    }else{
                        System.out.println("\t> You have no health potion. Defeat enemies for a chance to get a potion.");
                    }
                }else if(input.equals("3")){
                    System.out.println("\tYou run away from the " + enemy + "!");
                    continue GAME; // this will break out from second while loop and continue from first loop.
                }else{
                    System.out.println("\nInvalid command!");
                }
            }
            if(health < 1){
                System.out.println("You limp out of the dungeon, weak from battle.");
                break;
            }
            System.out.println("------------------------------------------");
            System.out.println(" # " + enemy + " was defeated! #");
            System.out.println(" # You have " + health + "HP left. #");
            if(rand.nextInt(100) < healthPotionDropChance){
                numHealthPotions++;
                System.out.println(" # The " + enemy + " dropped a health portion! # ");
                System.out.println(" # You now have " + numHealthPotions + " health potion(s). # ");
            }
            System.out.println("------------------------------------------");
            System.out.println("What would you like to do now?");
            System.out.println("1. Continue fighting");
            System.out.println("2. Exit dungeon");

            String input = scan.nextLine();

            while(!input.equals("1") && !input.equals("2")){
                System.out.println("Invalid command");
                input = scan.nextLine();
            }
            if(input.equals("1")){
                System.out.println("Continue on your adventure!");
            }
            else if(input.equals("2")){
                System.out.println("You exit the dungeon, successful from your adventure!");
                break;
            }
        }
        System.out.println("#######################");
        System.out.println("# THANKS FOR PLAYING! #");
        System.out.println("#######################");
        scan.close();
    }
}
