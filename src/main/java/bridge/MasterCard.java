package bridge;

public class MasterCard extends BandeiraCartao {

    public MasterCard(float tarifaBase) {
        super(tarifaBase);
    }


    public float calcularTarifa() {
        return this.tarifaBase;
    }

}
