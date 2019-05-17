public abstract class Vehicule {
    //attributs
    public String brand;
    public int kilometers;

    //constructeur
    public Vehicule(String brand, int kilometers) {
        this.brand = brand;
        this.kilometers = kilometers;
    }

    //getters/setters


    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getKilometers() {
        return this.kilometers;
    }

    public void setKilometers(int kilometers) {
        this.kilometers = kilometers;
    }

    //méthode abstraite

    public abstract String doStuff();
}