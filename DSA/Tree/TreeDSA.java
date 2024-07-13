public class TreeDSA {

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class Tree {
        static int idx = -1;

        // Method to build a binary tree from an array representation
        public static Node buildTree(int[] nodes) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        // Preorder traversal: root -> left -> right
        public static void preorder(Node root) {
            if (root == null) {
                return;
            }
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }

        // Inorder traversal: left -> root -> right
        public static void inorder(Node root) {
            if (root == null) {
                return;
            }
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }

        // Postorder traversal: left -> right -> root
        public static void postorder(Node root) {
            if (root == null) {
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
    }

    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, 6, -1, -1, -1, 5, -1, -1, 3, -1, 8, -1, -1};

        Tree tree = new Tree();
        Node root = tree.buildTree(nodes);

        System.out.println("PreOrder Traversal:");
        tree.preorder(root);
        System.out.println();

        System.out.println("InOrder Traversal:");
        tree.inorder(root);
        System.out.println();

        System.out.println("PostOrder Traversal:");
        tree.postorder(root);
        System.out.println();
    }
}
