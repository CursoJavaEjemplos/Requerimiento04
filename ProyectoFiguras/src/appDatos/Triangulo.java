package appDatos;


public class Triangulo extends Figura {
    
    
    public Triangulo() {
        super();
    }

    public void cargarDatos(Float altura, Float base) {
        //cargar los datos en la superclase Figura{}
        this.setBase(altura); 
        this.setAltura(base);
    }
    
    public float calcular() {
        float resultado = (getAltura()  * getBase())/2;
        this.setResultado(resultado);
        return resultado;
    }
    
}
