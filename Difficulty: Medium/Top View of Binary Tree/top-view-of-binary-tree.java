/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/
class Solution {
    
    class Pair {
        Node node;
        int hd; // horizontal distance
        Pair(Node node, int hd){
            this.node = node;
            this.hd = hd;
        }
    }
    
    public ArrayList<Integer> topView(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        if (root == null) return list;
        Map<Integer, Integer> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<Pair>();
        q.add(new Pair(root, 0));
        while (!q.isEmpty()){
            Pair p = q.poll();
            Node node = p.node;
            int hd = p.hd;
            
            // If horizontal distance is seen for the first time, store it
            if (!map.containsKey(hd)) {
                map.put(hd, node.data);
            }
            
            // Add left and right children with updated horizontal distances
            if (node.left != null) q.add(new Pair(node.left, hd - 1));
            if (node.right != null) q.add(new Pair(node.right, hd + 1));
        }
        
        // add map values to list
        for (int value : map.values()) {
            list.add(value);
        }

        return list;
    }
}