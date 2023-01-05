package Numbers;

public class NumbersBasic {
    public static void main(String[] args) {
        // Numbers in Java are signed - that's why 1 byte can't keep 255
        // For sign MSB (the largest bit - 128) is used, it decreases the range

        // Byte - 8 bits
        // 1 byte can keep numbers: from -128 up to 127 (8 bits, 1 bit - 0 or 1)
        byte myByte = 13;

        // Short - 2 bytes - (-32768 - 32767)
        // N! Char also uses 2 bytes, but it is unsigned, so we can use it to keep numbers up to approx 65 000
        short myShort = 1024;
        char trickyChar = 45000;

        // Integer (int) - 32 Bytes (approx {-2 billion - 2 billion})
        int myInt = 1111111;

        // Long - 64 Bytes
        Long myLong = 12345678990L;

        // Float numbers
        // As float numbers are kept only approximately
        // we should use special techniques to keep accuracy with them

        // float - 32 bytes
        float myFloat = 3.14f;
        // double - 64 bytes
        double myDouble = 2.15;
        double mySecondDouble = 1.10;

        System.out.println(myDouble - mySecondDouble); // 1.0499999999998 - we are loosing accuracy here

        System.out.println(myByte);
        System.out.println(myShort);
    }
}
