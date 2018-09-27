/*
 * Julianne Wojdak
 * 19/09/18
 * Cost of a carpet
 */

package carpet;

/**
 *
 * @author JuWoj8013
 */
public class Carpet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double width = 8.5;
        double length = 6;
        double cost = 19.95;
        double size = (width * length);
        double carpet = 0.0;
        carpet=(size * cost);
        System.out.println ("Cost of carpet is "+carpet);
        // TODO code application logic here
    }
    
}
