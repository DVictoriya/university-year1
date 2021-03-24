public class Main {
    public static void main(String[] args) {
        Food meat = new Meat("Meat");
        Food plant = new Plant("Plant");
        Carnivore myWolf = new Wolf("Aleksander", 11);
        myWolf.makeNoise();
        Omnivore myParrot = new Parrot("Olivera", 35);
        myParrot.makeNoise();
        myParrot.eat(plant);
        Herbivore myKoala = new Koala("Ekaterina", 28);
        myKoala.makeNoise();
        Wolf bigWolf = new Wolf(); //testing the newly created constructor in Animal


        try {
            myKoala.eat(meat); //giving meat to herbivore
        }
        catch (Exception ex) {
            ex.printStackTrace(); //catching exception (printing  error message)

        }
        try {
            myWolf.eat(plant);  //giving plat to carnivore
        }
        catch (Exception ex) {  //catching exception (printing  error message)
            ex.printStackTrace();

        }
        if(myWolf instanceof Animal){  //testing the method eat
            myWolf.eat(meat, 2);
        }

    }

}