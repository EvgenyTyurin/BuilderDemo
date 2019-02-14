/**
 * Builder of warriors
 */
public class WarriorBuilder extends RPGPersonBuilder {
    @Override
    public void equipWeapon() {
        person.setWeapon("Sword");
    }

    @Override
    public void equipArmor() {
        person.setArmor("Plate armor");
    }
}
