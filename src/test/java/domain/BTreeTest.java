package domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class BTreeTest {

    @Test
    void test() {
        BTree bTree = new BTree();
        for (int i = 0; i < 30; i++) {
            bTree.add(util.Utility.random(50));
        }
        System.out.println(bTree); //toString
        try {
            System.out.println("Binary tree size: " + bTree.size()+"\nBinary tree height: " + bTree.height());
            int deletedItems = 0;
            System.out.println("\nBinary tree - contains an removed methods");
            for (int i = 0; i < 20; i++) {
                int value = util.Utility.random(50);
                System.out.println(
                        bTree.contains(value)
                        ?"The value ["+value+"] exists in the binary tree" +". Height: "+bTree.height(value)
                        :"The value ["+value+"]does not in the binary tree"
                );
                if(bTree.contains(value)){
                    bTree.remove(value);
                    deletedItems++;
                    System.out.println("The value ["+value+"] has been removed");
                }
            }
            System.out.println("Binary tree size: " + bTree.size()+"\nBinary tree height: " + bTree.height());
            System.out.println("Deleted items: "+deletedItems+"\n");
            System.out.println(bTree); //toString

        } catch (TreeException e) {
            throw new RuntimeException(e);
        }
    }


    void testHeight(){
        BTree bTree = new BTree();
        bTree.add(20); bTree.add(30); bTree.add(18); bTree.add(4); bTree.add(5);
        bTree.add(50); bTree.add(70);
        System.out.println(bTree); //toString
        System.out.println();
        try {
            System.out.println("Binary tree - height(20): " + bTree.height(20));
            System.out.println("Binary tree - height(30): " + bTree.height(30));
            System.out.println("Binary tree - height(18): " + bTree.height(18));
            System.out.println("Binary tree - height(4): " + bTree.height(4));
            System.out.println("Binary tree - height(5): " + bTree.height(5));
            System.out.println("Binary tree - height(50): " + bTree.height(50));
            System.out.println("Binary tree - height(70): " + bTree.height(70));
            System.out.println();
            System.out.println("Binary tree - height(): " + bTree.height());
        } catch (TreeException e) {
            throw new RuntimeException(e);
        }
    }
}