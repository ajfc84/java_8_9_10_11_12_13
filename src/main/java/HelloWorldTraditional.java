public class HelloWorldTraditional implements HelloWorldInterface {

    public String sayHelloWorld() {
        return "Hello world!";
    }

    public static void main(String[] args) {
        HelloWorldInterface helloWorld = new HelloWorldTraditional();
        System.out.println(helloWorld.sayHelloWorld());
    }

}
