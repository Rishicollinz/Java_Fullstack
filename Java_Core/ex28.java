import java.util.*;

public class ex28 {
    public static void main(String[] args) {
        int size,arr[],i,n,j;
        boolean flag=false;
        System.out.println("Enter the array size:");
        Scanner sc=new Scanner(System.in);
        size=sc.nextInt();
        arr=new int[size];
        System.out.println("Enter the array element: ");
        for(i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element to be deleted : ");
        n=sc.nextInt();
        for(i=0;i<size;i++){
            if(arr[i]==n){
                for(j=i;j<size;j++)
                {
                    if(j!=size-1)
                    {
                        arr[j]=arr[j+1];
                    }
                    else
                    {
                        arr[j]=0;
                    }
                }
            }
            if(arr[i]==n && flag==false)
                {
                    i-=1;
                    flag=true;
                }
        }
        System.out.println(Arrays.toString(arr));
        
    }
}