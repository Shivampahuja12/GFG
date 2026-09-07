class myQueue {
	
	// Initialize your data members
	Stack<Integer> s1 = new Stack<>();
	Stack<Integer> s2 = new Stack<>();
	
	void enqueue(int x) {
		// Implement enqueue operation
		while (!s2.isEmpty()) {
			s1.push(s2.pop());
		}
		s1.push(x);
		
	}
	
	void dequeue() {
		// Implement dequeue operation
		while (!s1.isEmpty()) {
			s2.push(s1.pop());
		}
		s2.pop();
	}
	
	int front() {
		// Implement front operation
		while (!s1.isEmpty()) {
			s2.push(s1.pop());
		}
		if (s2.size() == 0)
			return - 1;
		return s2.peek();
	}
	
	int size() {
		// Implement size operation
		while (!s1.isEmpty()) {
			s2.push(s1.pop());
		}
		return s2.size();
	}
}
