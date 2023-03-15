import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[]arr=new int[]{2,1,4,3,6,5};
        int change = arr[0];
        arr[0] = arr[1];
        arr[1] = change;
        int b=arr[2];
        arr[2]=arr[3];
        arr[3]=b;
        int c=arr[4];
        arr[4]=arr[5];
        arr[5]=c;


    }

}