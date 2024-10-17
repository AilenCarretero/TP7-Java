public class Celda {
    private int fila;
    private int columna;
    private String valor;

    //Creamos el constructor de la instancia de la clase.
    public Celda(int fila, int columna, String valor) {
        this.fila = fila;
        this.columna = columna;
        this.valor = valor;
    }

    public String toString() {
        return "Celda [F = " + fila + ", C = " + columna + ", V = " + valor + "]";
    }


    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}