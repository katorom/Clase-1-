
package programa.pkg1;


public class Programa1 {

  
    public static void main(String[] args) 
    {
        java.util.Scanner lectura = new java.util.Scanner(System.in);
        int mayor = 0, menor = 0; 
        int a,b; 
        
        System.out.println("Ingrese el valor de A");
        a = lectura.nextInt();
        
        System.out.println("Ingrese el valor de B");
        b = lectura.nextInt();
        
        if (a > b)
        {
            mayor = a; 
            menor = b; 
        }
        else
        {
            mayor = b; 
            menor = a; 
        }
        System.out.println("el numero mayor es:"+mayor);
        System.out.println("el numero menor es:"+menor);
        
    }
    
}
