public class TabellonePallavolo {
    private String casa;
    private String ospite;
    private int p_casa;
    private int p_ospite;
    private int battuta;
    private int set_casa;
    private int set_ospite;
    private boolean vinta = false;

    public TabellonePallavolo (String c, String o, int b){
        if (b > 2 || b < 1)
            battuta = 1;
        else
            battuta = b;
        casa = c;
        ospite = o;
    }

    public void puntoCasa (){
        if (vinta) {
            System.out.println("Partita finita!");
            return;
        }
        p_casa ++;
        if (p_casa >= 25 && (p_casa - p_ospite >= 2)){
            set_casa ++;
            p_ospite = 0;
            p_casa = 0;
            if (battuta == 1)
                battuta = 2;
            else
                battuta = 1;
            if (set_casa == 3){
                System.out.println("Partita vinta dalla squadra di casa");
                vinta = true;
            }
        }
    }

    public void puntoOspite (){
        if (vinta) {
            System.out.println("Partita finita!");
            return;
        }
        p_ospite ++;
        if (p_ospite >= 25 && (p_ospite - p_casa >= 2)){
            set_ospite ++;
            p_ospite = 0;
            p_casa = 0;
            if (battuta == 1)
                battuta = 2;
            else
                battuta = 1;
        }
        if (set_ospite == 3){
            System.out.println("Partita vinta dalla squadra ospite");
            vinta = true;
        }
    }

    @Override
    public String toString (){
        String s = "";
        if (battuta == 1) {
            s += casa + "-" + ospite + "\n";
            s += "  " + p_casa + "*     " + p_ospite + "\n";
            s += "Set:  " + set_casa + "     " + set_ospite;
        } else {
            s += casa + "-" + ospite + "\n";
            s += "  " + p_casa + "     " + p_ospite + "*\n";
            s += "Set:  " + set_casa + "     " + set_ospite;
        }
        return s;
    }
}
