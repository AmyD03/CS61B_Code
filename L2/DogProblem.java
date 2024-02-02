package L2;

public class DogProblem {
    public static Dog[] largerThanFourNeighbors(Dog[] dogs) {
        Dog[] returnDogs = new Dog[dogs.length];
        int cnt = 0;
        for(int i = 0; i < dogs.length; i++){
            if(isBiggestOfFour(dogs, i)){
                returnDogs[cnt] = dogs[i];
                cnt++;
            }
        }
        returnDogs = arrayWithNoNulls(returnDogs, cnt);
        return returnDogs;
    }

    public static Dog[] arrayWithNoNulls(Dog[] dogs,int cnt) {
        Dog[] noNullDogs = new Dog[cnt];
        for(int i = 0; i<cnt; i++){
            noNullDogs[i] = dogs[i];
        }
        return noNullDogs;
    }

    public static boolean isBiggestOfFour(Dog[] dogs, int i) {
        boolean isBiggest = true;
        for(int j = -2; j<= 2 ;j++){
            int compareIndex = i+j;
            if(j == 0){  //avoid comparing the dog to itself
                continue;
            }
            if(validIndex(dogs, compareIndex)){
                if(dogs[compareIndex].weightInPounds >= dogs[i].weightInPounds){
                    isBiggest = false;
                }
            }
        }
        return isBiggest;
    }

    public static boolean validIndex(Dog[] dogs, int i) {
        if(i<0){
            return false;
        }
        if (i>=dogs.length){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Dog[] dogs = new Dog[]{
            new Dog(10),
            new Dog(15),
            new Dog(20),
            new Dog(15),
            new Dog(10),
            new Dog(5),
            new Dog(10),
            new Dog(15),
            new Dog(22),
            new Dog(15),
            new Dog(20)
        };

        Dog[] bigDogs1 = largerThanFourNeighbors(dogs);

        for(int i = 0; i<bigDogs1.length; i++){
            if(bigDogs1[i] != null){
                System.out.println(bigDogs1[i].weightInPounds + " ");
            }
        }
        System.out.println();
    }
    
    

    
}
