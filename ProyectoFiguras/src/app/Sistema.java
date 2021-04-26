package app;


import java.util.Scanner;

public class Sistema  {
 
   private Triangulo tri = new Triangulo();
   private Rectangulo rec = new Rectangulo();
 
    public Sistema() {
        super();
    }
    
    
    public void miMain() {

        System.out.println("C·lculo del ·rea de cuan rect·ngulo y un triangulo rect·ngulo");
        Scanner teclado = new Scanner(System.in);
        System.out.print("  Entrar la altura => ");
        
        Float altura = teclado.nextFloat();
       
        System.out.print("  Entrar la base => ");
        Float base = teclado.nextFloat() ;
        
        rec.cargarDatos(altura, base);    
        float resultadoRec = rec.calcular();

        tri.cargarDatos(altura, base);    
        float resultadoTri = tri.calcular();

        
        
        System.out.println("\n¡rea del rect·ngulo = " + resultadoRec);
        System.out.println("¡rea del tri·ngulo rect·ngulo = " + resultadoTri);
        
        boolean verificarRequerimiento = rec.requerimiento04(456.4f);
        
        if(verificarRequerimiento==true) {
            System.out.println("El ·rea es mayor al valor permitido");
        }
        
    }
}
