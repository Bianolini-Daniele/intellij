import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Angolo a1 = new Angolo();
        Angolo a2 = new Angolo();

        while (true) {
            System.out.println("\n--- MENU ANGOLO ---");
            System.out.println("1. Imposta primo angolo (gradi, primi, secondi)");
            System.out.println("2. Imposta secondo angolo (decimale)");
            System.out.println("3. Somma");
            System.out.println("4. Differenza");
            System.out.println("5. Mostra in radianti (primo angolo)");
            System.out.println("6. Esci");
            System.out.print("Scelta: ");

            int scelta = sc.nextInt();

            if (scelta == 1) {
                System.out.print("Gradi: ");
                int g = sc.nextInt();
                System.out.print("Primi: ");
                int p = sc.nextInt();
                System.out.print("Secondi: ");
                int s = sc.nextInt();
                a1 = new Angolo(g, p, s);
            } else if (scelta == 2) {
                System.out.print("Angolo in decimali: ");
                double d = sc.nextDouble();
                a2 = new Angolo(d);
            } else if (scelta == 3) {
                System.out.println("Somma: " + a1.somma(a2));
            } else if (scelta == 4) {
                System.out.println("Differenza: " + a1.differenza(a2));
            } else if (scelta == 5) {
                System.out.println("Radianti: " + a1.getRadianti());
            } else if (scelta == 6) {
                break;
            } else {
                System.out.println("Scelta non valida!");
            }
        }
        System.out.println(a1);
        System.out.println(a2);
    }
}
