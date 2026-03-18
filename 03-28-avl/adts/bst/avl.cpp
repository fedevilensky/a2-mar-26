#pragma once

#include "bst.cpp"

template <class T>
class avl : public bst<T>
{
private:
   struct node
   {
      T data;
      node *left = nullptr;
      node *right = nullptr;
      int height = 1;
   };

   node *root = nullptr;
   int count = 0;

   int height(node *n)
   {
      if (n == nullptr)
      {
         return 0;
      }

      return n->height;
   }

   int max(int a, int b)
   {
      if (a > b)
      {
         return a;
      }
      return b;
   }

   node *insert(node *root, T data)
   {
      if (root == nullptr)
      {
         count++;
         node *n = new node;
         n->data = data;
         return n;
      }

      // else

      if (data < root->data)
      {
         root->left = insert(root->left, data);
      }
      else
      {
         root->right = insert(root->right, data);
      }

      root->height = 1 + max(height(root->left), height(root->right));

      root = balance(root);

      return root;
   }

   node *balance(node *root)
   {
      // BF: balance factor | factor de balanceo
      int rootBF = height(root->left) - height(root->right);
      if (rootBF == 2)
      {
         // desb izq-?
         int leftBF = height(root->left->left) - height(root->left->right);
         if (leftBF == 1)
         {
            // desb izq-izq
            root = rightRot(root);
         }
         else if (leftBF == -1)
         {
            // desb izq-der
            root = leftRightRot(root);
         }
      }
      else if (rootBF == -2)
      {
         // desb der-?
         int rightBF = height(root->right->left) - height(root->right->right);
         if (rightBF == 1)
         {
            // desb der-izq
            root = rightLeftRot(root);
         }
         else if (rightBF == -1)
         {
            // desb der-der
            root = leftRot(root);
         }
      }

      return root;
   }

   node *rightRot(node *z)
   {

      /*

             z
            / \
           y   T1
          / \
         x   T2

             y
            / \
           x   z
              / \
             T2  T1

      */

      node *y = z->left;
      node *y_right = y->right;

      y->right = z;
      z->left = y_right;

      z->height = 1 + max(height(z->left), height(z->right));
      y->height = 1 + max(height(y->left), height(y->right));

      return y;
   }

public:
   avl()
   {
      // this->root = nullptr;
      // this->count = 0;
   }

   virtual void insert(T data) override
   {
      this->root = insert(this->root, data);
   }
   virtual void remove(T data) override
   {
   }
   virtual void printInOrder() override
   {
   }
   virtual int size() override
   {
      return this->count;
   }
   virtual int height() override
   {
      return height(this->root);
   }
};
