package stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ParenthesisCheck {

	static Map<Character, Character> map = new HashMap<Character, Character>();

	public static void createMap() {

		map.put('{', '}');
		map.put('(', ')');
		map.put('[', ']');
		map.put('<', '>');

	}

	public static boolean checkParenthesis(String str) {

		boolean checkParenthesis = false;

		if (str == null || str.isEmpty()) {
			checkParenthesis = false;
		} else {
			char[] c = str.toCharArray();
			Stack<Character> stack = new Stack<Character>();

			createMap();

			for (int i = 0; i < c.length; i++) {

				if (c[i] == '{' || c[i] == '(' || c[i] == '[' || c[i] == '<') {
					stack.push(c[i]);
				}

				if ((c[i] == '}' || c[i] == ')' || c[i] == ']' || c[i] == '>') && !stack.isEmpty()) {

					char popChar = stack.pop();
					char mapChar = map.get(popChar);
					if (c[i] == mapChar) {
						checkParenthesis = true;
					} else {

						checkParenthesis = false;
					}

				}
				
				checkParenthesis = false;

			}
			
		}
		return checkParenthesis;

	}

	public static void main(String[] args) {
		String s = "<>>()";
		System.out.println("Parenthesis check for string : " + s + " is : " + checkParenthesis(s));

	}

}
