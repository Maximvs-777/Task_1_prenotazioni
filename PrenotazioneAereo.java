public class PrenotazioneAereo extends Prenotazione {
    private int postiDisponibiliAereo;
    private int capacitaEconomy;
    private int capacitaBusiness;
    public boolean validaPrenotazioneAereo;

    public PrenotazioneAereo(String cliente, String data, int postiRichiesti, int postiDisponibiliAereo, int capacitaEconomy, int capacitaBusiness, boolean validaPrenotazioneAereo) {
        super(cliente, data, postiRichiesti);
        this.postiDisponibiliAereo = postiDisponibiliAereo;
        this.capacitaEconomy = capacitaEconomy;
        this.capacitaBusiness = capacitaBusiness;
        this.validaPrenotazioneAereo = validaPrenotazioneAereo;
    }

    public void validazioneAereo() {
        if (getPostiRichiesti() <= postiDisponibiliAereo && getPostiRichiesti() <= capacitaEconomy || getPostiRichiesti() <= capacitaBusiness) {
            validaPrenotazioneAereo = true;
            System.out.println("Prenotazione valida.");
        } else {
            validaPrenotazioneAereo = false;
            System.out.println("Prenotazione non valida per l'aereo. Posti insufficienti.");
        }
    }

    @Override
    public void dettagliPrenotazione() {
        if(validaPrenotazioneAereo = true) {
            System.out.println("Cliente: " + getCliente() + ", Data: " + getData() + ", Posti: " + getPostiRichiesti() + ", Prenotazione valida.");
        }else{
            System.out.println("Prenotazione non valida. Effettuare prima la validazione.");
        }
    }
}
