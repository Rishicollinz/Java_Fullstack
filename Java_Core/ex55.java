import java.io.*;
import java.util.*;
class Students{
    int rollno,std,mark1,mark2,mark3,mark4;
    String name;
    int mark[]=new int[4];
    static int count=0;
    public Students(int rollno,String name,int std,int[] marks){
        this.rollno=rollno;
        this.name=name;
        this.std=std;
        for(int i=0;i<4;i++){
            mark[i]=marks[i];
        }
        
    }

    void display(){
        count++;
        System.out.print("\nStudent "+count+" details");
        System.out.print("Roll No:"+rollno+" Name:"+name+" Standard:"+std);
        System.out.println(Arrays.toString(mark));
    
    }
}
public class ex55 {
    public static void main(String[] args) {
        int i,rollno,std;
        String name;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int size=sc.nextInt();
        int marks[]=new int[4];
        Students stds[]=new Students[size];
        for(i=0;i<stds.length;i++){
            System.out.println("Student:"+(i+1)+" Details:");
            System.out.println("Enter the rollno:");
            rollno=sc.nextInt();
            System.out.println("Enter the name:");
            sc.nextLine();
            name=sc.nextLine();
            System.out.println("Enter the standard:");
            std=sc.nextInt();
            for(int j=0;j<4;j++){
                System.out.println("Enter mark "+(j+1)+" :");
                marks[j]=sc.nextInt();
            }
            Students s=new Students(rollno,name,std,marks);
            stds[i]=s;
        }
        for(i=0;i<stds.length;i++){
            stds[i].display();
        }
    }
}
