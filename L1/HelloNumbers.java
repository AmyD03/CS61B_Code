package L1;
public class HelloNumbers {
    public static void main(String[] args) {
        int x = 0;  //DECLARE x exists and is an integer
        while(x < 10){
            System.out.println(x + " ");
            x = x + 1;
        }
    }
    
}

/**
    1. Before Java variables can be used, they must be declared.
    2. Java variables must have a specific data type.
    3. Java variable types can never change.
    4. In Java, types are verified before the code runs! If there are type issues, the code will not compile.
 
 VS Python:
    python code can crash due to type error when its running
    * 
 */