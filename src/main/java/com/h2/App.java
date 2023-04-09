/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public static int doubleTheNumber(int num) {
        return 2 * num;
    }

    private static int add(int[] num) {
        var sum = 0;
        for(int number: num) {
            sum += num;
        }
        return sum;
    }
}