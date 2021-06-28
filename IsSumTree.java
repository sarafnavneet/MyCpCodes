class Solution
{
    public class IsSumClass{
            boolean isSumTree;
            int data;

            IsSumClass(boolean isSumTree, int data){
                this.data = data;
                this.isSumTree = isSumTree;
            }
        
        }

        public IsSumClass isSumTree2(Node root){
            if(root == null){
                return new IsSumClass(true,0);
            }
            
            if(root.left == null && root.right==null){
                return new IsSumClass(true,root.data);
            }
            
            

            IsSumClass lt = isSumTree2(root.left);
            IsSumClass rt = isSumTree2(root.right);

            IsSumClass mp = new IsSumClass(false,0);
            if(lt.isSumTree && rt.isSumTree && (root.data == lt.data+rt.data)){
                mp.isSumTree = true;
                mp.data = root.data+lt.data+rt.data;
            }
         
            
            return mp;

        }
        
	boolean isSumTree(Node root)
	{
       IsSumClass mC = isSumTree2(root);
       return mC.isSumTree;
	}
	
	
}
