
package areas;


public class operaciones {
    //declaracion de variables
    double radio;
    double lado1pen;
    int ladocu;
    double apotema;
    
    
    public operaciones(double ra, double pen, double apo, int cu){
        
        radio=ra;
        lado1pen=pen;
        ladocu=cu;
        apotema=apo;
       
    }
    
    public double area1()
{
    double area;
    area=(radio*radio*3.14);
    return area;
}

    public double area2()
{   double perimetro;
    double area;
    perimetro = lado1pen*5;
    area=perimetro*apotema/2;
    return area;
}
    
    public double area3()
{   int resul;
    resul=ladocu*ladocu;
    return resul;   
}        
           
    
}
