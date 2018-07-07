import java.util.HashMap;

public class Trees {

    private HashMap<Integer, Integer> map;
    //private LinkedList<Node> queue;


    Trees() {
        map = new HashMap<Integer, Integer>();
        //queue = new LinkedList<Node>();
    }


    public int verticalSum(int verticalNum, Node root) {
        iterateAll(root, 0);
        return map.getOrDefault(verticalNum, 0);
    }

    public int maxWidth(Node root) {
        iterateDown(root, 0);
        int max = 1;

        for (int i = 0; i < map.size(); i++) {
            int curr = map.get(i);
            if (curr > max) max = curr;
        }

        return max;


    }


    private void iterateAll(Node node, int ind) {
        if (node != null) {
            Integer val = map.get(ind);
            if (val == null) {
                map.put(ind, node.value);
            } else {
                map.put(ind, val + node.value);
            }

            iterateAll(node.left, ind - 1);
            iterateAll(node.right, ind + 1);
        }
    }


    private void iterateDown(Node node, int ind) {
        if (node != null) {
            Integer val = map.get(ind);
            if (val == null) {
                map.put(ind, 1);
            } else {
                map.put(ind, val + 1);
            }

            iterateDown(node.left, ind + 1);
            iterateDown(node.right, ind + 1);
        }
    }

}
