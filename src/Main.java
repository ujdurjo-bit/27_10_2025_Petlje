import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*System.out.println("Unesi prvi broj: ");
        int a = sc.nextInt(); //očekuje se unos broja
        System.out.println("Unesi drugi broj: ");
        int b = sc.nextInt(); //očekuje se unos broja
        int c;    */

        System.out.println("Unesi prvi broj: ");
        int a = Integer.parseInt(sc.nextLine()); // konverzija String(tekst) unosa u Integer(broj)
        System.out.println("Unesi drugi broj: ");
        int b = Integer.parseInt(sc.nextLine()); // konverzija String(tekst) unosa u Integer(broj)
        
        int c;

/*        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }*/
//Ternarni operator - lijevo od upitnika je izraz koji provjeravamo
        //ako je izraz istinit, izvršava se lijevo od dvotočke, ako je lažan izvršava se desno od dvotočke
        c = a > b ? a : b;
        System.out.println("Najveći uneseni broj je: " + c);
    }
}