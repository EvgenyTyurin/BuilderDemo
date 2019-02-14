public class BuilderDemo {
    public static void main(String[] args) {
        PersonBuilderDirector director = new PersonBuilderDirector();
        RPGPersonBuilder mageBuilder = new MageBuilder();
        director.setPersonBuilder(mageBuilder);
        director.createPerson();
        RPGPerson mage = director.getPerson();
        mage.report();
    }
}
