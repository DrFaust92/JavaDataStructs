import org.junit.Test;

public class TreesTest {

    //      1
    //    2      3
    //  7   5   4    7
    //             9   8

    @Test
    public void verticalSum() {

        Node root = new Node(1);
        Node left = new Node(2);
        Node right = new Node(3);
        Node leftRight = new Node(5);
        Node leftLeft = new Node(7);
        Node rightRight = new Node(6);
        Node rightRightRight = new Node(8);
        Node rightRightLeft = new Node(9);

        root.left = left;
        root.right = right;
        left.right = leftRight;
        right.right = rightRight;
        rightRight.right = rightRightRight;
        rightRight.left = rightRightLeft;
        left.left = leftLeft;


        Trees tree = new Trees();
        int sum = tree.verticalSum(3, root);
        assert sum == 8;
    }

    @Test
    public void maxWidth() {


        //      1
        //    2      3
        //  7   5   4    7
        //             9   8


        Node root = new Node(1);
        Node left = new Node(2);
        Node right = new Node(3);
        Node rightLeft = new Node(4);
        Node leftRight = new Node(5);
        Node leftLeft = new Node(7);
        Node rightRight = new Node(6);
        Node rightRightRight = new Node(8);
        Node rightRightLeft = new Node(9);

        root.left = left;
        root.right = right;
        left.right = leftRight;
        right.right = rightRight;
        rightRight.right = rightRightRight;
        rightRight.left = rightRightLeft;
        left.left = leftLeft;
        right.left = rightLeft;

        Trees tree = new Trees();
        int sum = tree.maxWidth(root);
        assert sum == 4;

    }

    @Test
    public void checkBST() {
        Trees tree = new Trees();
        tree.root = new Node(4);
        tree.root.left = new Node(2);
        tree.root.right = new Node(5);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(3);

        boolean isBST = tree.checkBST(tree.root);

        assert isBST;

    }
}