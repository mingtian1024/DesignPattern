package skyming.designpatterns.sigleton;

public class SingletonLazy {
    private static SingletonLazy instance;
    public SingletonLazy() {
    }
    public static SingletonLazy getInstance(){
        if (instance == null){
            instance = new SingletonLazy();
        }
        return instance;
    }
}
