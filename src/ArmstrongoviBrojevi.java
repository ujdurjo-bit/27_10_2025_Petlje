public class ArmstrongoviBrojevi {

    public static void main(String[] args) {
        // Napišite program koji ispisuje sve Armstrongove brojeve do 10000

 /*       for (int broj = 1; broj <= 10000; broj++) {
            int privremeniBroj = broj;
            int sumaZnamenki = 0;
            int brojZnamenki = 0;

            while (privremeniBroj > 0) {
                brojZnamenki++;
                privremeniBroj = privremeniBroj /10;
            }
                privremeniBroj = broj;
            while (privremeniBroj > 0) {

                int zadnjaZnamenka = privremeniBroj % 10;
                sumaZnamenki += Math.pow(zadnjaZnamenka, brojZnamenki);
                privremeniBroj = privremeniBroj / 10;
            }
            if (sumaZnamenki == broj) {
                System.out.println("Ovaj broj je narcistički broj " + sumaZnamenki);
            }

        }
    }
}*/


//Zadatak 2:
//Korištenjem petlje do while izračunaj zbroj brojeva od 1 do 1000 djeljivih sa 7.


        int broj = 1;
        int zbroj = 0;

        do {
            if (broj % 7 == 0) {
                zbroj += broj;
            }
            broj++;
        } while (broj <= 1000) ;
            System.out.println("Zbroj brojeva od 1 do 1000 djeljivih sa 7 je " + zbroj);


        }
    }








