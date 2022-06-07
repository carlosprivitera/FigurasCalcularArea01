package vista;

import app.Rec;
import app.Tri;

public class EntrarSistema {
    public EntrarSistema() {
        super();
    }
    private static Rec rec =  new Rec();
    private static Tri tri =  new Tri();
    public static void main(String[] args) {
        EntrarSistema entrarSistema = new EntrarSistema();
        
        
        
        System.out.println(rec.calcular());
        
        
        System.out.println(tri.calcular());
        
    }
}
