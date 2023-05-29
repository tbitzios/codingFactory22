package gr.aueb.cf.ch6;

public class ArraySearchApp {
    public static void main(String[] args) {
        final int Secret=12;
        int[] arr={1, 5, 9, 3, 12};
        boolean secretIsFound=false;

//        for(int item: arr){
//            if (item==Secret){
//                secretIsFound=true;
//                break;
//            }
        for (int i = 0; i < arr.length; i++) {
            if (Secret==arr[i]) {
                secretIsFound = true;
                break;
            }
        }
            if (secretIsFound){
                System.out.println("Secret Key was Found");
            }else{
                System.out.println("Secret key was not found");
            }
        }
    }

