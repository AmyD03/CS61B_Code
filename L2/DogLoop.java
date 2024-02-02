package L2;

public class DogLoop {
    public  static void main(String[] args) {
        Dog smallDog = new Dog(5);
        Dog mediumDog = new Dog(25);
        Dog hugeDog = new Dog(150);
        Dog[] manyDogs = new Dog[4];
        manyDogs[0] = smallDog;
        manyDogs[1] = hugeDog;
        manyDogs[2] = new Dog(130);
        manyDogs[3] = mediumDog;

        int i = 0;
        while(i < manyDogs.length){
            Dog.maxDog(manyDogs[i],manyDogs[0]).makeNoise();
            i = i + 1;
        }
    }
}
