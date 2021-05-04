package app;


import appDatos.Rectangulo;

import appDatos.Triangulo;

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
        Float base = null;
        
        try {
            base = teclado.nextFloat();
        }catch(Exception err) {
            
        }
        rec.cargarDatos(altura, base);    
        float resultadoRec = rec.calcular();

        tri.cargarDatos(altura, base);    
        float resultadoTri = tri.calcular();

        
        
        System.out.println("\n¡rea del rect·ngulo = " + resultadoRec);
        System.out.println("¡rea del tri·ngulo rect·ngulo = " + resultadoTri);
        
        boolean verificarRequerimiento = rec.requerimiento04(456.4f);
        
        if(verificarRequerimiento==true) {
            System.out.println("\nEl ·rea es mayor al valor permitido.");
        }
        //
        //hghg
        
    }
}
