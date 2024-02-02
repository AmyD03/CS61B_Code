package HW0;

public class E3_maximum {
    public static int max(int[] m) {
        int max = m[0];
        for(int i = 0; i < m.length-1; i++){
            if(m[i]<m[i+1]){
                max = m[i+1];
            }
        }
        return max;
    }
    public static void main(String[] args) {
       int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};    
       System.out.println(max(numbers));  
    }
}


/**
 ARRAY：
    int[] numbers = new int[3];
    numbers[0]=1;
    System.out.println(numbers[0]);


    int[] numbers = new int[]{1,2,3,4}
    System.out.println(numbers[0]);
    System.out.println(numbers.length);

 * 
 */