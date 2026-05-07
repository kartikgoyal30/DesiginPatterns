public class SingletonPattern{
//Singleton pattern is a software design pattern that restricts the instantiation of a class 
//to a single instance and provides a global point of access to it.
//Single instance throughout the application, ensuring that there is only one instance
// of the class and providing a global point of access to it.
    private static SingletonPattern instance;
    private SingletonPattern() {
        // Private constructor to prevent instantiation
    }
    public static SingletonPattern getInstance() {
        if (instance == null) {
            instance = new SingletonPattern();
        }
        return instance;
    }
    public void someMethod() {
        System.out.println("This is a method in the singleton class.");
    }
    public static void main(String[] args) {
        SingletonPattern singleton1 = SingletonPattern.getInstance();
        SingletonPattern singleton2 = SingletonPattern.getInstance();
        System.out.println(singleton1 == singleton2); // true
        singleton1.someMethod(); // This is a method in the singleton class.
    }
}