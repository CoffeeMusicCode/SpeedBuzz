
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi " + args[0]);
		System.out.println();
		for (int i = 1; i < 100; i++) {
			boolean fizzbuzz = false;
			if (i % 3 == 0) {
				System.out.print("Fizz");
				fizzbuzz = true;
			}
			if (i % 5 == 0) {
				System.out.print("Buzz");
				fizzbuzz = true;
			}
			if (fizzbuzz) {
				System.out.println();
				fizzbuzz = false;
			} else {
				System.out.println(String.valueOf(i));
			}
		}
	}

}
