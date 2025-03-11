import java.util.*;

class GameManage {
    String player;
    int health = 100;
    String weapon;
    boolean armour = false;
    boolean die = false;

    public GameManage(String player, int health, String weapon, boolean armour) {
        this.player = player;

        if (health != 100) {
            this.health = 100;
        } else {
            this.health = health;
        }

        this.weapon = weapon;
        this.armour = armour;
    }

    public void hitByGun1(boolean armour) {
        if (armour) {
            health -= 25;
            if (health <= 0) {
                die = true;
            }
        } else {
            health -= 30;
            if (health <= 0) {
                die = true;
            }
        }
    }

    public void hitByGun2(boolean armour) {
        if (armour) {
            health -= 15;
            if (health <= 0) {
                die = true;
            }
        } else {
            health -= 20;
            if (health <= 0) {
                die = true;
            }
        }
    }
}

class Gamechild extends GameManage {
    public Gamechild(String player, int health, String weapon, boolean armour) {
        super(player, health, weapon, armour);
    }

    public Gamechild() {
        super("", 100, "", false);
    }

    public void display(int hitBy, boolean armour,String player) {
        if (die) {
            System.out.println(player+" is dead");
        } else {
            if (hitBy == 1 && armour) {
                System.out.println(player + " hit by gun " + hitBy + ". Health was reduced by 25. Health is " + health);
            } else if (hitBy == 1 && !armour) {
                System.out.println(player + " hit by gun " + hitBy + ". Health was reduced by 30. Health is " + health);
            } else if (hitBy == 2 && armour) {
                System.out.println(player + " hit by gun " + hitBy + ". Health was reduced by 15. Health is " + health);
            } else if (hitBy == 2 && !armour) {
                System.out.println(player + " hit by gun " + hitBy + ". Health was reduced by 20. Health is " + health);
            } else {
                System.out.println(player + " is dead");
            }
        }
    }
}

public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Gamechild ch1 = new Gamechild();
        while (true) {
            System.out.println("Enter 1 to add player");
            System.out.println("Enter 2 to exit");
            int ch = sc.nextInt();
            if (ch == 1) {
                System.out.println("Enter player name");
                String player = sc.next();
                System.out.println("Enter player health");
                int health = sc.nextInt();
                System.out.println("Enter player weapon");
                String weapon = sc.next();
                System.out.println("Armour true or false");
                boolean armour = Boolean.parseBoolean(sc.next());
                Gamechild child = new Gamechild(player, health, weapon, armour);
                while (true) {
                    System.out.println("Enter hit by gun number 1 or 2");
                    System.out.println("Enter 3 to exit");
                    int hitBy = sc.nextInt();
                    if (child.die) {
                        break;
                    }
                    if (hitBy == 1) {
                        child.hitByGun1(armour);
                    } else if (hitBy == 2) {
                        child.hitByGun2(armour);
                    } else {
                        break;
                    }
                    child.display(hitBy, armour,player);
                }
            } else {
                break;
            }
        }
        System.out.println("Game Over");
    }
}