package gr.aueb.cf.ch6;

public class CircularRotationApp {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] rotated=doCircularRightShiftBy(arr,1);
        print(rotated);

    }

    /**
     *
     * @param arr   the given array of integers
     * @param offset  the distance to rotate
     * @return  the rotated array,
     *          or null if th given array is null
     */
    public static int[] doCircularRightShiftBy(int[] arr, int offset){
        if(arr==null) return null;
        int[] rotated = new int[arr.length];

        for(int i=0; i<arr.length;i++){
            rotated[(i + offset) %arr.length] = arr[i];
        }
        return rotated;
    }
    public static int[] doCircularLeftShiftBy(int[] arr, int offset){
        if(arr==null) return null;
        int[] rotated = new int[arr.length];

        for(int i=0; i<arr.length;i++){
            rotated[i] = arr[(i + offset) % arr.length];
        }
        return rotated;
    }
    public static void print(int[] arr){
        if(arr==null) return;
        for(int item:arr){
            System.out.print(item + " ");
        }
    }
}
