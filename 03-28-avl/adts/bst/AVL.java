package adts.bst;

public class AVL<T extends Comparable<T>> implements BST<T> {

   class node {
      T data;
      node left = null;
      node right = null;
      int height = 1;

      node(T data) {
         this.data = data;
      }
   };

   private node root = null;
   private int count = 0;

   private int height(node n) {
      if (n == null) {
         return 0;
      }

      return n.height;
   }

   int max(int a, int b) {
      if (a > b) {
         return a;
      }
      return b;
   }

   private node insert(node root, T data) {
      if (root == null) {
         count++;
         node n = new node(data);
         return n;
      }

      // else

      // if (data < root->data)
      if (data.compareTo(root.data) < 0) {
         root.left = insert(root.left, data);
      } else {
         root.right = insert(root.right, data);
      }

      root.height = 1 + max(height(root.left), height(root.right));

      root = balance(root);

      return root;
   }

   private node balance(node root) {
      // BF: balance factor | factor de balanceo
      int rootBF = height(root.left) - height(root.right);
      if (rootBF == 2) {
         // desb izq-?
         int leftBF = height(root.left.left) - height(root.left.right);
         if (leftBF == 1) {
            // desb izq-izq
            root = rightRot(root);
         } else if (leftBF == -1) {
            // desb izq-der
            root = leftRightRot(root);
         }
      } else if (rootBF == -2) {
         // desb der-?
         int rightBF = height(root.right.left) - height(root.right.right);
         if (rightBF == 1) {
            // desb der-izq
            root = rightLeftRot(root);
         } else if (rightBF == -1) {
            // desb der-der
            root = leftRot(root);
         }
      }

      return root;
   }

   private node leftRot(node z) {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'leftRot'");
   }

   private node rightLeftRot(node z) {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'rightLeftRot'");
   }

   private node leftRightRot(node z) {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'leftRightRot'");
   }

   private node rightRot(node z) {

      node y = z.left;
      node y_right = y.right;

      y.right = z;
      z.left = y_right;

      z.height = 1 + max(height(z.left), height(z.right));
      y.height = 1 + max(height(y.left), height(y.right));

      return y;
   }

   @Override
   public void insert(T data) {
      this.root = insert(this.root, data);
   }

   @Override
   public void remove(T data) {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'remove'");
   }

   @Override
   public void printInOrder() {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'printInOrder'");
   }

   @Override
   public int size() {
      return this.count;
   }

   @Override
   public int height() {
      return height(this.root);
   }

}
