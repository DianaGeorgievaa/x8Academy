package datastructures;

import java.util.Stack;

public class Brackets {

	public boolean areCorrectBrackets(String input) {
		Stack<Character> brackets = new Stack<Character>();

		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == '(' || input.charAt(i) == '[' || input.charAt(i) == '{' || input.charAt(i) == '<') {
				brackets.push(input.charAt(i));
			} else if (input.charAt(i) == ')' || input.charAt(i) == ']' || input.charAt(i) == '}'
					|| input.charAt(i) == '>') {

				if (brackets.isEmpty()) {
					return false;
				}
				char top = brackets.peek();
				if (isCurrentBracketValid(top, input.charAt(i))) {
					brackets.pop();
				}
			}
		}
		return brackets.isEmpty();
	}

	private boolean isCurrentBracketValid(char top, char bracket) {
		switch (bracket) {
		case ')':
			if (top != '(')
				return false;
			break;
		case ']':
			if (top != '[')
				return false;
			break;
		case '}':
			if (top != '{')
				return false;
			break;
		case '>':
			if (top != '<')
				return false;
			break;
		}
		return true;
	}

	public static void main(String args[]) {
	}
}
