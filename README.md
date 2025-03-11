# Gunfight-Survival
A simple Java-based survival game where players can take hits from two types of guns. Each hit reduces health based on whether the player has armour. The objective is to survive as long as possible before health reaches zero.


Description

Gunfight Survival is a simple Java-based console game where players must survive multiple gunshots with varying damage values. Players can equip armour for added protection. The objective is to survive as long as possible before the player's health reaches zero.

Features

Add player details like name, health, weapon, and armour status.

Two types of guns with different damage outputs.

Armour reduces damage impact.

Dynamic health management and player death status.

How to Run

Clone this repository to your local machine:

git clone <repository_link>

Open the project in your preferred IDE (e.g., VS Code, IntelliJ IDEA, Eclipse).

Ensure you have Java installed (JDK 17 or higher recommended).

Compile the program:

javac Game.java

Run the program:

java Game

Gameplay Instructions

Start the game and follow the prompts:

Enter 1 to add a player.

Enter 2 to exit the game.

When adding a player:

Enter the player's name.

Enter initial health (default is 100).

Specify a weapon.

Indicate if the player has armour (true/false).

During the game:

Enter 1 for Gun 1 (deals 25/30 damage based on armour).

Enter 2 for Gun 2 (deals 15/20 damage based on armour).

Enter 3 to exit the shooting phase.

The game continues until the player dies or you choose to exit.

Example Output

Enter 1 to add player
Enter 2 to exit
1
Enter player name
John
Enter player health
100
Enter player weapon
Rifle
Armour true or false
true
Enter hit by gun number 1 or 2
1
John hit by gun 1. Health was reduced by 25. Health is 75
Enter hit by gun number 1 or 2
3
Game Over

Technologies Used

Java

Author

ANTONY GODWIN S
