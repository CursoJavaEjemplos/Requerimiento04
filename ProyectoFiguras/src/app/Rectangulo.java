package app;


public class Rectangulo extends Figura {
   
    public Rectangulo() { //Constructor 
        super();          //Ejecuta el constructor de la superclase Figura{}
                    
    }

    public void cargarDatos(Float altura, Float base) {
        //cargar los datos en la superclase Figura{}
        this.setBase(altura); 
        this.setAltura(base);
    }
    
    public float calcular() {
        float resultado = (getAltura() * getBase());
        this.setResultado(resultado);
        return resultado;
    }
 
}
