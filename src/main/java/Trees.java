import java.util.HashMap;

class Trees {
    Node root;

    private HashMap<Integer, Integer> map;
    //private LinkedList<Node> queue;


    Trees() {
        map = new HashMap<Integer, Integer>();
        //queue = new LinkedList<Node>();
    }


    int verticalSum(int verticalNum, Node root) {
        iterateAll(root, 0);
        return map.getOrDefault(verticalNum, 0);
    }

    int maxWidth(Node root) {
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
                map.put(ind, node.data);
            } else {
                map.put(ind, val + node.data);
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


    boolean checkBST(Node root) {
        return checkBSTHelper(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }


    private boolean checkBSTHelper(Node node, int min, int max) {
        if (node == null)
            return true;

        if (node.data < min || node.data > max)
            return false;

        return checkBSTHelper(node.left, min, node.data - 1) && checkBSTHelper(node.right, node.data + 1, max);
    }


}
