
import static java.lang.Math.abs;
import static java.lang.Math.sqrt;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Guillermo Rodriguez Morote
 * @version 1
 * Nombre: minicalculadora
 * Descripcion General:
 * Tiene 2 metodos uno para sacar el valor absoluto y otro para sacar la raiz cuadrada
 */
public class minicalculadora {
    /**
     * constructor vacio de la clase para poder usar los metodos
     */
    public minicalculadora(){
        
    }
    /**
     * Metodo: getvalorabsoluto
     * Metodo que a traves de un Double devuelve su valor absoluto
     * @param x Double
     * @return valor absoluto de x
     */
    public double getvalorabsoluto(double x){
        return abs(x);
    }
    /**
     * Metodo: getraizcuadrada
     * Metodo que a traves de un Double devuelve su raiz cuadrada
     * @param x Double
     * @return raiz cuadrada de x
     */
    public double getraizcuadrada(double x){
        return sqrt(x);
    }
    
    public static void main(String[] args){
        // Llamamos a los metodos con un valor
        double x= 7;
        
        System.out.println(new minicalculadora().getvalorabsoluto(x));
        System.out.println(new minicalculadora().getraizcuadrada(x));
    }
}
