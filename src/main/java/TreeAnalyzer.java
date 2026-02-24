import java.util.LinkedList;
import java.util.Queue;

public class TreeAnalyzer {

    static class TreeNode {
        int value;
        TreeNode left;
        TreeNode right;

        TreeNode(int value) {
            this.value = value;
        }
    }

    // ---------- Traversals ----------
    public static void preorder(TreeNode node) { /* TODO */ }

    public static void inorder(TreeNode node) { /* TODO */ }

    public static void postorder(TreeNode node) { /* TODO */ }

    public static void breadthFirst(TreeNode root) { /* TODO */ }

    // ---------- Structural ----------
    public static int countInternalNodes(TreeNode node) { return 0; /* TODO */ }

    public static boolean isFull(TreeNode node) { return false; /* TODO */ }

    // ---------- BST ----------
    public static TreeNode insertBST(TreeNode root, int value) { return root; /* TODO */ }

    public static boolean isBST(TreeNode root) { return false; /* TODO */ }

    // Optional: student sandbox
    public static void main(String[] args) { }
}