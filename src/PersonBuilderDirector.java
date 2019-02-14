/**
 * Director that builds character using builder
 */

class PersonBuilderDirector {
    private RPGPersonBuilder personBuilder;

    void setPersonBuilder(RPGPersonBuilder personBuilder) {
        this.personBuilder = personBuilder;
    }

    RPGPerson getPerson() {
        return personBuilder.getPerson();
    }

    void createPerson() {
        personBuilder.createRPGPerson();
        personBuilder.equipWeapon();
        personBuilder.equipArmor();
    }
}
