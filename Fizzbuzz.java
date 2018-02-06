/**
 *
 * @author xekid78
 *
 */
public class Fizzbuzz {

	public static void main(String[] args) {
		String output;
        for (int i = 1; i <= 15; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                output = i + ": FizzBuzz";
            } else if (i % 2 == 0) {
                output = i + ": Fizz";
            } else if (i % 3 == 0) {
                output = i + ": Buzz";
            } else {
                output = String.valueOf(i);
            }
            System.out.println(output);
        }

	}

}
