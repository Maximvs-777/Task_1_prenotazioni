public class PrenotazioneConcerto extends Prenotazione{
    private int postiDisponibiliConcerto;
    public boolean validaPrenotazioneConcerto;

    public PrenotazioneConcerto(String cliente, String data, int postiRichiesti, int postiDisponibiliConcerto, boolean validaPrenotazioneConcerto) {
        super(cliente, data, postiRichiesti);
        this.postiDisponibiliConcerto = postiDisponibiliConcerto;
        this.validaPrenotazioneConcerto = validaPrenotazioneConcerto;
    }

    public void validazioneConcerto() {
        if (getPostiRichiesti() <= postiDisponibiliConcerto && getPostiRichiesti() <= 5) {
            validaPrenotazioneConcerto = true;
            System.out.println("Prenotazione valida.");
        } else {
            validaPrenotazioneConcerto = false;
            System.out.println("Prenotazione non valida per il concerto. Posti insufficienti.");
        }
    }

    @Override
    public void dettagliPrenotazione() {
        if(validaPrenotazioneConcerto = true) {
            System.out.println("Cliente: " + getCliente() + ", Data: " + getData() + ", Posti Richiesti: " + getPostiRichiesti() + ", Prenotazione valida.");
        }else{
            System.out.println("Prenotazione non valida. Effettuare prima la validazione.");
        }
    }
}
