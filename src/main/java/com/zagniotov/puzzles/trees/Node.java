package com.zagniotov.puzzles.trees;

final class Node {
    private final int value;
    private final Node leftChild;
    private final Node rightChild;

    Node(final int value, final Node leftChild, final Node rightChild) {
        this.value = value;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    boolean isLeaf() {
        return leftChild == null && rightChild == null;
    }

    public int getValue() {
        return value;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + getValue() +
                ", leftChild=" + getLeftChild() +
                ", rightChild=" + getRightChild() +
                '}';
    }
}