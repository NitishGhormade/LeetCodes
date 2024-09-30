class CustomStack {
    int[] st;
    int top;
    int len;

    public CustomStack(int maxSize) {
        st = new int[maxSize];
        top = -1; 
        len = maxSize;   
    }
    
    public void push(int x) {
        if(top < len - 1){
            top++;
            st[top] = x;
        }
    }
    
    public int pop() {
        if(top == -1){
            return -1;
        }
        else{
            int ele = st[top];
            top--;
            return ele;
        }
    }
    
    public void increment(int k, int val) {
        int end = (top >= k - 1)? k - 1 : top;

        for(int i = 0;i <= end;i++){
            st[i] += val;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */