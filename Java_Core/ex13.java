import java.io.*;
public class ex13 {
    public static void main(String[] args) {
        int i;
        for(i=0;i<6;i++){//if we use ; after for condition then it will print with false condition i=6;
            System.out.println(i);
        }
        System.out.println(i);//i++ will increase the i=6 and then checks the condition i<6,
        //so it comes out as i=6;

        //we can declare int i=0 globally;
        //we can declare int i++ inside for loop code;
        //we can use break to check for i<6 condition;
        //int i=0;
        //for(;;){
        //    if(i==6){
        //    break;
        //    }
        //  i++;
        //}
    }
}
