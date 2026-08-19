class MinStack {
    Stack<Long>st;
    int min;
    public MinStack() {
        st = new Stack<>();
        min = -1;
    }
    public void push(int value) {
        if(st.isEmpty()){
            min = value;
        }
        if(value <= min){
            //formula = 2*c - p;
            int c = value;
            int p = min;
            st.push(2l*c - p);
            min = value;
        }else{
            st.push((long)value);  
        }
    }
    
    public void pop() {
        if(st.isEmpty()) return;
       if(st.peek() < min){
        // decode formula 2*c - peek;
        long decode = st.peek();
        int c = min;

        int prevmin = (int)(2l*c - decode); 
        min = prevmin;
       }
       st.pop();
    }
    
    public int top() {
        if(st.peek() < min){
        return min;
       }
       long x = st.peek();
       return (int)x;
    }
    
    public int getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */