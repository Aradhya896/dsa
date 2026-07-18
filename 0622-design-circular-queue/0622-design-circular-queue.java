class MyCircularQueue {
int arr[];
int s;
int c;
int front;
int rear;
    public MyCircularQueue(int k) {
        arr=new int[k];
        s=k;
       front=0;
       rear=-1;
        c=0;
    }
    public boolean enQueue(int value) {
         if(isFull()) return false;
        
        rear=(rear + 1) % s;
        arr[rear]=value;
        c++;
        return true;
    }
    
    
    public boolean deQueue() {
        if(isEmpty()) return false;
        
       
        front=(front+1) % s;
        c--;
            return true;
        }
    

    
    public int Front() {
        if(isEmpty()) return -1;
        return arr[front];
    }
    
    public int Rear() {
        if(isEmpty()) return -1;
        return arr[rear];
    
    }
    
    public boolean isEmpty() {
        return c==0;
    }
    
    public boolean isFull() {
        return c==s;
    }}


