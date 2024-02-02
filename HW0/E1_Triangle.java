package HW0;

public class E1_Triangle {
    public static void printStar(int r){
        for(int i = 0; i < r; i++){
            System.out.print("*");
        }
        System.out.println();
    }
    public static  void main(String[] args) {
        int totalRow = 5;
        int row = 1;
        while( row <= totalRow){
            printStar(row);
            row += 1;
        }
    }
    
}
