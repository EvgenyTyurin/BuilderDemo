/**
 * Abstract RPG character
 */

class RPGPerson {
    private String weapon;
    private String armor;

    void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    void setArmor(String armor) {
        this.armor = armor;
    }

    void report() {
        System.out.println("I have " + weapon + " and " + armor);
    }
}

