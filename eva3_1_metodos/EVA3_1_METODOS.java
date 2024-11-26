/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_1_metodos;

/**
 *
 * @author Jose Enrique
 */
public class EVA3_1_METODOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     // TODO code application logic here
     //Invocar el metodo, Llamada a metodo --> Usuario   
     imprimirMensaje ("HOLA MUNDO"); 
     //los que tambien son metodos es el Printl,Math.random
     
    }
   
    //declaracion de metodo 
    //modificadores
      //valor de retorno 
         //nombre
                             //parametros (opcionlaes )
    // SOn utiles para reutilizar codigo
                                                        //la firma tiene que ser distinta
    public static void imprimirMensaje(String mensaje){
        //cuerpo del metodo
        
        System.out.println("Tu mensaje llego papu: "+ mensaje);
                
    }
}

       //son modificadores 
       //public static int max(int num1, int num2);
       //int result;
       // if (num1 > num2);
       //else
       // result = num2;
       // return result; <--- regresa el resultado 