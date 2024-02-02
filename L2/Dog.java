package L2;

public class Dog {
    public int weightInPounds;
    public static String binomen = "Canis familiaris";

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

    //static version
    public static Dog maxDog(Dog d1,Dog d2){
        if(d1.weightInPounds > d2.weightInPounds){
            return d1;
        }
        return d2;
    }

    //non-static version
    public Dog maxDog(Dog d2){
        if(this.weightInPounds > d2.weightInPounds){
            return this;
        }
        return d2;
    }
}

