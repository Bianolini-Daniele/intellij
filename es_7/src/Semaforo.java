public class Semaforo {

    private String Colore;

    private int colore;

    private boolean acceso=false;

    public  Semaforo(){

        this.acceso = false;

    }

    public void  Accendi(){
        this.acceso = true;
        this.colore = 1;
    }

    public void Spegni() {

        this.acceso = false;

    }

    public void Toggle(){

        if(acceso){

            Accendi();

        } else  {

            Spegni();

        }

    }

    public void Avanza(){

        if(!acceso){

            colore+=1;

            if (colore>3){

                colore=1;

            }

        }

    }

    public boolean isAcceso(){

        return this.acceso;

    }

    public String getColore() {

        String Colore = "";

        if (this.colore == 1) {

            Colore += "verde";

        } else if (this.colore == 2) {

            Colore += "giallo";

        } else if (this.colore == 3) {

            Colore += "rosso";

        }

        return Colore;

    }

    @Override

    public String toString() {

        if (this.acceso ==true) {

            return "il semaforo è acceso sul"+this.Colore;

        }

        else return "il semaforo è spento";

    }

}
