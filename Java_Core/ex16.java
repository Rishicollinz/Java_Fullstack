import java.io.*;
import java.util.*;
public class ex16 {
    public static void main(String[] args) {
        for(int i=1;i<4;i=i+1){//i++ can also be like this //if j=i+1 then i never increments so infinite
            for(int j=97;j<100;j++){
                System.out.println(i+" "+(char)j);
            }
        }
    }
}
