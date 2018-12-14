package stack;

import java.util.Stack;

class EvaluatePostFix {

	public static void main(String[] args) {
		String postfix = "3 1 +";
		Integer value = evaluate(postfix);
		System.out.println(value);
	}

	public static Integer evaluate(String postfix) {

		Stack<Integer> s = new Stack<Integer>();

		char[] chars = postfix.toCharArray();
		System.out.println(chars);

		int N = chars.length;

		for (int i = 0; i < N; i++) {
			char ch = chars[i];

			if (isOperator(ch)) {

				switch (ch) {
				case '+':
					s.push(s.pop() + s.pop());
					break;
				case '*':
					s.push(s.pop() * s.pop());
					break;
				case '-':
					s.push(-s.pop() + s.pop());
					break;
				case '/':
					s.push(1 / s.pop() * s.pop());
					break;
				}
			} else if (Character.isDigit(ch)) {

				s.push(ch - '0');
			}
		}

		if (!s.isEmpty())
			return s.pop();
		else
			return 0;
	}

	private static boolean isOperator(char ch) {
		return ch == '*' || ch == '/' || ch == '+' || ch == '-';
	}
}