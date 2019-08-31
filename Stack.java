
import java.util.Scanner;
//three operations:push,pop,peek

class stackClass{
    
    private int stack[];
    private int top;
    private int capacity;

    stackClass(int size){
        stack = new int [size];
        capacity=size;
        top=-1;
    }
    public boolean isFull(){

        return top == capacity-1;
    }

    public void push(int value){

        if(isFull()){
           
            System.out.println("Stack is full");
          
        }
        stack[++top]=value;
    }

    public int pop(){

        if(isempty()){
            System.out.println("Stack is empty nothing to pop");
          
        }
        System.out.println("Removed : "+stack[top]);
        return stack[top--];
        
    }
    public boolean isempty(){

        return top == -1;

    }
    public int peek(){
        if(!isempty()){
            return stack[top];
        }
        else
            return -1;
    }
    public void display(){
        for(int i=0;i<=top;i++){
            System.out.println(stack[i]);
        }
    }


    public static void main(String[] args) {
           stackClass sc=new stackClass(10);

           System.out.println("Menu:-1=push,2=pop,3=peek,4=display,5=exit");
           int ch,peeked,pushedNumber;
           Scanner s1=new Scanner(System.in);
           
           do{
            System.out.println("Enter your choice : ");
            ch=s1.nextInt();
                switch (ch) {
                    case 1:
                        System.out.println("Enter any number: ");
                        pushedNumber=s1.nextInt();
                        sc.push(pushedNumber);
                        break;
                    case 2:
                        sc.pop(); 
                        break;
                    case 3:
                        peeked = sc.peek(); 
                        System.out.println(peeked);
                        break;
                    case 4:
                        sc.display(); 
                        break;
                    default:
                       // System.out.println("break");
                        break;
                }
           }while (ch!=5);

           s1.close();
           System.exit(0);   

    }
}