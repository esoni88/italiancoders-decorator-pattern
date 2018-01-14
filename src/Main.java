public class Main {

    public static void main(String[] args) {
        //Hamburger
        Consumazione hamburger = new Hamburger();
        System.out.println("Prodotto:"+hamburger.productName+" di prezzo "+hamburger.getPrice());
        //voglio aggiungere la maionese al burger
        Consumazione hamburgerConMaionese = new ExtraMaioneseBurger(hamburger);
        System.out.println("Prodotto:"+hamburgerConMaionese.getProductName()+" di prezzo "+hamburgerConMaionese.getPrice());
        //voglio aggiungere la maionese e il ketchup al burger
        Consumazione hamburgerConMaioneseKetchup = new ExtraKetchupBurger(new ExtraMaioneseBurger(hamburger));
        System.out.println("Prodotto:"+hamburgerConMaioneseKetchup.getProductName()+" di prezzo "+hamburgerConMaioneseKetchup.getPrice());


    }
}
