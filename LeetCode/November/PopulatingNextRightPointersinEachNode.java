class Solution {
    public Node connect(Node root) {
        
        if(root==null) {
            return root;
        }
        
        Queue<Node> qu = new LinkedList<>();
        
        qu.offer(root);
        
        while(!qu.isEmpty()) {
            int size = qu.size();
            int counter = 0;
            
            while(counter<size) {
                
                Node temp = qu.remove();
                
                if(temp.left !=null) {
                    qu.offer(temp.left);
                }
                
                if(temp.right !=null) {
                    qu.offer(temp.right);
                }
                
                if(counter+1<size) {
                    temp.next = qu.peek();
                } else {
                    temp.next = null;
                }
                
                counter++;
                
            }            
        }
        
        return root;
        
        
    }
} 
