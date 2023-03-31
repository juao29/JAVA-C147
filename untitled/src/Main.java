public class Main {
    public static void main(String[] args) {
        int a = 50;

        modify(a);
        System.out.println("(main):" + a + "value");

    }

    static void modify(int a){
        a = 200;

        System.out.println("(method):" + a +"value");
    }
}