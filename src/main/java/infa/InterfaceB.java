package infa;

public interface InterfaceB {
    default void printSomething(){
        System.out.println("I am inside B Interface");
    }
}
