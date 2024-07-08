@FunctionalInterface
interface Hello1 {

    void test(int a);

}

class Hai {

    Hai(int a) {
        System.out.println("con ..");
        System.out.println(a);
    }

    public Hai() {

    }

    void m1(int a) {

        System.out.println(a);
    }

    static void m2(int a) {

        System.out.println(a);
    }


}

public class Lab2 {

    public static void main(String[] args) {

        Hello1 h = Hai::new;
        h.test(10);

          h = Hai::m2;
        h.test(20);

        h = new Hai()::m1;
        h.test(30);



    }
}
