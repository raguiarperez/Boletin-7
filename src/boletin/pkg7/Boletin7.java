
package boletin.pkg7;

/**

 * @author rafa
 */
public class Boletin7 {


    public static void main(String[] args) {
        Libro libro1 = new Libro("rosalin","Jojo",3,0);
        Libro libro2 = new Libro("adios","pepe gonzales",7,2);
        Libro libro3 = new Libro();
        libro3.setTitulo("adeus e mais");
        libro3.setAutor("floup");
        libro3.setExemplares(9);
        libro3.setPrestados(7);
        
        libro1.prestamo();
        libro2.prestamo();
        libro3.devolucion();
    }
    
}
