package L2;

public class Dog {
    public int weightInPounds;

    public Dog(int w){
        weightInPounds = w;
    }

    public void makeNoise() {
        if(weightInPounds < 10){
            System.out.println("Yip!");
        } else if(weightInPounds < 30){
            System.out.println("Bark.");
        } else {
            System.out.println("Woof!");
        }
    }
}

