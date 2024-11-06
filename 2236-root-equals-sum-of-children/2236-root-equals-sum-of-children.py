class tree:
    def __init__ (self, x):
        self.val = x;
        self.left = None
        self.right = None 
class Solution:
    def checkTree(self,root):
        if root.left and root.right and root.left.val + root.right.val == root.val:
            return True
        
        return False

        
        