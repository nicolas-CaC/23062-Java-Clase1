package clase1;

public class TiposCadenas {

    char a, b; // 2 bytes
    String c, d;

    public TiposCadenas(String cadena) {
        a = 'a';
        b = 'A';
        c = "¿Hola?";
        d = cadena;
    }
    
    public TiposCadenas(String cadena, String otraCadena) {
        a = 'a';
        b = 'A';
        c = otraCadena;
        d = cadena;
    }
    
}
