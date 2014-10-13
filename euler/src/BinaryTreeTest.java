
public class BinaryTreeTest {

	/**
	 * @작성일         : 2014. 6. 23.
	 * @작성자         : HeoMinWook
	 * @Method 설명    :
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node A = new Node("A");
        Node B = new Node("B");
        Node C = new Node("C");
        Node D = new Node("D");
        Node E = new Node("E");
        Node F = new Node("F");
        Node G = new Node("G");
        Node H = new Node("H");
        Node I = new Node("I");
        
        A.setLeftNode(B);
        B.setLeftNode(C);
        B.setRightNode(D);
        C.setLeftNode(H);
         
        A.setRightNode(E);
        E.setLeftNode(F);
        E.setRightNode(G);
        G.setLeftNode(I);
        
     // 출력
        System.out.println("Preorder...");
        BinaryTree.preorderPrintTree(A);
        System.out.println("\n");
 
        System.out.println("Inorder...");
        BinaryTree.inorderPrintTree(A);
        System.out.println("\n");
         
        System.out.println("Postorder...");
        BinaryTree.postorderPrintTree(A);
        
	}

}
