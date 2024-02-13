package spring;
import java.util.*;
public class unique {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,1,0,-8,-9,5};
        ArrayList<Integer> arrs=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                arrs.add(arr[i]);
            }
        }
        System.out.println(arrs);
        
    }
}
