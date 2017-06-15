package game;

public class Character {
		// variables
	    private String name;
		private int health;
		private int strength;
		private int defense;
		
		//Constructor
		public Character(String initialName, int initialHealth, int initialStrength, int initialDefense) {
			name	    =   initialName;
			health 		= 	initialHealth;
			strength    = 	initialStrength;
			defense 	=   initialDefense;
		}
		//Setters and Getters
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getHealth() {
			return health;
		}		
		public void setHealth(int health) {
			this.health = health;
		}
		public int getStrength() {
			return strength;
		}
		public void setStrength(int strength) {
			this.strength = strength;
		}
		public int getDefense() {
			return defense;
		}
		public void setDefense(int defense) {
			this.defense = defense;
		}
		public void takeDamage(int damage) {
			this.health -= damage;
		}		
		public void attackPunch(Character opponent){
			int damage = this.getStrength() - (opponent.getDefense() / 2);
			opponent.takeDamage(damage);
		}
		
		
		
		
		
}
