public class OrologioDIgitale {
    private Orologio Orario;
    private Orologio Sveglia;
    private int Stato;

    public OrologioDIgitale(){
        this.Orario = new Orologio();
        this.Sveglia = new Orologio();
        this.Orario.minuti = 0;
        this.Orario.ore = 0;
        this.Sveglia.minuti = 0;
        this.Sveglia.ore = 0;
        Stato = 1;
    }

    public void Orario (int ore, int minuti){
        this.Orario.ore = ore;
        this.Orario.minuti = minuti;
    }

    private String Stato(){
        if(this.Stato == 1){
            return "Normale";
        } else if(this.Stato == 2){
            return "Imposta Orologio";
        } else
            return "Imposta Sveglia";
    }


    public void ImpostaOrario(){
        if(this.Stato != 2){
            Stato = 2;
        } else
            Stato = 1;
    }

    public void ImpostaSveglia(){
        if(this.Stato != 3){
            Stato = 3;
        } else
            Stato = 1;
    }

    public void setOre(){
        if(Stato == 2){
            this.Orario.ore++;
        } else if (Stato == 3){
            this.Sveglia.ore++;
        }
    }


    public void setMinuti(){
        if (Stato == 2) {
            this.Orario.minuti ++;
        } else if(Stato == 3){
            this.Sveglia.minuti++;
        }
    }

    @Override

    public String toString(){
        String orario = "", sveglia = "";
        if(this.Orario.ore < 10){
            orario += "0";
        }
        orario += this.Orario.ore + ":";
        if(this.Orario.minuti < 10){
            orario += "0";
        }
        orario += this.Orario.minuti;

        if(this.Sveglia.ore < 10){
            sveglia += "0";
        }
        sveglia += this.Sveglia.ore + ":";
        if(this.Sveglia.minuti < 10){
            sveglia += "0";
        }
        sveglia += this.Sveglia.minuti;

        return "L'orologio è in modalità '" + Stato() + "'\n" + "Orario corrente: " + orario + "\n" + "Sveglia corrente: " + sveglia;
    }

}
