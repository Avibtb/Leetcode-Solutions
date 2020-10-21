import java.util.*;

class Solution {
    public Node cloneGraph(Node node) {
        if (node == null) return null;
        ArrayList<Node> frontier = new ArrayList<Node>();
        frontier.add(node);
        HashMap<Integer, Node> created = new HashMap<Integer, Node>();
        Node ans = new Node(node.val);
        ArrayList<Node> cons = new ArrayList<Node>();
        cons.add(ans);
        created.put(ans.val, ans);
        while (!frontier.isEmpty()){
            Node s = frontier.remove(frontier.size()-1);
            Node t = cons.remove(cons.size()-1);
            for ( Node x: s.neighbors){
                if (created.containsKey(x.val)){
                    t.neighbors.add(created.get(x.val));
                    continue;
                }
                Node a = new Node(x.val);
                t.neighbors.add(a);
                frontier.add(x);
                cons.add(a);
                created.put(x.val, a);
            }
        }
        return ans;
    }
}