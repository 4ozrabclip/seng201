public class StarmanSays {
    public String hello = "Hello";
    public static String helloStatic = "Hello";
    public static final String HELLO_FINAL = "Hello";

    public String sayDontPanic(){
        return "Don't Panic!";
    }
    public String sayJavaCool(){
        return "Java is cool";
    }
    public String sayGoodbyeWorld(){
        return "Goodbye, World!";
    }
    public String sayHello(){
        return hello;
    }
    public static void main(String[] args){
        StarmanSays starman = new StarmanSays();
        StarmanSays starwoman = new StarmanSays();
        System.out.println(starman.sayHello());
        System.out.println(starwoman.sayHello());
    }
}
