package com.bridgelabz;

import org.junit.jupiter.api.Test;

public class MyBinaryTreeTest {
    @Test
    public void given3Numbers_WhenAddedToBST_ShouldReturnSize3() {
        MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
        myBinaryTree.add(56);
        myBinaryTree.add(30);
        myBinaryTree.add(70);
    }
}
