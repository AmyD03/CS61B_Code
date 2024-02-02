package L1;
public class LargerDemo {
    public static int larger(int x, int y){
        if(x > y){
            return x;
        }
        return y;
    }
    public static void main(String[] args) {
        System.out.println(larger(-5, 10));
    }
}

/**
    1. To declare a function in Java, use "public static"
    2. All parameters of a function must have a type and the function itself must have aa return type
    3. All functions must be part of a class
    In Programming Language termiology, a function that is a part of a class is called a "method", so all functions in Java are methods.
    * 
 */