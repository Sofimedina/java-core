package skm.javacore.Collections.DesignPatterns;


class SingletonWithEnum{
    public static void main(String[] args) {
        SingletonEnum singletonEnum=SingletonEnum.SINGLE_INSTANCE;
    }
}

class Singleton{

    static Singleton instance = new Singleton();

    private Singleton() {}

    public String str;

    static Singleton getSingleInstance() {
        return instance;
    }

}


public class SingletonEx {

    public static void main(String[] args) {

        Singleton singleton1= Singleton.getSingleInstance();
        singleton1.str="Hi Im singleton";
        Singleton singleton2= Singleton.getSingleInstance();
        System.out.println(singleton2.str);




    }


}
