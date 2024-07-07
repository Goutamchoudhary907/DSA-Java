import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MaxpathSum {
    
    public static int maxPathSum(List<List<Integer>> grid){
     return maxPathSum(0, 0, grid, new HashMap<>());
    }
    public static int maxPathSum(int r, int c,List<List<Integer>> grid, HashMap<List<Integer>,Integer> mp){
        if(r==grid.size() || c==grid.get(0).size()){
            return 0;
        }
        if(r==grid.size()-1 && c==grid.get(0).size()-1){
            return grid.get(r).get(c);
        }
        List<Integer> pos=List.of(r,c);
        if(mp.containsKey(pos)){
            return mp.get(pos);
        }
        int result= grid.get(r).get(c) +Math.max(maxPathSum(r+1, c, grid,mp),maxPathSum(r, c+1, grid,mp));
        mp.put(pos,result);
        return result;
    }

    public static void main(String[] args) {
         List<List<Integer>> grid=new ArrayList<>();

        ArrayList<Integer> l1=new ArrayList<>();
        l1.add(1);
        l1.add(3);
        l1.add(12);

        ArrayList<Integer> l2=new ArrayList<>();
        l2.add(5);
        l2.add(6);
        l2.add(2);

        grid.add(l1);
        grid.add(l2);

        System.out.println(maxPathSum(grid));
    }
}
