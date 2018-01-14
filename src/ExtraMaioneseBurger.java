public class ExtraMaioneseBurger extends Aggiunta {

    private Consumazione consumazione;

    public ExtraMaioneseBurger(Consumazione consumazione){
        this.consumazione = consumazione;
    }

    @Override
    public String getProductName() {
        return consumazione.getProductName()+ " con extra maionese";
    }

    @Override
    public double getPrice() {
        return consumazione.getPrice()+0.20;
    }
}
