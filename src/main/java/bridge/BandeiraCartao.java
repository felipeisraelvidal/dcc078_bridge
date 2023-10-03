package bridge;

public abstract class BandeiraCartao {

    protected TipoPagamento tipoPagamento;

    protected float tarifaBase;

    public BandeiraCartao(float tarifaBase) {
        this.tarifaBase = tarifaBase;
    }

    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public void setTarifaBase(float tarifaBase) {
        this.tarifaBase = tarifaBase;
    }

    public abstract float calcularTarifa();
}