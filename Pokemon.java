import java.util.Scanner;
         
public class Pokemon {
    
        private int hp;
        private int maxHp;
        private int level;
        private int pp;
        private int attack;
        private boolean dead;

        public Pokemon(String type, int hp) {
            this.hp = hp;
            this.maxHp = 100;
            this.pp = 100;
            this.level = 1;
            this.attack = 10;
            this.dead = false;
        }

        public boolean increaseHP(int heal) {
            if (hp < maxHp) {
                hp = hp + heal;
                return true;
            } else {
                return false;
            }
        }

        public void decreaseHP(int damage) {
            hp = hp - damage;
            if (hp <= 0) {
                dead = true;
            }
        }
}