package stack;

public class BasicStackClient {

	public static void main(String[] args) {

		BasicStack s = new BasicStack(5);

		s.push(10);
		s.push(20);
		s.push(30);
		System.out.println(s);
		s.pop();
		System.out.println(s);

	}

}
