public class App {
    public static void main(String[] args) {

        // Character Class
        Character support = new Character();

        support.strength = 18;
        support.agility = 5;
        support.intelligence = 10;
        support.name = "Aloy";
        support.sayMyName();

        Character mage = new Character();

        mage.strength = 10;
        mage.agility = 8;
        mage.intelligence = 10;
        mage.name = "Beidou";
        mage.sayMyName();

        Character core = new Character();

        core.strength = 20;
        core.agility = 10;
        core.intelligence = 10;
        core.name = "Madame Ping";
        core.sayMyName();

        // Enemy Class
        Enemy slime = new Enemy();

        slime.damage = 20;
        slime.health = 60;
        slime.armor = 60;
        slime.hasMagicImmunity = false;
        slime.name = "Geo";
        slime.enemyDialogue();

        Enemy hilichurls = new Enemy();

        hilichurls.damage = 40;
        hilichurls.health = 100;
        hilichurls.armor = 80;
        hilichurls.hasMagicImmunity = true;
        hilichurls.name = "Hilichurl Berseker";
        hilichurls.enemyDialogue();

        Enemy abyss = new Enemy();

        abyss.damage = 80;
        abyss.health = 100;
        abyss.armor = 90;
        abyss.hasMagicImmunity = true;
        abyss.name = "Abyss Lector";
        abyss.enemyDialogue();
    }
}
