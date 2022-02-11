public class PossibleNumberOfBinaryTree{
   
    public static class Node{
        int data;
        Node left;
        Node right;
       
        public Node(int data){
            this.data  = data;
            this.left = null;
            this.right = null;
        }
    }
   
    public Node root;
   
    public PossibleNumberOfBinaryTree(){
        root = null;
    }
   
    public int factorial(int num){
        int fact = 1;
        if(num == 0)
            return 1;
        else{
            while(num > 1){
                fact = fact * num;
                num --;
            }
            return fact;
        }
    }
   
    public int catalanFormula(int key){
        int catalanNumber = factorial(2*key) / (factorial(key) * factorial(key + 1));
        return catalanNumber;
    }
   
    public static void main(String args[]){
        PossibleNumberOfBinaryTree bt = new PossibleNumberOfBinaryTree();
        System.out.println("Total number of possible binary search tree: " + bt.catalanFormula(5));
    }
}

