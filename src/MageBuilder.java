/**
 * Builder of mages
 */

class MageBuilder extends  RPGPersonBuilder{
    @Override
    public void equipWeapon() {
        person.setWeapon("Magic wand");
    }

    @Override
    public void equipArmor() {
        person.setArmor("Magic robe");
    }
}
