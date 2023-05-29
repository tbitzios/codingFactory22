package gr.aueb.cf.ch6;

public class MissingValueofArray {
    public static void main(String[] args) {
        int[] array={5,1,3,2};
        int missingValue=getMissing(array);
        System.out.printf("The missing value is: %d", missingValue);
    }
    public static int getMissing(int[] arr){
        int n=arr.length+1;
        int sum=(n*(n+1))/2;
        int missingsum=0;
        for(int i=0; i<arr.length; i++){
            missingsum = missingsum + arr[i];
        }
        int missingValue=sum-missingsum;
        return missingValue;
    }
}
