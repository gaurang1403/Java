package August_9;

import java.util.Stack;

public class StackEx {

	static void push(Stack s, int i) {
		
		s.push(i);
		
		System.out.println(i);
		System.out.println(s);
		
	}
	
	static void pop(Stack s) {
		Integer i = (Integer) s.pop();
		
		System.out.println(i);
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		Stack s  = new Stack();
		
		push(s, 10);
		push(s, 20);
		push(s, 30);
		push(s, 40);
		
		try {

			pop(s);
			pop(s);
			pop(s);
			pop(s);
			pop(s);
			
		} catch (Exception e) {
			System.out.println("No Data");
		}
	}
}
