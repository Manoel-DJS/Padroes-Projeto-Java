package one.digital.innovation.gof;

/**
 * Singleton "preguiçoso".
 *
 * @author Manoel Vinicius
 */
public class SingletonLazy {
    private static SingletonLazy instancia;

    private SingletonLazy(){
        super();
    }
    public static SingletonLazy getInstancia() {
        if (instancia == null) {
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}
