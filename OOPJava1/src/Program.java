public class Program {

    public static void main(String[] args) {

        Person p1 = new Person("Sven", 37);
        Person p = new Person("Ilse", 35);
        Person p2 = new Person("Dieter", 20);

        Cat push = new Cat (p, "sphinx", "Пушок", 3);
        Dog tuz = new Dog (p2, "метис", "Тузик", 5 );

        System.out.println(p);
        System.out.println(p1);
        System.out.println(p2);

        System.out.println(push);
        System.out.println(tuz);
        System.out.println("------------------------");
        System.out.println("*** Беседа хозяин-кот ***");
//       котик подает голос
        push.Say();
//        хозяин идет кормить котика
        p2.feed();

        System.out.println("------------------------");
        System.out.println("*** Беседа хозяин-пёс ***");
        tuz.Say();
        p2.feed();


    }

}
