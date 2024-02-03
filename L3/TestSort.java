package L3;

public class TestSort {
    public static void testSort(){
        String[] input = {"I","have","an","egg"};
        String[] expected = {"an","egg","have","I"};

        Sort.sort(input);

        // org.junit.Assert.assertEquals(input,expected);


        for(int i = 0 ; i < input.length ; i++){
            if(!input[i].equals(expected[i])){
                System.out.println("Mismatch in position" + i + ",expected:" + expected[i] + ",but got:" + input[i]);   
            }
        }

        // // == 当地址相同时相同
        // if(!java.util.Arrays.equals(input,expected)){
        //     System.out.println("Error! There seems to be a problem with Sort.sort.");
        // }
    }
    public static void main(String[] args) {
        testSort();
    }
}
