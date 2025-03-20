public class question2 {
    public static void main(String[] args) {

        int a = 1000;           
        byte b = 50;             
        short s = 150;           
        long l = 100000L;        
        float f = 10.5f;         
        double d = 20.5;         
        char c = 'A';            

        byte byteResult = (byte) a;         // int to byte
        short shortResult1 = (short) a;     // int to short
        short shortResult2 = (short) b;     // byte to short
        int intResult1 = (int) l;           // long to int
        short shortResult3 = (short) l;    // long to short
        int intResult2 = (int) f;           // float to int
        byte byteResult2 = (byte) f;       // float to byte
        int intResult3 = (int) d;           // double to int
        short shortResult4 = (short) d;    // double to short
        char charResult = (char) d;        // double to char 

        System.out.println("Downcasting Results:");
        System.out.println("int to byte: " + byteResult);
        System.out.println("int to short: " + shortResult1);
        System.out.println("byte to short: " + shortResult2);
        System.out.println("long to int: " + intResult1);
        System.out.println("long to short: " + shortResult3);
        System.out.println("float to int: " + intResult2);
        System.out.println("float to byte: " + byteResult2);
        System.out.println("double to int: " + intResult3);
        System.out.println("double to short: " + shortResult4);
        System.out.println("double to char: " + charResult);
    }
}
