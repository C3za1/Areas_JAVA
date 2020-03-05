
package areas;
import java.util.Scanner;
import areas.operaciones;


public class Areas {

   
    public static void main(String[] args) {
        // crea objeto Scanner para obtener la entrada de la ventana de comandos 
    Scanner ca = new Scanner (System.in);
    //declaracion de variables
    double radio;
    double lado1pen;
    int ladocu;
    double apotema;

    //System.out.println es para mostrar
    System.out.println("calculando areas\n");
    
     //System.out.println es para mostrar el radio del circulo
    System.out.println("introduce radio del curculo");
    //lee el radio
    radio=ca.nextDouble();
    
     //System.out.println es para mostrar la longitud de un pentagono
    System.out.println("introduce longitud de uno de los lados del pentagono");
    //lee el lado del pentagono
    lado1pen=ca.nextDouble();
    
     //System.out.println es para mostrar
    System.out.println("introduce longitud de la apotema del pentagono");
    apotema=ca.nextDouble(); 
    
    System.out.println("introduce longitud de uno de los lados del cuadrado");
    ladocu=ca.nextInt();
    
    operaciones w = new operaciones(radio, lado1pen, apotema, ladocu );
    
    
   //System.out.println es para mostrar el area del circulo
    System.out.println("el area del circulo es:"+w.area1()+"cm^2");
    
     //System.out.println es para mostrar el area del pentagono
    System.out.println("el area del pentagono es:"+w.area2()+"cm^2");
    
      //System.out.println es para mostrar el area del cuadrado
    System.out.println("el area del cuadrado es:"+w.area3()+"cm^2");
            
    }
    
}
