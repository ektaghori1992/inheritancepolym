package InheritancePolymorphism;

public class RunTest {
    public static void main(String[] args) {
        Fruit f = new Fruit();
        f.WashFruit();
        f.CheckFruit();
        f.EatFruit();
        f.GainVitamin();
        f.TasteFruit();


        System.out.println("Cherry");
        cherry c = new cherry();
        c.WashFruit();
        c.CheckFruit();
        c.EatFruit();
        c.GainVitamin();
        c.TasteFruit();

        System.out.println("Strawberry");
        strawberry s = new strawberry();
        s.WashFruit();
        s.CheckFruit();
        s.EatFruit();
        s.GainVitamin();
        s.TasteFruit();

        System.out.println("Raspberry");
        raspberry r = new raspberry();
        r.WashFruit();
        r.CheckFruit();
        r.EatFruit();
        r.GainVitamin();
        r.TasteFruit();

        System.out.println("-----------Polymorphism Method overriding--------");
        EnglishTeacher et = new EnglishTeacher();
        et.numberOfSubjects();

    }
}
