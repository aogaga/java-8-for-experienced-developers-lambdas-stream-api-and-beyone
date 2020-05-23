package infa;

public interface InterfaceA {
    default void printSomething(){
        System.out.println("I am inside A Interface");
    }

    default void playSomething(){
        System.out.println("I am playing something");
    }
}
