package app;


import appDatos.Rectangulo;

import appDatos.Triangulo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Sistema  {
   private int N = 3;
   
   private Triangulo[] tri = new Triangulo[N];
   private Rectangulo rec[] = new Rectangulo[N];
   
 
    public Sistema() {
        super();
    }
    
    
    public void miMain() {
        System.out.println("Cálculo del área de 3 rectángulo y 3 triangulo rectángulo");   
        
        for(int i=0; i<N; i++) {
            tri[i] = new Triangulo();
            rec[i] = new Rectangulo();
        }
        
        Float base = null;
        Float altura = null;
        Scanner teclado=null;
        Float resultadoRec = null;
        Float resultadoTri = null;
        int figuraN = 0;
        
        teclado = new Scanner(System.in);
        
        //Ejemplo de cargar un vector con objetos
        do {
          try {
            do {
              System.out.print("  [0 salir] Entrar la altura para la figura " + figuraN + " => ");
              altura = teclado.nextFloat();
              if(altura.equals(0.0f)) System.exit(90); //Quizás falta verificar números negativos 

              System.out.print("  [0 salir] Entrar la base para la figura " + figuraN + " => ");
                
              base = teclado.nextFloat();
                
              if(base.equals(0.0f)) System.exit(91); //Quizás falta verificar números negativos               

              rec[figuraN].cargarDatos(altura, base);
              resultadoRec = rec[figuraN].calcular();

              tri[figuraN].cargarDatos(altura, base);     
              resultadoTri = tri[figuraN].calcular();
              figuraN=figuraN+1;
            }while(figuraN < N);
          }catch(InputMismatchException err) {
              System.out.println("Error de entrada, se espera un número: " + err.getMessage());
              teclado.nextLine(); //limpiar buffer del teclado
              figuraN = 0;              
          }catch(Exception err) {
            System.out.println("Error de entrada, se espera un número: " + err.getMessage());
            teclado.nextLine(); //limpiar buffer del teclado
            figuraN = 0;
          }
        }while(figuraN < N);
        
        //Ejemplo de recorrer un vector de objetos
        for(int i=0; i<N; i++) {
          System.out.println("\nÁrea del rectángulo N° " + i + " = " + rec[i].getResultado());
          System.out.println("Área del triángulo rectángulo N° " + i + " = " + tri[i].getResultado());
        
          boolean verificarRequerimiento = rec[i].requerimiento04(456.4f);
        
          if(verificarRequerimiento==true) {
            System.out.println("\nEl área es mayor al valor permitido.");
          }
        }
    }
}
