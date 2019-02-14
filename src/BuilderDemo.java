/**
 * Builder pattern demo. Director use builders to create different objects
 * of similar type - RPG characters: mage and warriors.
 *
 * Feb 2019 Evgeny Tyurin
 *
 */

public class BuilderDemo {

    /** Units created by director using builder */
    private static void deployUnit(RPGPersonBuilder builder) {
        PersonBuilderDirector director = new PersonBuilderDirector();
        director.setPersonBuilder(builder);
        director.createPerson();
        RPGPerson person = director.getPerson();
        person.report();
    }

    /** Run point */
    public static void main(String[] args) {
        deployUnit(new MageBuilder());
        deployUnit(new WarriorBuilder());
    }
}
