public class Angolo {
    private int gradi;
    private int primi;
    private int secondi;

    public Angolo() {
        gradi = 0;
        primi = 0;
        secondi = 0;
    }

    public Angolo(int g, int p, int s) {
        setAngolo(g, p, s);
    }

    public Angolo(double decimali) {
        while (decimali < 0)
            decimali += 360;
        while (decimali >= 360)
            decimali -= 360;

        gradi = (int) decimali;
        double resto = (decimali - gradi) * 60;
        primi = (int) resto;
        secondi = (int) ((resto - primi) * 60);
    }

    private void setAngolo(int g, int p, int s) {
        while (s < 0)
            s += 60;
        while (s >= 60)
            s -= 60;

        while (p < 0)
            p += 60;
        while (p >= 60)
            p -= 60;

        while (g < 0)
            g += 360;
        while (g >= 360)
            g -= 360;

        gradi = g;
        primi = p;
        secondi = s;
    }

    public Angolo somma(Angolo a) {
        int s = this.secondi + a.secondi;
        int p = this.primi + a.primi + s / 60;
        int g = this.gradi + a.gradi + p / 60;
        Angolo ang = new Angolo();
        ang.setAngolo(g, p, s);
        return ang;
    }

    public Angolo differenza(Angolo a) {
        int s1 = this.secondi + this.primi * 60 + this.gradi * 3600;
        int s2 = a.secondi + a.primi * 60 + a.gradi * 3600;

        int diff = s1 - s2;
        diff = ((diff % (360 * 3600)) + (360 * 3600)) % (360 * 3600);

        int g = diff / 3600;
        diff %= 3600;
        int p = diff / 60;
        int s = diff % 60;

        return new Angolo(g, p, s);
    }

    public double getRadianti() {
        double totaleGradi = gradi + primi / 60.0 + secondi / 3600.0;
        return totaleGradi * Math.PI / 180.0;
    }

    public String toString() {
        return gradi + "° " + primi + "’ " + secondi + "″";
    }
}
