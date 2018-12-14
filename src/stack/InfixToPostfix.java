package stack;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class InfixToPostfix {

	static Stack<Character> operators = new Stack<Character>();
	static Map<Character, Integer> map = new HashMap<Character, Integer>();

	public static void main(String argv[]) throws IOException {
		String infix;

		BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("\nEnter the algebraic expression in infix: ");
		infix = keyboard.readLine();
		System.out.println("The expression in postfix is:" + toPostfix(infix));

	}

	private static String toPostfix(String infix)

	{
		char symbol;
		String postfix = "";
		createPrecedenceMap();
		for (int i = 0; i < infix.length(); i++)

		{
			symbol = infix.charAt(i);

			if (Character.isLetter(symbol) || Character.isDigit(symbol))
				postfix = postfix + symbol;
			else if (symbol == '(')
			{
				operators.push(symbol);
			} else if (symbol == ')')

			{
				while (operators.peek() != '(') {
					postfix = postfix + operators.pop();
				}
				operators.pop();
			}
			else
			{

				while (!operators.isEmpty() && !(operators.peek() == '(')
						&& map.get(symbol) <= map.get(operators.peek()))
					postfix = postfix + operators.pop();

				operators.push(symbol);
			}
			System.out.println("PostFix : " + postfix);
			System.out.println("Stack : " + operators);
		}
		while (!operators.isEmpty())
			postfix = postfix + operators.pop();

		return postfix;
	}

	public static void createPrecedenceMap() {
		map.put('+', 1);
		map.put('-', 1);
		map.put('*', 2);
		map.put('/', 2);
		map.put('%', 2);
	}

}