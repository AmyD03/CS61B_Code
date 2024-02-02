package L2;

public class DogLauncher {
    public static void main(String[] args) {
        Dog d1 = new Dog(51);

        Dog d2 = new Dog(100);

        //call static version
        // Dog bigger = Dog.maxDog(d1,d2);

        //call non-static version
        Dog bigger = d1.maxDog(d2);

        System.out.println(Dog.binomen);

        bigger.makeNoise();
    }
}


/**
    A variable or method defined in a class is called a member of the class.
    1. Static members are accessed using class name, e.g. God.binomen
    2. Non-static members are accessed using object name, e.g. d1.makeNoise()
    3. Static methods must access instance variables via a specific instance, e.g. d1.maxDog(d2)
 * 
 */