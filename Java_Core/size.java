public class size {
    public static void main(String[] args) {
        long a=222222222222222222L;//any num in java is int, for long declaration after num use L
        System.out.println(a);
        System.out.println(Integer.SIZE);//this gives output in bits. o/p:32 then 32/8=4bytes.
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Byte.SIZE);//8 bits=1 byte as output.
        System.out.println(Byte.MIN_VALUE);
        //If variable name small then it changes in prg.
        //If variable name caps then it is fixed.
        float ad=10.25f;//without f, any decimal is double datatype, so use f for float datatype;
        System.out.println(ad);
        byte bot=5;//155 is large for byte so use num within 127        
        System.out.println(bot);
        

    }
}
