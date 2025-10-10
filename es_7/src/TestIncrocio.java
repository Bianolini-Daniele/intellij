public class TestIncrocio {
    public static void main(String[] args) {
        Incrocio i = new Incrocio();

        System.out.println("Incrocio spento:");
        System.out.println(i);

        i.Accendi();
        System.out.println("Dopo accensione:");
        System.out.println(i);

        i.Avanza('N');
        System.out.println("Dopo avanza N (non dovrebbe cambiare perché E/O sono verdi):");
        System.out.println(i);

        i.Avanza('E');
        i.Avanza('E');
        System.out.println("Dopo 2 avanza E:");
        System.out.println(i);

        i.Avanza('N');
        i.Avanza('N');
        System.out.println("Ora Nord può avanzare (E/O non verdi):");
        System.out.println(i);

        i.Spegni();
        System.out.println("Dopo spegnimento:");
        System.out.println(i);
    }
}