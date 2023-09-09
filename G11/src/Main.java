import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static class Tree {
        char data;
        Tree left;
        Tree right;

        Tree(char data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static Tree root = null;
    static List<Character> v = new ArrayList<>();

    static Tree create(Tree root, char letter) {
        if (root == null) {
            root = new Tree(letter);
            return root;
        }
        if (root.data > letter) {
            root.left = create(root.left, letter);
        }
        if (root.data < letter) {
            root.right = create(root.right, letter);
        }
        return root;
    }

    static void mass(Tree root) {
        if (root == null) {
            return;
        } else {
            mass(root.left);
            v.add(root.data);
            mass(root.right);
        }
    }

    static Tree balance(int n, int h) {
        if (n == h) {
            return null;
        } else {
            int b = (n + h) / 2;
            Tree root = new Tree(v.get(b));
            root.left = balance(n, b);
            root.right = balance(b + 1, h);
            return root;
        }
    }

    static void inTrav(Tree root) {
        if (root == null) {
            return;
        }
        inTrav(root.left);
        System.out.print(root.data + " ");
        inTrav(root.right);
    }

    static void preTrav(Tree root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preTrav(root.left);
        preTrav(root.right);
    }

    static void postTrav(Tree root) {
        if (root == null) {
            return;
        }
        postTrav(root.left);
        postTrav(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        for (int i = str.length() - 1; i >= 0; i--) {
            root = create(root, str.charAt(i));
        }
        mass(root);
        root = balance(0, v.size());
        inTrav(root);
        System.out.println();
        preTrav(root);
        System.out.println();
        postTrav(root);
    }
}
