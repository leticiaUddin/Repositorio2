package Modelo;

/**
 *
 * @author REDMA
 */
public class Calculadora {

    private float numeroUno;
    private float numeroDos;

    public Calculadora() {
        this.numeroUno = 10;
        this.numeroDos = 20;
    }

    public Calculadora(float numeroUno) {
        this.numeroUno = numeroUno;

    }

    public Calculadora(float numeroUno, float numeroDos) {
        this.numeroUno = numeroUno;
        this.numeroDos = numeroDos;
    }

    public float getNumeroUno() {
        return numeroUno;
    }

    public void setNumeroUno(float numeroUno) {
        this.numeroUno = numeroUno;
    }

    public float getNumeroDos() {
        return numeroDos;
    }

    public void setNumeroDos(float numeroDos) {
        this.numeroDos = numeroDos;
    }

}
