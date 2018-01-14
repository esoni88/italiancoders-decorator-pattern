public class Main {

    public static void main(String[] args) {
        //Hamburger
        Consumation hamburger = new Hamburger();
        System.out.println("Prodotto:" +
                hamburger.productName +
                " di prezzo " + String.format("%.2f", hamburger.getPrice()
        ));

        Consumation cheeseburger = new CheeseBurger();

        //voglio aggiungere la maionese al burger
        Consumation hamburgerConMaionese = new ExtraMaioneseDecorator(hamburger);
        System.out.println("Prodotto:" +
                hamburgerConMaionese.getProductName() +
                " di prezzo " + String.format("%.2f", hamburgerConMaionese.getPrice()));
        //voglio aggiungere la maionese e il ketchup al burger
        Consumation hamburgerConMaioneseKetchup = new ExtraKetchupDecorator(new ExtraMaioneseDecorator(hamburger));
        System.out.println("Prodotto:" +
                hamburgerConMaioneseKetchup.getProductName() +
                " di prezzo " + String.format("%.2f", hamburgerConMaioneseKetchup.getPrice()));

        Consumation cheeseburgerConMaionese = new ExtraMaioneseDecorator(cheeseburger);
        System.out.println("Prodotto:" +
                cheeseburgerConMaionese.getProductName() +
                " di prezzo " + String.format("%.2f", cheeseburgerConMaionese.getPrice()));

    }
}
