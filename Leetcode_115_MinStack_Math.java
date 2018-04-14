class MinStack {
    Stack<Integer> stack;
    Integer min;

    /** initialize your data structure here. */    
    public MinStack() {
        stack = new Stack<Integer>();
    }
    
    public void push(int x) {
        if(stack.isEmpty()){
            stack.push(x);
            min = x;
        } else if(x<min) {
            stack.push((2*x)-min);
            min = x;
        } else stack.push(x);
    }
    
    public void pop() {
        if(!stack.isEmpty()){
            int temp = stack.pop();
            if(temp<min){
                min = ((2*min)-temp);
                }
            }
        }
    
    public int top() {
        if(!stack.isEmpty()){
            int temp = stack.peek();
            if(temp<min){
                return ((2*min)-temp);
            } 
            else return temp;
        }
        else return -1;
    }
    
    public int getMin() {
        if(!stack.isEmpty()) return min; else return -1;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */