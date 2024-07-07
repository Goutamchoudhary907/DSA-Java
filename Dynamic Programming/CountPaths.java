import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CountPaths {
    public static int countPaths(List<List<String>> grid){
        return countPaths(0,0,grid,new HashMap<>());
    }

    public static int countPaths(int r, int c,List<List<String>> grid, HashMap<List<Integer>,Integer> mp){
        if(r==grid.size() || c==grid.get(0).size()){
            return 0;
        }

        if(grid.get(r).get(c)=="X"){
            return 0;
        }
        if(r==grid.size()-1 && c==grid.get(0).size()-1){      // last element
            return 1;
        }
      List<Integer> pos=List.of(r,c);
      if(mp.containsKey(pos)){
        return mp.get(pos);
      }
    
       int result= countPaths(r+1, c, grid,mp) + countPaths(r, c+1, grid,mp);
       mp.put(pos, result);
       return result;
    }
    public static void main(String[] args) {
        List<List<String>> grid=new ArrayList<>();

        ArrayList<String> l1=new ArrayList<>();
        l1.add("");
        l1.add("");
        l1.add("X");

        ArrayList<String> l2=new ArrayList<>();
        l2.add("");
        l2.add("");
        l2.add("");

        ArrayList<String> l3=new ArrayList<>();
        l3.add("");
        l3.add("");
        l3.add("");

        grid.add(l1);
        grid.add(l2);
        grid.add(l3);
        
        System.out.println(countPaths(grid));
    }
}
