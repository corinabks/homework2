import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println(product(165, 71));
        System.out.println(average(12, 16, 55));
        System.out.println(addition(125, 24));
        System.out.println(substract(125, 24));
        System.out.println(multiply(125, 24));
        System.out.println(divide(125, 24));
        System.out.println(remainder(125, 24));
        System.out.println(("Temperature in Farenheit is:  ")+FtoC());
        System.out.println(("Value in meter is: ")+Inchtometer());
        System.out.println("   J    a   v     v  a ");
        System.out.println("   J   a a   v   v  a a");
        System.out.println("J  J  aaaaa   V V  aaaaa");
        System.out.println(" JJ  a     a   V  a     a");
        System.out.println(" + '' '' '' '' '' +");
        System.out.println("[|    0      0    |]");
        System.out.println(" |        ^       |");
        System.out.println(" |       '_'      |") ;
        System.out.println(" +  _  _  _  _  _ +");


    }

    public static int product(int primulNumar, int alDoileaNumar) {
        int resultat = primulNumar * alDoileaNumar;
        return resultat;
    }


    public static float average(int primulNumar, int alDoileaNumar, int alTreileaNumar) {
        float resultat = ((primulNumar + alDoileaNumar + alTreileaNumar) / 3f);
        return resultat;
    }

    public static int addition (int primulNumar, int alDoileaNumar){
        int resultat = primulNumar + alDoileaNumar;
        return resultat;
    }

    public static int substract (int primulNumar, int alDoileaNumar){
        int resultat = primulNumar - alDoileaNumar;
        return resultat;
    }

    public static int multiply (int primulNumar, int alDoileaNumar){
        int resultat = primulNumar * alDoileaNumar;
        return resultat;
    }

    public static int divide (int primulNumar, int alDoileaNumar){
        int resultat = primulNumar / alDoileaNumar;
        return resultat;
    }

    public static int remainder (int primulNumar, int alDoileaNumar){
        int resultat = primulNumar % alDoileaNumar;
        return resultat;
    }

    public static float FtoC (){
       System.out.print ("enter temperature in farenheit: ") ;
       Scanner scan= new Scanner(System.in);
       float farenheit = scan.nextFloat();
       float Celsius = (farenheit - 32)*5/9;
       return Celsius;

    }

    public static float Inchtometer() {
        System.out.print ("Enter value:");
        Scanner scan = new Scanner (System.in);
        float inch = scan.nextFloat();
        float meter = (inch*0.0254f);
        return meter;
    }


    }



