package app;

public class Rec extends Figura implements Calcular {
    public Rec() {
        super();
    }


    @Override
    public Float calcular() {
        // TODO Implement this method
        return this.getBase() * this.getAltura();
    }

    @Override
    public void entrarAltura(Float a) {
        // TODO Implement this method
        
        this.entrarAltura(a);
        
    }

    @Override
    public void entrarBase(Float b) {
        // TODO Implement this method
        
        this.entrarBase(b);
        
    }
}
