import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public  class binaryTree {

    private TreeNode root;

    private class TreeNode {
        private TreeNode left;
        private TreeNode right;
        private int data;

        public TreeNode(int data) {
            this.data = data;
        }
    }

    public void createBinaryTree() {
        TreeNode first = new TreeNode(5);
        TreeNode second = new TreeNode(10);
        TreeNode third = new TreeNode(15);
        TreeNode fourth = new TreeNode(20);

        root = first;
        first.left=second;
        first.right=third;

        second.left=fourth;
    }


    public void preOrder(TreeNode root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    // Iterative Pre-order
    public void preOrderIterative(TreeNode root) {
        if (root == null) return;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            System.out.print(node.data + " ");

            if (node.right != null) stack.push(node.right);
            if (node.left != null) stack.push(node.left);
        }
    }

    // Recursive In-order
    public void inOrder(TreeNode root) {
        if (root == null) return;
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    // Iterative In-order
    public void inOrderIterative(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;

        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            System.out.print(curr.data + " ");
            curr = curr.right;
        }
    }

    // Recursive Post-order
    public void postOrder(TreeNode root) {
        if (root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    // Iterative Post-order
    public void postOrderIterative(TreeNode root) {
        if (root == null) return;

        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        stack1.push(root);

        while (!stack1.isEmpty()) {
            TreeNode node = stack1.pop();
            stack2.push(node);

            if (node.left != null) stack1.push(node.left);
            if (node.right != null) stack1.push(node.right);
        }

        while (!stack2.isEmpty()) {
            System.out.print(stack2.pop().data + " ");
        }
    }

    public void levelOrder(TreeNode root) {
        if(root == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            System.out.print(temp.data + " ");
            if(temp.left != null) {
               queue.offer(temp.left);
            }
            if(temp.right != null) {
                queue.offer(temp.right);
             }
        }
    }

    public int findMax() {
        return findMax(root);
    }

    public int findMax(TreeNode root) {
        if(root == null) {
            return Integer.MIN_VALUE;
        }

        int result = root.data;
        int left = findMax(root.left);
        int right = findMax(root.right);
        if(left > result) 
            return left;
        if(right > result) 
            return right;

            return result;
        }

    public static void main(String[] args) {
        binaryTree bt = new binaryTree();
        bt.createBinaryTree();
        bt.preOrder(bt.root);
        bt.preOrderIterative(bt.root);
        bt.inOrder(bt.root);
        bt.inOrderIterative(bt.root);
        bt.postOrder(bt.root);
        bt.postOrder(bt.root);
        bt.levelOrder(bt.root);
        System.out.println(bt.findMax());
        
    }

}