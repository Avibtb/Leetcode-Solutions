class Solution {
    class Node {
      double val;
      String dest;  
      Node(double val,String dest) {
          this.val=val;
          this.dest=dest;
      }  
    }
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        double[] output = new double[queries.size()];
        Map<String,List<Node>> map = prepareGraph(equations,values);
        for(int i=0;i<queries.size();i++) {
            String src = queries.get(i).get(0);
            String dest = queries.get(i).get(1);
            if(map.containsKey(src)) {
                output[i] = dfs(map,src,dest,new HashSet<>());
            } 
            if(output[i]<=0.0) {
                output[i]=-1;
            }
        }
        return output;
    }
    
    private double dfs(Map<String,List<Node>> map,String src,String dest,Set<String> visited) {
        if(src.equals(dest)) {
            return 1.0;
        }
        if(visited.contains(src)) {
            return -1;
        }
        visited.add(src);
        double res = 1.0;
        for(Node node: map.get(src)) {
            res=node.val*dfs(map,node.dest,dest,visited);
            if(res>0){
                return res;
            }
        }
        return res;
    }
    
    private Map<String,List<Node>> prepareGraph(List<List<String>> equations, double[] values) {
        Map<String,List<Node>> map = new HashMap<>();
        for(int i=0;i<equations.size();i++) {
            String src = equations.get(i).get(0);
            String dest = equations.get(i).get(1);
            List<Node> list = map.getOrDefault(src,new ArrayList<>());
            list.add(new Node(values[i],dest));
            map.put(src,list);
            List<Node> list2 = map.getOrDefault(dest,new ArrayList<>());
            list2.add(new Node((1.0/values[i]),src));
            map.put(dest,list2);
        }
        return map;
    }
    
}