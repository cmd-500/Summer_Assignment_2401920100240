package Week_3.OOPs;
import java.util.Random;

abstract class Compartment {
    public abstract String notice();
}

class FirstClass extends Compartment {
    @Override
    public String notice() {
        return "Notice: First Class - Reserved passengers only.";
    }
}

class Ladies extends Compartment {
    @Override
    public String notice() {
        return "Notice: Ladies Compartment - Men are strictly not allowed.";
    }
}

class General extends Compartment {
    @Override
    public String notice() {
        return "Notice: General Compartment - Valid unreserved tickets required.";
    }
}

class Luggage extends Compartment {
    @Override
    public String notice() {
        return "Notice: Luggage Van - Authorized personnel and freight only.";
    }
}

public class TestCompartment {
    public static void main(String[] args) {
        Compartment[] compartments = new Compartment[10];
        Random rand = new Random();

        for (int i = 0; i < compartments.length; i++) {
            int type = rand.nextInt(4) + 1; // Generates 1, 2, 3, or 4

            switch (type) {
                case 1:
                    compartments[i] = new FirstClass();
                    break;
                case 2:
                    compartments[i] = new Ladies();
                    break;
                case 3:
                    compartments[i] = new General();
                    break;
                case 4:
                    compartments[i] = new Luggage();
                    break;
            }
        }

        for (int i = 0; i < compartments.length; i++) {
            System.out.println("Coach " + (i + 1) + " -> " + compartments[i].notice());
        }
    }
}