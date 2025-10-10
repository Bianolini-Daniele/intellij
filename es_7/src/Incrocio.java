public class Incrocio {
    private Semaforo Nord;
    private Semaforo Sud;
    private Semaforo Est;
    private Semaforo Ovest;

    public Incrocio() {
        Nord = new Semaforo();
        Sud = new Semaforo();
        Est = new Semaforo();
        Ovest = new Semaforo();
    }

    public void Accendi(){
        Nord.Accendi();
        Sud.Accendi();
        Est.Accendi();
        Ovest.Accendi();

        for (int i = 0; i < 2; i++) {
            Nord.Avanza();
            Sud.Avanza();
        }
    }

    public void Spegni() {
        Nord.Spegni();
        Sud.Spegni();
        Est.Spegni();
        Ovest.Spegni();
    }

    private boolean isAcceso(){
        if(Nord.isAcceso() && Sud.isAcceso() && Est.isAcceso() && Ovest.isAcceso()) {
            return true;
        }
        else
            return false;
    }

    public void Avanza(char semaforo){
        if (isAcceso()){
            semaforo = Character.toUpperCase(semaforo);
            switch (semaforo){
                case 'N':
                    if(!Ovest.getColore().equals("verde") && !Sud.getColore().equals("verde") && !Ovest.getColore().equals("verde")){
                        Nord.Avanza();
                    }
                    break;

                case 'S':
                    if(!Nord.getColore().equals("verde") && !Est.getColore().equals("verde") && !Ovest.getColore().equals("verde")){
                        Sud.Avanza();
                    }
                    break;

                case 'E':
                    if(!Nord.getColore().equals("verde") && !Sud.getColore().equals("verde") && !Ovest.getColore().equals("verde")){
                        Est.Avanza();
                    }
                    break;

                case 'O':
                    if(!Nord.getColore().equals("verde") && !Sud.getColore().equals("verde") && !Est.getColore().equals("verde")){
                        Ovest.Avanza();
                    }
                    break;
            }
        }
    }

    public String getColore(char semaforo) {
        if (isAcceso()) {
            semaforo = Character.toUpperCase(semaforo);
            switch (semaforo) {
                case 'N':
                    return Nord.getColore();

                case 'S':
                    return Sud.getColore();

                case 'E':
                    return Est.getColore();

                case 'O':
                    return Ovest.getColore();
            }
        }
        return "";
    }

    private String coloreSimbolo(Semaforo s){

        switch (s.getColore()) {

            case "verde":

                return "V";

            case "giallo":

                return "G";

            case "rosso":

                return "R";

            default:

                return " ";

        }

    }


    @Override
    public String toString() {
        String ritorno = "";
        ritorno += "        |     N |\n" +
                "        |       |\n" +
                "        |" + coloreSimbolo(Nord)+ "      |\n" +
                "-------            -------\n" +
                "                   "+ coloreSimbolo(Ovest) + "       \n"+
                "E                      O\n"+
                "     " + coloreSimbolo(Est) + "                  \n" +
                "-------            -------\n" +
                "        |      " + coloreSimbolo(Sud)+ "|\n" +
                "        |       |\n" +
                "        |     S |\n";
        return ritorno;
    }

}


