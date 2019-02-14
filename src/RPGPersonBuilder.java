abstract class RPGPersonBuilder {
    RPGPerson person;

    void createRPGPerson() {
        person = new RPGPerson();
    }

    RPGPerson getPerson() {
        return person;
    }

    public abstract void equipWeapon();
    public abstract void equipArmor();

}
