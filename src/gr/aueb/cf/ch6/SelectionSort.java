package gr.aueb.cf.ch6;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr={5, 8, 2, 14, 3, 25, 12};
        int tmp;
        int minVal;
        int minPosition;

        for(int i=0;i<arr.length-1;i++){

            minPosition=i;
            minVal=arr[i];
            for(int j=i+1;j<arr.length;j++){
                if(arr[j] < minVal){
                    minVal=arr[j];
                    minPosition=j;
                }
            }
            tmp=arr[i];
            arr[i]=arr[minPosition];
            arr[minPosition]=tmp;
        }
    }
}
