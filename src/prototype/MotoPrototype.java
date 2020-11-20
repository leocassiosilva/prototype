package prototype;

/**
 *
 * @author Leocassio
 */
public abstract class MotoPrototype {
    protected double preco;
 
    public abstract String exibirInfo();
 
    public abstract MotoPrototype clonar();
 
    public double getPreco() {
        return preco;
    }
 
    public void setPreco(double preco) {
        this.preco = preco;
    }
}
