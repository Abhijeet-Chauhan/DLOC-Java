public class question1 {
    public static void main(String[] args) {

        byte a = 1;
        short b = 2;
        int c = 30;
        char d = 'a';  
        float e = 4.5f;
        double f = 5.67;
        long g = 1243;

        int i = a;     // byte to int
        long ln = c;   // int to long
        float ft = c;  // int to float
        double db = e; // float to double 
        float fo = g;  // long to float
        double db3 = g; // long to double
        long ln2 = b;  // short to long
        double db4 = b; // short to double
        int ch = d;    // char to int 


        System.out.println("Auto Upcasting Results:");
        System.out.println("byte to int: " + i);
        System.out.println("int to long: " + ln);
        System.out.println("int to float: " + ft);
        System.out.println("float to double: " + db);
        System.out.println("long to float: " + fo);
        System.out.println("long to double: " + db3);
        System.out.println("short to long: " + ln2);
        System.out.println("short to double: " + db4);
        System.out.println("char to int: " + ch);
    }
}
