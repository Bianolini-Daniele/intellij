public class TabelloneTennis {
    private String giocatore1;
    private String giocatore2;
    private int servizio;
    private int tipoPartita;
    private int set1;
    private int set2;
    private int game1;
    private int game2;
    private int punti1;
    private int punti2;

    private boolean vantaggio1 = false;
    private boolean vantaggio2 = false;

    private boolean partitaFinita = false;

    public TabelloneTennis(String nome1, String nome2, int servizioIniziale, int tipoPartita) {
        this.giocatore1 = nome1;
        this.giocatore2 = nome2;


        if (servizioIniziale == 2) {
            this.servizio = 2;
        } else {
            this.servizio = 1;
        }

        if (tipoPartita == 5) {
            this.tipoPartita = 5;
        } else {
            this.tipoPartita = 3;
        }

        this.set1 = 0;
        this.set2 = 0;
        this.game1 = 0;
        this.game2 = 0;
        this.punti1 = 0;
        this.punti2 = 0;
    }

    public boolean aggiungiPunto(int giocatore) {
        if (partitaFinita) return false;

        if (giocatore != 1 && giocatore != 2) return false;

        int p1 = punti1;
        int p2 = punti2;

        if (p1 == 40 && p2 == 40) {
            if (giocatore == 1) {
                if (vantaggio1) {
                    vinceGame(1);
                } else if (vantaggio2) {
                    vantaggio2 = false;
                } else {
                    vantaggio1 = true;
                }
            } else {
                if (vantaggio2) {
                    vinceGame(2);
                } else if (vantaggio1) {
                    vantaggio1 = false;
                } else {
                    vantaggio2 = true;
                }
            }
            return true;
        }

        if (giocatore == 1) {
            punti1 = prossimoPunto(punti1);
            if (punti1 == -1) {
                vinceGame(1);
            }
        } else {
            punti2 = prossimoPunto(punti2);
            if (punti2 == -1) {
                vinceGame(2);
            }
        }

        return true;
    }

    private void vinceGame(int giocatore) {
        if (giocatore == 1) {
            game1++;
        } else {
            game2++;
        }

        punti1 = 0;
        punti2 = 0;
        vantaggio1 = false;
        vantaggio2 = false;

        if (controllaSetVinto()) {
            if (set1 == tipoPartita / 2 + 1) {
                partitaFinita = true;
            } else if (set2 == tipoPartita / 2 + 1) {
                partitaFinita = true;
            }
        }

        servizio = (servizio == 1) ? 2 : 1;
    }

    private boolean controllaSetVinto() {
        if ((game1 >= 6 && game1 - game2 >= 2) || game1 == 7) {
            set1++;
            game1 = 0;
            game2 = 0;
            return true;
        } else if ((game2 >= 6 && game2 - game1 >= 2) || game2 == 7) {
            set2++;
            game1 = 0;
            game2 = 0;
            return true;
        }
        return false;
    }

    private int prossimoPunto(int punti) {
        if (punti == 0) return 15;
        if (punti == 15) return 30;
        if (punti == 30) return 40;
        if (punti == 40) return -1;
        return punti;
    }

    @Override
    public String toString() {
        String s = "";

        s += giocatore1;
        if (servizio == 1) s += " *";
        s += " " + set1 + " " + game1 + " " + stampaPunti(punti1, vantaggio1) + "\n";

        s += giocatore2;
        if (servizio == 2) s += " *";
        s += " " + set2 + " " + game2 + " " + stampaPunti(punti2, vantaggio2);

        return s;
    }

    private String stampaPunti(int punti, boolean vantaggio) {
        if (vantaggio) return "ADV";
        return "" + punti;
    }

    public String vittoria() {
        if (set1 == tipoPartita / 2 + 1) return giocatore1;
        if (set2 == tipoPartita / 2 + 1) return giocatore2;
        return "";
    }
}
