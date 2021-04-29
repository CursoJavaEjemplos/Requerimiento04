package appDatos;

public class Figura {
    
    private Float altura = null; 
    private Float base = null; 
    private Float resultado = null;  
    
    public Figura() {
        super();
    }


    public void setAltura(Float altura) {
        this.altura = altura;
    }

    public void setBase(Float base) {
        this.base = base;
    }


    public void setResultado(Float resultado) {
        this.resultado = resultado;
    }

    public Float getResultado() {
        return resultado;
    }

    public Float getAltura() {
        return altura;
    }

    public Float getBase() {
        return base;
    }
    
    public boolean requerimiento04(Float esMayor) {
        int si = 0; 
        
        si = resultado.compareTo(esMayor);
        
        if(si==1) {
            return true;
        }else{
            return false;
        }
    }
}
