package domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class BTreeTest {

    @Test
    void test() {
        BTree bTree = new BTree();
        for (int i = 0; i < 20; i++) {
            bTree.add(util.Utility.random(50));
        }
        System.out.println(bTree);
        try {
            System.out.println("BTree size: "+bTree.size());
        } catch (TreeException e) {
            throw new RuntimeException(e);
        }
    }
}