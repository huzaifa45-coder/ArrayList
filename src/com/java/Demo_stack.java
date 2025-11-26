public static class demoStack {
    int size =5;
    int [] s  =new int [size];
    int top =-1;
    int y;

    public void push (int x){
        if (top==size-1) {
            System.out.println("Stack Overflow");
        }
        {
            top++;
            s[top]=x;
            System.out.println(x+" pushed into stack");
        }

    }
    public void  pop (){
        if (top==-1){
            System.out.println("Stack Underflow");
        }

        int y= s[top];
        top--;
        System.out.println(y+" popped from stack");


    }
    void peep() {
        if (top == -1) {
            System.out.println("Stack is empty");
        }
        System.out.println("Top element is: " + s[top]);
    }

}

public static void main(String[] args) {
    demoStack d = new demoStack();
    d.push(100);
    d.push(200);
    d.push(300);
    d.push(400);
    d.pop();
    System.out.println("After popping one element:");
    d.peep();
//        d.pop();
//        d.pop();

}
