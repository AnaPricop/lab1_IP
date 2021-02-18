
public class lab1 {

    public static void main(String args[]) {
        Vehicul my_car = new Masina();

        my_car.label();
        my_car.numarRoti();
        my_car.numarLocuri();

        Vehicul my_motorcycle = new Motocicleta();
        my_motorcycle.label();
        my_motorcycle.numarRoti();
        my_motorcycle.numarLocuri();

        Ford my_ford = new Ford();

        my_ford.informatii();
        my_ford.motor();
        my_ford.culoare();

        System.out.println("Modelul masinii: " + Ford.model_masina);
        System.out.println("Anul fabricarii: " + Ford.an);

        Mercedes my_car2 = new Mercedes();

        System.out.println("Nume " + my_car2.name);
        System.out.println("Tip: " + my_car2.conducere);
        System.out.println("Model: " + my_car2.model);

        my_car2.culoare();
        my_car2.an();

        sMasina my_car3 = new sMasina();

        my_car3.speed();
        my_car3.speed(250);
        my_car3.speed("Mercedes S-class", 320);

        dVehicul mydVehicle = new dVehicul();
        mydVehicle.speed();

        dMotocicleta mydMotorcycle = new dMotocicleta();
        mydMotorcycle.speed();

    }
}
//Abstract classes

abstract class Vehicul {
    // abstract methods

    abstract void numarRoti();

    abstract void numarLocuri();

    // concrete method
    void label() {
        System.out.println("Datele vehiculului:");
    }
}

class Masina extends Vehicul {

    void numarRoti() {
        System.out.println("Masina are 4 roti.");

    }

    void numarLocuri() {
        System.out.println("O masina are de la 5 pana la 8 locuri.");

    }

}

class Motocicleta extends Vehicul {

    void numarRoti() {
        System.out.println("Motocicleta are 2 roti.");

    }

    void numarLocuri() {
        System.out.println("O motocicleta are 2 locuri.");
    }

}

//Interface
interface iVehicul {

    public void informatii();

}

interface iMasina {

    String model_masina = "Focus";
    String an = "2014";

    public void motor();

    public void culoare();
}

class Ford implements iVehicul, iMasina {

    public void informatii() {
        System.out.println("Marca masinii este Ford.");
    }

    public void motor() {
        System.out.println("Motorul este Diesel.");
    }

    public void culoare() {
        System.out.println("Culoarea este rosie.");
    }

}
//Inheritance

class Car {

    public String model = "S-class";

    public void culoare() {
        System.out.println("Culoarea masinii este negru.");
    }

    public void an() {
        System.out.println("Anul fabricarii este 2021.");
    }
}

class Mercedes extends Car {

    public String name = "Mercedes";
    public String conducere = "manuala";
}

//Static polymorphism
class sMasina {

    public void speed() {
        System.out.println("Masina este rapida.");
    }

    public void speed(int viteza) {
        System.out.println("Masina atinge " + viteza + " km/ora.");
    }

    public void speed(String name, int viteza) {
        System.out.println("Masina " + name + " atinge " + viteza + " km/ora.");
    }
}

//Dynamic polymorphism
class dVehicul {

    public void speed() {
        System.out.println("Acest vehicul are culoare rosie si atinge 280 km/ora.");
    }
}

class dMotocicleta extends dVehicul {

    public void speed() {
        System.out.println("Aceasta motocicleta atinge 200 km/ora si este albastra.");
    }

}
