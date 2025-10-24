import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a, pari, dispari;
        int valori, nPari = 0, nDispari = 0, tempP = 0, tempD = 0;
        a = new int[10];
        pari = new int[10];
        dispari = new int[10];
        System.out.println("Inserisci i valori da inserire: ");
        valori = in.nextInt();

        System.out.println("Inserisci " + valori + " valori.");
        for (int i = 0; i < valori; i++) {
            a[i] = in.nextInt();
        }
        for (int i = 0; i < valori; i++) {
            if(a[i]%2 == 0){
                pari[tempP] = a[i];
                nPari++;
                tempP++;
            } else {
                dispari[tempD] = a[i];
                nDispari++;
                tempD++;
            }
        }

        System.out.print("I numeri pari sono " + nPari + " e sono: ");
        for (int i = 0; i < nPari; i++) {
            System.out.print(pari[i] + " ");
        }
        System.out.println("");
        System.out.print("I numeri dispari sono " + nDispari + " e sono: ");
        for (int i = 0; i < nDispari; i++) {
            System.out.print(dispari[i] + " ");
        }
    }
}