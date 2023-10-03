package bridge;

public class Visa extends BandeiraCartao{
    public Visa(float tarifaBase) {
        super(tarifaBase);
    }


    public float calcularTarifa() {
        return this.tarifaBase;
    }
}
