public class HelloWorldLambda {
    public static void main(String[] args) {
        HelloWorldInterface helloWorld = () -> "Hello world from lambda";
        System.out.println(helloWorld.sayHelloWorld());
    }
}
