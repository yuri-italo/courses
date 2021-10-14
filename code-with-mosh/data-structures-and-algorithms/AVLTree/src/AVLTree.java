public class AVLTree {
    private class AVLNode {
       private int height;
       private int value;
       private AVLNode leftChild;
       private AVLNode rightChild;

        public AVLNode(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Value=" + this.value;
        }
    }

    private AVLNode root;

    public void insert(int value) {
        root = insert(root,value);
    }

    private AVLNode insert(AVLNode root, int value) {
        if (root == null)
            return new AVLNode(value);

        if (value < root.value)
            root.leftChild = insert(root.leftChild, value);
        else
            root.rightChild = insert(root.rightChild, value);

        root.height = Math.max(height(root.leftChild),height(root.rightChild)) + 1;

        balance(root);

        return root;
    }

    private void balance(AVLNode root) {
        if (isLeftHeavy(root)) {
            if (balanceFactor(root.leftChild) < 0)
                System.out.println("Left Rotate " + root.leftChild.value);
            System.out.println("Right Rotate " + root.value);
        }
        else if (isRightHeavy(root)) {
            if (balanceFactor(root.rightChild) > 0)
                System.out.println("Right Rotate " + root.rightChild.value);
            System.out.println("Left Rotate " + root.value);
        }
    }

    private boolean isLeftHeavy(AVLNode node) {
        return balanceFactor(node) > 1;
    }

    private boolean isRightHeavy(AVLNode node) {
        return balanceFactor(node) < -1;
    }

    private int balanceFactor(AVLNode node) {
        return (node == null) ? 0 : height(node.leftChild) - height(node.rightChild);
    }

    private int height(AVLNode node) {
        return (node == null) ? -1 : node.height;
    }
}