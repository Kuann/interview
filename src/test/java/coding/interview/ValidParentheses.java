package coding.interview;

import java.util.Stack;

class ValidParentheses {
	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();
		
		for (char c: s.toCharArray()) {
			switch (c) {
			case ')':
				if (!stack.isEmpty() && stack.peek() == '(') {
					stack.pop();
				} else {
					stack.push(c);
				}
				break;
			case ']':
				if (!stack.isEmpty() && stack.peek() == '[') {
					stack.pop();
				} else {
					stack.push(c);
				}
				break;
			case '}':
				if (!stack.isEmpty() && stack.peek() == '{') {
					stack.pop();
				} else {
					stack.push(c);
				}
				break;
			default:
				stack.push(c);
				break;
			}
		}

		return stack.isEmpty();
	}
}