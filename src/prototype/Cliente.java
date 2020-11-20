package prototype;

/**
 *
 * @author Leocassio
 */
public class Cliente {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        XREPrototype xREPrototype = new XREPrototype();
        
        MotoPrototype xreNova = xREPrototype.clonar();
        xreNova.setPreco(16000.0);
        
        System.out.println(xreNova.exibirInfo());
    }
    
}
