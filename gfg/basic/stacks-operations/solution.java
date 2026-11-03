class MyStack {
    // Define your stack
    Stack<Integer> st = new Stack<>();

    public void push(int x) {
        // code here
        st.push(x);
    }

    public void pop() {
        st.pop();
    }

        
    public int peek() {
        return st.peek();
    }
        

    public int getSize() {
        return st.size();
    }

    public boolean isEmpty() {
        return st.isEmpty();
    }
}