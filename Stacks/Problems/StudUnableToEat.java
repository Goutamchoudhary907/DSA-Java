import java.util.ArrayDeque;
import java.util.Queue;
public class StudUnableToEat {

    public static int countStudents(int[] students, int[] sandwiches) {
        int rejection=0;
        int sandwichIndex=0;
        Queue<Integer> q=new ArrayDeque<>();

        for(int i=0;i<students.length;i++) {
          q.add(students[i]);
        }

        while(q.size()>0 && rejection< q.size()) {
        if(sandwiches[sandwichIndex]==q.peek()) {
            sandwichIndex++;
            q.remove();
            rejection=0;
        }
        else {
            q.add(q.remove());
            rejection++;
        }
        }
        return q.size();
    }
        public int countStudents2(int[] students, int[] sandwiches) {
            int ones = 0;  
            int zeros = 0; 
            for(int stud : students){
                if(stud == 0) zeros++;
                else ones++;
            }
            
            for(int sandwich : sandwiches){
                if(sandwich == 0){       // if sandwich is of type0
                    if(zeros == 0){      // if no student want a type0 sandwich
                        return ones;
                    }
                    zeros--;
                }
                else{  // if sandwich is of type1
                    if(ones == 0){  // if no student want a type1 sandwich 
                        return zeros;
                    }
                    ones--;
                }
            }
            return 0;
        }
    
    public static void main(String[] args) {
        int [] students={1,1,1,0,0,1};
        int [] sandwiches={1,0,0,0,1,1};

        int n=countStudents(students, sandwiches);
        System.out.println(n);
     }
}
