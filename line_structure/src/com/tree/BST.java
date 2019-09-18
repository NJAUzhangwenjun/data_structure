package com.tree;

/**
 * @author 张文军
 * @Description:
 * @Company:南京农业大学工学院
 * @version:1.0
 * @date 2019/9/61:26
 */
public class BST<E extends Comparable<E>> {
    private class Node {
        E e;
        Node left, right;

        public Node(E e) {
            this.e = e;
        }
    }

    private Node root;
    private int size;

    public BST() {
        this.root = null;
        this.size = 0;
    }

    /**
     * 添加节点
     *
     * @param e
     */
    public void add(E e) {
        root = add(root, e);
    }

    /**
     * 递归添加节点,返回插入后的新节点
     *
     * @param node
     * @param e
     */
    private Node add(Node node, E e) {
        /**
         * 递归结束条件
         */
        if (node == null) {
            return new Node(e);
        }
        /**
         * 递归调用
         */
        if (e.compareTo(node.e) < 0) {
            node.left = add(node.left, e);
        } else if (e.compareTo(node.e) > 0) {
            node.right = add(node.right, e);
        }
        return node;
    }

    /**
     * 时候包含某个节点
     *
     * @param e
     * @return
     */
    public boolean isContain(E e) {
        return isContain(root, e);
    }

    /**
     * 递归实现是否包含一个节点
     *
     * @param node
     * @param e
     * @return
     */
    private boolean isContain(Node node, E e) {
        /**
         * 结束条件
         */
        if (node == null) {
            return false;
        }
        if (node.e.compareTo(e) == 0) {
            return true;
        }
        /**
         * 递归
         */
        if (e.compareTo(node.e) < 0) {
            return isContain(node.left, e);
        } else {
            return isContain(node.right, e);
        }
    }

    /**
     * 前序遍历
     */
    public void preOrder() {
        preOrder(root);
    }

    private void preOrder(Node node) {
        /**
         * 递归终止条件
         */
        if (node == null) {
            return;
        }
        /**
         * 操作
         */
        System.out.println(node.e.toString());

        /**
         * 递归遍历
         */
        preOrder(node.left);
        preOrder(node.right);
    }

    /**
     * 中序遍历
     */
    public void inOrder() {
        inOrder(root);
    }

    private void inOrder(Node node) {
        /**
         * 递归终止条件
         */
        if (node == null) {
            return;
        }

        /**
         * 递归遍历
         */
        inOrder(node.left);
        /**
         * 操作
         */
        System.out.println(node.e.toString());
        inOrder(node.right);
    }

    /**
     * ////////////////////以下代码均为测试方便而写//////////////////////////
     */

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        generateBSTString(root, 0, builder);
        return builder.toString();
    }

    /**
     * 可视化树结构，用前序遍历的方法打印
     *
     * @param node    节点
     * @param depth   遍历深度
     * @param builder
     */
    private void generateBSTString(Node node, int depth, StringBuilder builder) {
        if (node == null) {
            builder.append(generateBSTDepthString(depth) + "null\n");
            return;
        }
        builder.append(generateBSTDepthString(depth) + node.e + " \n");
        generateBSTString(node.left, depth + 1, builder);
        generateBSTString(node.right, depth + 1, builder);
    }

    /**
     * 打印深度
     *
     * @param depth
     * @return
     */
    private String generateBSTDepthString(int depth) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            builder.append("——>");
        }
        return builder.toString();
    }

    /**
     * 测试
     *
     * @param args
     */
    public static void main(String[] args) {
        BST<Integer> bst = new BST<Integer>();
        int[] ints = {9, 4, 78, 21, 5, 7};
        for (int anInt : ints) {
            bst.add(anInt);
        }
        System.out.println("前序遍历 :");
        bst.preOrder();
        System.out.println("后序遍历 :");
        bst.inOrder();
        System.out.println("--------toString :---------");
        System.out.println(bst);

    }
}
