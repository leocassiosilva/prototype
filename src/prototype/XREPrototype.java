package prototype;

/**
 *
 * @author Leocassio
 */
public class XREPrototype extends MotoPrototype{

    protected XREPrototype(XREPrototype xrePrototype){
        this.preco = xrePrototype.getPreco();
    }
    
    public XREPrototype(){
        preco = 0.0;
    }
    
    @Override
    public String exibirInfo() {
        return "Tipo: XRE\n Montadora: Honda\n" + "Preço: R$" + getPreco();
    }

    @Override
    public MotoPrototype clonar() {
        return new XREPrototype(this);
    }
}
