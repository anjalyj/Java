/**
 * Created by anjalyj on 01/03/16.
 */
public class PowerOfTwo {

    public static boolean isPowerOf(int number){
        return (number & (number - 1)) == 0;
    }
}
