
public class Main {
    public static void main(String[] args) {
        //Ternarni operator
        int a = 2;
        int b = 5;
        int c;
        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }

        c = a > b ? a : b;

    }
}