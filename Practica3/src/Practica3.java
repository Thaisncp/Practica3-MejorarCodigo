import java.util.Scanner;

/**
 *
 * @author Thais Cartuche
 */

public class Practica3 {
    private String salida;
    private int tamanio;
    String tempOOM = "";

    public Practica3(int leng) {
        StringBuilder resultado = new StringBuilder(200000000);
        this.tamanio = leng;
        int i = 0;
        while (i < leng) {
            i++;
            try { 
                resultado.append("a");
            } catch (OutOfMemoryError e) {
                e.printStackTrace();
                break;
            }
        }
        this.salida = resultado.toString();
        this.salida = tempOOM.toString();
    }

    public String getOom() {
        return salida;
    }

    public int getLength() {
        return tamanio;
    }

    public static void main(String[] args) {
        Practica3 javaHeapTest = new Practica3(200000000);
        System.out.println(javaHeapTest.getOom().length());
        Scanner sc = new Scanner(System.in);
        System.out.println("precione cualquier numero");
        sc.nextInt();
    }
}
