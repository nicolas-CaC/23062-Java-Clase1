package clase1;


public class TipoNumericos {

    int a, g; // 4 bytes
    short b; // 2 bytes
    long c; // 8 bytes
    byte d; // 1 byte
    
    float e; // 4 bytes
    double f; // 8 bytes
    
    final int h;
    final double i;
    
    public TipoNumericos(int numero){
        
        a = -21000000;
        b = -32768;
        c = 123456456789L;
        d = -128;
        e = 0.123456F;
        f = 0.1234567890;
        g = 100 * numero;
        h = 1;
        i = 2.43;
    }
}
