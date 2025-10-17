
public class Main {
    public static void main(String[] args) {
        OrologioDIgitale Orologio = new OrologioDIgitale();
        Orologio.Orario(20, 12);
        Orologio.ImpostaSveglia();
        Orologio.setMinuti();
        for (int i = 0; i < 23; i++) {
            Orologio.setOre();
        }
        Orologio.ImpostaOrario();
        Orologio.setOre();
        for (int i = 0; i < 23; i++) {
            Orologio.setMinuti();
        }

        System.out.println(Orologio.toString());
    }
}