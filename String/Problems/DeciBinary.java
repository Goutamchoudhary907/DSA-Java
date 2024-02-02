public class DeciBinary {
    static int minPartitions(String n) {
            int max = -1;
            char[] c = n.toCharArray();
            for(int i=0;i<c.length;i++)
            {
                if(max < c[i]-'0')
                    max = c[i]-'0';
            }
            return max;
        }
    public static void main(String[] args) {
        String n="82734";
        System.out.println(minPartitions(n));
    }
    }

