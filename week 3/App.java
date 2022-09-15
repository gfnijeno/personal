public class App {
    public static void main(String[] args) {

        Character knight = new Character();

        knight.strength = 10;
        knight.agility = 5;
        knight.intelligence = 0;
        knight.name = "Chen";
        knight.sayMyName();
        knight.sayMyStrength();
        knight.sayMyAgility();
        knight.sayMyIntelligence();

        Character mage = new Character();

        mage.strength = 0;
        mage.agility = 5;
        mage.intelligence = 10;
        mage.name = "Akasha";
        mage.sayMyName();
        mage.sayMyStrength();
        mage.sayMyAgility();
        mage.sayMyIntelligence();

        Character thief = new Character();

        thief.strength = 5;
        thief.agility = 10;
        thief.intelligence = 0;
        thief.name = "Gondar";
        thief.sayMyName();
        thief.sayMyStrength();
        thief.sayMyAgility();
        thief.sayMyIntelligence();

        Character archer = new Character();

        archer.strength = 10;
        archer.agility = 6;
        archer.intelligence = 9;
        archer.name = "Jeno";
        archer.sayMyName();
        archer.sayMyStrength();
        archer.sayMyAgility();
        archer.sayMyIntelligence();

        Character healer = new Character();

        healer.strength = 2;
        healer.agility = 4;
        healer.intelligence = 10;
        healer.name = "Mark";
        healer.sayMyName();
        healer.sayMyStrength();
        healer.sayMyAgility();
        healer.sayMyIntelligence();

        Enemy boss = new Enemy();
        boss.damage = 20;
        boss.armor = 50;
        boss.health = 20;
        boss.name = "boss";
        boss.enemyDialogue();

        Item potion = new Item();
        potion.price = 50;
        potion.weight = (int) 8.8;
        potion.quantity = 10;
        potion.description = "This will heal for 10 hp.";
        potion.canbetraded = false;
        potion.name = "healing potion";
        potion.itemdescription();

        Item katana = new Item();
        katana.price = 200;
        katana.weight = 52;
        katana.quantity = 31;
        katana.description = "This is pang-gripo.";
        katana.name = "katana";
        katana.canbetraded = true;
        katana.itemdescription();

        Pet dog = new Pet();
        dog.name = "blacky";
        dog.trustlevel = 5;
        dog.petlevel = 10;
        dog.ishappy = false;
        dog.petsentence();

        Pet dog2 = new Pet();
        dog2.name = "daegal";
        dog2.trustlevel = 2;
        dog2.petlevel = 11;
        dog2.ishappy = true;
        dog2.petsentence();


    }
}
