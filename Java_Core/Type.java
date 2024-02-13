public class Type {
    public static void main(String[] args){
        //middata->middata//explicit typecasting type

        byte bot=5;
        int a=(int) bot;
        System.out.println(a);

        int z=(int) 50.00f;
        System.out.println(z);

        float g=40.25f;//g=(float)40.25;
        int asss=(int) g;
        System.out.println(asss);

        //middata->wrapperclass
        //it uses parse for this process,every class has it.
        String id="250";
        int id2=Integer.parseInt(id);
        String azz=String.valueOf(id2);
        //System.out.println(id2+" "+azz);

        String azzz="10.25";
        float y=Float.parseFloat(azzz);
        //it can also be but not same float y=Float.valueOf(azzz);
        System.out.println(y);
        String hel=Float.toString(y);//String hel=String.valueOf(y);
        System.out.println(hel);

        boolean ja=true;//default value of any boolean variable is false;
        System.out.println(ja);
    }
}
