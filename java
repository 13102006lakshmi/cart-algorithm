class CART {

    static class Node {
        String value;
        Node left, right;

        Node(String value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {

        // Creating a simple CART decision tree
        Node root = new Node("Age > 30");

        root.left = new Node("Buy = No");
        root.right = new Node("Income > 50000");

        root.right.left = new Node("Buy = No");
        root.right.right = new Node("Buy = Yes");

        System.out.println("CART Decision Tree");
        System.out.println("------------------");

        System.out.println(root.value);
        System.out.println("  |-- No  --> " + root.left.value);
        System.out.println("  |-- Yes --> " + root.right.value);
        System.out.println("              |-- No  --> " + root.right.left.value);
        System.out.println("              |-- Yes --> " + root.right.right.value);
    }
}
