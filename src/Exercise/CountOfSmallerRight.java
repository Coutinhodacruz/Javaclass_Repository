package Exercise;


public class CountOfSmallerRight {


    public int size;
    public Node root;

     static class Node{
        int val;
        int sum;
        Node left;
        Node right;

        public Node (int v, int s){
            val = v;
            sum = s;
            left = null;
            right = null;
        }
    }
    public Node insert(int v){
        Node node = new Node(v, 0);
        if (root == null){
            root = node;
            return  root;
        }else {
            size++;
            return insertNode(root,node);
        }

    }
    public Node insertNode(Node r, Node n){
        if (n.val < r.val){
            r.sum++;
            if (r.left == null){
                r.left = n;
                return n;
            }else {
                return insertNode(r.left, n);
            }

        }else {
            n.sum++;
            if (r.right == null){
                r.right = n;
                return n;
            }else {
                return insertNode(r.right, n);
            }
        }

    }
    public void find(int v){
        Node r = root;
        while (r != null){
            if (r.val == v){
                return;
            }else if (r.val > v){
                r = r.right;
            }else {
                r = r.right;
            }
        }

    }

    public int[] getNewList(int[] arr){
        int[] a = new int[arr.length];
        for (int i = arr.length -1; i >= 0; i--) {
            Node n = insert(arr[i]);
            a[i] = n.sum;

        }

        return a;
    }

    public static void missing2(int[] arr, int n){
        int j = 1;
        for (int i = 0; i < n; i++) {
            if (i >= arr.length){
                System.out.println(j);
            } else if (arr[i] != j) {
                System.out.println(j);
                j = arr[i];
                n--;

            }
            j++;

        }

    }


}
