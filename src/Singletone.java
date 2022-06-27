

public class Singletone {
    public static void main(String[] args) {
        SingletonInheritanceCheck singletonInheritanceCheck = SingletonInheritanceCheck.getSingleton();
        System.out.println(singletonInheritanceCheck);
        SingletonInheritanceCheck singletonInheritanceCheck1 = SingletonInheritanceCheck.getSingleton();
        System.out.println(singletonInheritanceCheck1);


    }
}
class SingletonInheritanceCheck{
    private static  SingletonInheritanceCheck singletonInheritanceCheck = null;

    /**
     * make the constructor private
     */
    private SingletonInheritanceCheck(){}

    /**
     * get the instance using method
     * @return instance of the class
     */
    public static SingletonInheritanceCheck getSingleton(){
        if(singletonInheritanceCheck==null)
            singletonInheritanceCheck = new SingletonInheritanceCheck();
        return singletonInheritanceCheck;
    }
}