1class MinStack {
2    int arr[];
3    int l;
4    int top;
5    int min[];
6
7    public MinStack() {
8        this.l=20;
9        this.arr=new int[l];
10        this.min=new int[l];
11        this.top=-1;
12    }
13    
14    public void push(int val) {
15        if(top>=l-1){
16            l*=2;
17            arr=Arrays.copyOf(arr,l);
18            min=Arrays.copyOf(min,l);
19        }
20        top++;
21        arr[top]=val;
22        if (top == 0) {
23            min[top] = val;
24        } 
25        else {
26            min[top] = Math.min(val, min[top - 1]);
27        }
28        
29    }
30    
31    public void pop() {
32    if (top >= 0) { 
33        top--; 
34    }
35}
36    
37    public int top() {
38        return (top==-1)?-1:arr[top];
39        
40    }
41    
42    public int getMin() {
43       return (top == -1) ? -1 : min[top];
44    }
45}
46
47/**
48 * Your MinStack object will be instantiated and called as such:
49 * MinStack obj = new MinStack();
50 * obj.push(val);
51 * obj.pop();
52 * int param_3 = obj.top();
53 * int param_4 = obj.getMin();
54 */