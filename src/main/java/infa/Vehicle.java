package infa;

public interface Vehicle {
    void cleanVehicle();
    default void startVehicle(){
        System.out.println("infa.Vehicle is starting");
    }

}
