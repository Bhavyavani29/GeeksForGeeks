class myStack {
    // Define your stack
    ArrayList<Integer> al = new ArrayList<>();
    
    public void push(int x) {
        // insert x into stack
        al.add(x);
    }

    public void pop() {
        // remove top ele from stack
        al.remove(al.size() - 1);
    }

    public int peek() {
        // return top of stack
        return al.get(al.size() - 1);
    }

    public int getSize() {
        // return current size of stack
        return al.size();
    }

    public boolean isEmpty() {
        // check whether stack is empty
        return al.size() == 0;
    }
}
