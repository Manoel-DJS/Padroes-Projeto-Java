package one.digital.innovation.gof;

/**
 * Singleton "apressado".
 * 
 * @author Manoel Vinicius
 */
public class SingletonEager {
    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager(){
        super();
    }
    public static SingletonEager getInstancia() {
        return instancia;
    }

}
