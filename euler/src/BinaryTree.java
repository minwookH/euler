
public class BinaryTree {

	//중위
	public static void preorderPrintTree(Node node){
		if(node == null)
            return;
         
        // 부모 노드 출력
        System.out.print(" " + node.getData());
         
        // 왼쪽 하위 트리 출력
        preorderPrintTree(node.getLeftNode());
         
        // 오른쪽 하위 트리 출력
        preorderPrintTree(node.getRightNode());
	}
	
	//전위
	public static void inorderPrintTree(Node node){
		if(node == null)
			return;
		
        // 왼쪽 하위 트리 출력
        inorderPrintTree(node.getLeftNode());
         
        // 부모 노드 출력
        System.out.print(" " + node.getData());
         
        // 오른쪽 하위 트리 출력
        inorderPrintTree(node.getRightNode());
	}
	
	//후위
	public static void postorderPrintTree(Node node){
		if(node == null)
			return;
		
		// 왼쪽 하위 트리 출력
        postorderPrintTree(node.getLeftNode());
         
        // 오른쪽 하위 트리 출력
        postorderPrintTree(node.getRightNode());
         
        // 부모 노드 출력
        System.out.print(" " + node.getData());
	}
}
