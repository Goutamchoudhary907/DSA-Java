public class LabelinLoops {
    public static void main(String[] args) {
        
        outer: for(int i=1;i<20;i++)
        {
            System.out.println(i+"th interation");
          inner :for(int j=1; j<15;j++)
          {
            System.out.println("J=" +j);
            j++;
            if (j>=10) {
                break inner;
            }
          }
         if (i>=15) {
            break outer;

         }
          
        }
    }
}

/*
 * we can provide names or labels to loops for using break or continue on particular loop 
 */
