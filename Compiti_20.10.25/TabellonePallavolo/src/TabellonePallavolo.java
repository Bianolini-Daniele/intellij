public class TabellonePallavolo {
    private String Locali;
    private String Ospiti;
    private int Set;
    private int ptLocali;
    private int ptOspiti;
    private int servizio;
    private int vittorieLoc;
    private int vittorieOsp;


    public TabellonePallavolo(String locali, String ospiti, int servizio) {
        this.Locali = locali;
        this.Ospiti = ospiti;
        this.servizio = servizio;
    }

    public void puntoCasa (){
        ptLocali ++;
        Vittoria();
    }

    public void puntoOspiti(){
        ptOspiti++;
        Vittoria();
    }

    private void setServizo(){
        if (ptLocali > 24 && ptLocali - ptOspiti >= 2) {
            vittorieLoc++;
        } else if ""
    }

    private String Vittoria (){
        if(vittorieLoc == 3){
            return Locali + " ha vinto";
        } else if (vittorieOsp == 3){
            return Ospiti + "hanno vinto";
        }
        return "\n";
    }

}
