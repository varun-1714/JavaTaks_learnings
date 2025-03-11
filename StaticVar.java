public class nonstatic {
    byte b ;
    short s ;
    int i ;
    long l1;
    float f1;
    double d1;                               // declaration of primitive datatypes
    char ch;
    boolean bool;
    String str;
    public   void main(String[] args) {

    nonstatic e = new nonstatic();
         System.out.println( e.b);
         System.out.println( e.i);
         System.out.println( e.l1);
         System.out.println( e.f1);               // Calling datatypes using object creation
         System.out.println( e.d1);
         System.out.println( e.ch);
         System.out.println( e.bool);
         System.out.println( e.str);


/* public class eri {
   static byte b ;
   static short s ;
   static int i ;
   static long l1;
   static float f1;                                   // static variables declartion using static keyword
   static double d1;
   static char ch;
   static boolean bool;
   static String str;
    public static void main(String[] args) {
        System.out.println(eri.b);
        System.out.println(eri.i);
        System.out.println(eri.s);
        System.out.println(eri.l1);
        System.out.println(eri.f1);
        System.out.println(eri.d1);
        System.out.println(eri.ch);
        System.out.println(eri.bool);
        System.out.println(eri.str);
        


    }
}
*/
 
     }
 }
  
