public class Main {
    public static void main(String[] args){
        Greeting greeting = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello, World!");
            }
        };
        Greeting greeting1 = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello, Snonymous Inner Class!");
            }
        };
        greeting.sayHello();
        greeting1.sayHello();
    }
}
