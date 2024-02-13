import java.io.*;
import java.util.*;
public class raks {
    public static void main(String[] args) {
        int i,j;
    String[] name= {"James","Jacob","prince","Ria"};
    int size=name.length;
    String temp=null;
    for(i=0;i<size;i++) {
    for(j=i+1;j<size;j++) {
    if(name[j].compareTo(name[i])<0){
        temp=name[i];
        name[i]=name[j];
        name[j]=temp;
    }
    }
    for(i=0;i<size;i++) {
        System.out.println(name[i]);
        }
}      

    }
}
