public class ExtraKetchupBurger extends Aggiunta {

    private Consumazione consumazione;

    public ExtraKetchupBurger(Consumazione consumazione){
        this.consumazione = consumazione;
    }

    @Override
    public String getProductName() {
        return consumazione.getProductName()+ " con extra ketchup";
    }

    @Override
    public double getPrice() {
        return consumazione.getPrice()+0.10;
    }
}
