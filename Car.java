public class Car extends Vehicule {

    //on récupère l'instance de la class vehicule
    public Car(String brand,int kilometers) {
        super(brand,kilometers);
    }

    //implémentation de la méthode doStuff
    @Override
    public String doStuff() {
        return "Je suis " + this.brand + " et je fais vroum vroum !";
    }
}