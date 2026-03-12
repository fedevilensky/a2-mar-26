#pragma once

#include "./list.cpp"

template <class T>
class linked_list : public list<T>
{
private:
   struct node
   {
      T data;
      node *next;
   };

   node *head = nullptr;
   int length = 0;

public:
   linked_list() {}

   virtual void add(T data) override
   {
      if (this->head == nullptr)
      {
         this->head = new node{};
         this->head->data = data;
         this->head->next = nullptr;
      }
      else
      {
         // rellenar
      }
      this->length++;
   }

   virtual void remove(T data) override
   {
   }

   virtual void removeAt(int pos) override
   {
   }

   virtual bool exists(T data) override
   {
      node *aux = this->head;
      while (aux != nullptr)
      {
         if (aux->data == data)
         {
            return true;
         }

         aux = aux->next;
      }

      return false;
   }

   virtual int getPos(T data) override
   {
   }

   virtual T get(int pos) override
   {
   }

   virtual bool isEmpty() override
   {
      return this->length == 0;
   }

   virtual int size() override
   {
      return this->length;
   }
};
