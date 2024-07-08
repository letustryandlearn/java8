@FunctionalInterface
interface Hello{

    void test(int a);

}
public class Lab1 {

    public static void main(String[] args) {

        Hello h=(a)-> System.out.println(a);

        h.test(9);

    }
}
