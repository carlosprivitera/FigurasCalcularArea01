package app;

public abstract class Figura implements Entradas {
    public Figura() {
        super();
    }

    private Float altura = 6f;
    private Float base = 2f;

    // public abstract Float calcular();


    public void setAltura(Float altura) {
        this.altura = altura;
    }

    public Float getAltura() {
        return altura;
    }

    public void setBase(Float base) {
        this.base = base;
    }

    public Float getBase() {
        return base;
    }

}
