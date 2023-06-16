package clase2;

public class Arrays {
    
    public String[] arrayString = new String[3];
    public int[] arrayNumeros = {0,1,22,333,4};
    public boolean[] arrayBooleano = {true, false};
    public byte[] arrayByte = {1,11,111,127};
    public String[][] matriz = new String[2][2];

    
    public Arrays() {
        arrayString[0] = "Soy la posicion 0";
        arrayString[1] = "Soy la posicion 1";
        
        matriz[0][0] = "fila 0 Columna 0 ";
        matriz[0][1] = "fila 0 Columna 1 ";
        matriz[1][0] = "fila 1 Columna 0 ";
        matriz[1][1] = "fila 1 Columna 1 ";
    }
    
    
}
