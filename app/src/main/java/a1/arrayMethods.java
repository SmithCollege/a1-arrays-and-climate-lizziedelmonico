package a1;
import java.util.Arrays;

public class arrayMethods {

    /* Returns the sum of all the elements in the array */ 
    public static float wholeSum(float[] arr){
        float sum = 0;
        for (float i = 0;  i < arr.length; i++){
            sum += arr[(int)i];
        }
        return sum;
    }

    /* Returns the sum of a certain selection of numbers in the array */
    public static float sum(float[] arr, int lo, int hi){
        float sum = 0;
        for (float i = lo; i < arr[hi]; i++){
            sum += arr[((int)i)];
        }
        return sum;
    }

    /* Uses the sum method and divides by the amount of numbers in the array and returns the mean */
    public static float mean(float[] arr, int lo, int hi){
        float sum = 0;
        for (float i = lo; i < arr[hi]; i++){
            sum += arr[((int)i)];
        }
        return sum / arr[hi];
    }

    /* Returns the smallest value in a given array */
    public float min(float[] arr, float min){
        Arrays.sort(arr);
        min = arr[0];
        if (arr.length == 0){
            return (Float.NaN);
        } else {
            return min;
        }

    }

    /* Returns the largest value in a given array */
    public float max(float[] arr, float max){
        Arrays.sort(arr);
        max = arr[arr.length - 1];
        if (arr.length == 0){
            return Float.NaN;
        } else {
            return max;
        }
    }


    
}
