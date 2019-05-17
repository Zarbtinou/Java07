public class Hangar {

    public static void main(String[] args) {

        //références car et boat
        Car ferrari = new Car("Ferrari",12000);
        Car porshe = new Car("Porshe",450);
        Boat jetski = new Boat("JetSki",4532);
        Boat voilier = new Boat("Voilier",8076);

        //appel methode doStuff pour chaque références
        System.out.println(ferrari.doStuff());
        System.out.println(porshe.doStuff());
        System.out.println(jetski.doStuff());
        System.out.println(voilier.doStuff());

    }

}