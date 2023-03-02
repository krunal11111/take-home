package fun;

public class GameTests {

    public static void main(String[] args) {
        System.out.println(" Hello , this is my jar ");
        if (args.length > 0 ){
            System.out.println(" i have some changes to make ");
            for(String arg : args) System.out.println("one of my args: "+ arg);
        }
    }


}
