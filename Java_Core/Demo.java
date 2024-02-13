import java.io.*;

/* import is a keyword.
 . is used as "/" as going inside folders in explorer.
 * is used to include all thing in package.
 io is input and output.
 ; is used to say that the statement is finished. here ; is called as terminator.*/

class Demo{
/* class:
  ->It is a template or blueprint how an object should be behaved.
  ->It is a keyword.
  ->the class name should be caps.
  ->If two,three words, each starting word should be capital.
*/
public static void main(String[] args) {
    /*
    ->method name should be small.
    ->String is a class in java. so first letter caps.
    ->variable name should be small.two,three variables use underscore.
    ->args is array type

    Access specifier:
    ->public is access specifier.
    i)public:
        Anyone can use.
    ii)private||default is similar to private:
        only owner can use.
        The class which defines it, only it can use that.
    iii)protected:
        Definied class can use it,
        and others who inherits it, can also use it.

    static:
        *.A class generally needs objects but static allows the class to execute without
        objects.


    */
    /* 
        Three important things in program:
        1)->data
        2)->input
        3)->output
        3)output:
            System handles input and output.
            system is used to use computer's standard input i.e keyboard and output i.e monitor
            System.out
            ->out is a static field. creating objects takes space . so we use static field
            in system.
            System.in
            ->in is a static input field.
        
        Three methods commonly used in output:
            ->println();
            ->print();
            ->printf();
        
        ->println and print can take only one argument whereas printf takes multiple argument.

    */
    //println
    System.out.println("helo");//single argument;
    System.out.println("helo"+10);//single argument; o/p:helo10
    System.out.println("helo"+10+20);//o/p:helo1020 bcoz., 10 is converted to string then 
    //20 is converted to string
    System.out.println("helo"+(10+20));//o/p:helo30 bcoz of brackets, 10+20 as int then
    //converted to string
    System.out.println('A'+10);//'A' type casted to integer as ascii value// o/p:65+10=75
    System.out.println("helo"+10*20);//o/p:helo200 because priority i think so
    //except sub every arithmetic operation works.

    //println() : After printing goes to new line not before.

    //print:
    System.out.print("hello");
    System.out.println("hii");//o/p:hellohii due to above comments.

    /*printf:
    printf is from like c
    with multiple arguments and format specifiers
    */
    double asss=20.000;
    System.out.println(asss);
    System.out.printf("%.3f",asss);
    System.out.println();
    // Empty println() doesn't cause error but empty print() causes error
    System.out.println("hello\"");// here '\' is a used to print " . It is used as escape sequence;

    System.out.println("hello\nhii");// '\n' used to print in new line
    System.out.println("hello\bhii");//o/p:hellohii '\b' means backspace;
    System.out.println("hello % hii");//o/p:hello % hii

    System.out.printf("2 out of 10 is 20%%");//o.p:%% in printf means % 2 out of 10 is 20%

    /*
    
    */

}
}
