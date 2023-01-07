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

        // Other systems
        // Hexadecimal
        int hex = 0x1f;
        byte binary = 0b01101;

        // With pipe (it allows to sum up binaries)
        int bpipe = 0b01 | 0b10; // 3 (0b01 - 1, 0b10 - 2, | is like + (not exactly, it operates bits), so it means 1 + 2)
        int dpipe = 1 | 2 | 4; // 7 (we can use pipe with hex numbers also, but it's not exactly a sum!)
        System.out.println(dpipe);
        // Binary OR (|)
        // 0    1   0   1 (first binary)
        // 0    1   1   0 (second binary)
        // 0    1   1   1 (result binary)

        // Binary AND
        // 0    1   0   1 (first binary)
        // 0    1   1   0 (second binary)
        // 0    1   0   0 (result binary)
        System.out.println(bpipe & 2); // Bit mask - returns 2 - it means that according bit is on
        // Bit masks are using in IPs addresses

    }
}
