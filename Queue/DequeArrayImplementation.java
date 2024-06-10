public class DequeArrayImplementation {
        public static class queue{
         int f=-1;
         int r=-1;
         int arr[] =new int[100];
         int size=0;
         int capacity;
         public queue() {
            this.capacity=arr.length;
         }
         public void add(int val) {
            if(r==arr.length-1) {
                System.out.println("Queue is full");
               return;
            }
            if(f==-1) { 
                f= r= 0;
              arr[0]=val;
            }
          else { 
            arr[++r]=val;
         }
         size++;
        }
        public void addFirst(int val) throws Exception {
            if(size==capacity) {
            throw new Exception("Queue is full !");
            } if(f==-1) {
              f=r=0;
            } else {
                f=(f-1+capacity) %capacity;
            }
            arr[f]=val;
            // r++;
            size++;
        }

        public void addLast(int val) throws Exception {
            if(size==capacity) {
                throw new Exception("Queue is full !");
            }
            if(f==-1) { 
                f=0;
                r=0;
            }
          else { 
            r = (r + 1) % capacity;
            }
            arr[r]=val;
            size++;
        }
         public int remove() {
            if(size==0) {
                System.out.println("Queue is empty");
                return Integer.MIN_VALUE;
            }
            f++;
            size--;
            return arr[f-1];
         }
    

        public int removeFirst() throws Exception {
            if(size==0) {
                throw new Exception("Queue is empty");
            }
            int removed=arr[f];
            f=(f+1) %capacity;
            size--;
            return removed;
        }

           public int removeLast() throws Exception{
            if(size==0) {
                throw new Exception("Queue is empty");
            }
            int removed=arr[f];
            r= (r+1) % capacity;
            size--;
            return removed;
           }
          
           public void removeAll(){
            f=r=-1;
            size=0;
           }
         public int peek() {
            if(size==0) {
                System.out.println("Queue is empty");
                return Integer.MIN_VALUE;
            }
            return arr[f];
         }
         public int peekFirst() {
            if(size==0) {
                System.out.println("Queue is empty");
                return Integer.MIN_VALUE;
            }
            return arr[f];
         }

    public int peekLast() {
            if(size==0) {
                System.out.println("Queue is empty");
                return Integer.MIN_VALUE;
            }
            return arr[r];
         }

         public boolean isEmpty() {
            if(size==0) return true;
            else return false;
         }
    
         public void display() {
            if(size==0) {
                System.out.println("Queue is empty");
                return;
            }
            else {
                int curr=f;
                for(int i=0;i<size;i++) {
                System.out.print(arr[curr] +" ");
                curr=(curr+1) %capacity;
                } 
                System.out.println();
            }
         }
        }
        public static void main(String[] args) throws Exception {
            queue q=new queue();
            q.display();
            q.addLast(1);
            q.addLast(2);
            q.addLast(3);
            q.addLast(4);
            q.addLast(5);
            
            q.display();
            q.addFirst(5);
            q.addFirst(6);
            q.display();
            q.removeFirst();
            q.display();
            q.removeLast();
            q.display();
        }
    }
    