#pragma once

#include "./priority_queue.cpp"
#include <assert.h>

template <class E, class P> class min_heap : public priority_queue<E, P> {
private:
  struct pair {
    E elem;
    P prio;

    pair(E elem) { this->elem = elem; }

    pair(E elem, P prio) {
      this->elem = elem;
      this->prio = prio;
    }
  };

  pair *arr;
  int arrSize;
  int count;

  int leftChild(int n) { return n * 2; }

  int rightChild(int n) { return n * 2 + 1; }

  int parent(int n) { return n / 2; }

  void siftUp(int pos) { assert(false); }
  void siftDown(int pos) { assert(false); }

  void resize(int newSize) {
    pair *oldArr = this->arr;
    this->arr = new pair[newSize];
    this->arrSize = newSize;

    for (int i = 1; i <= this->count; i++) {
      this->arr[i] = oldArr[i];
    }

    // delete oldArr
  }

public:
  min_heap(int expectedSize) {
    this->arr = new pair[expectedSize + 1];
    this->count = 0;
    this->arrSize = expectedSize + 1;
  }

  virtual bool isEmpty() override { return this->count == 0; }
  virtual int size() override { return this->count; }
  virtual void push(E elem, P prio) override {
    if (this->count > this->arrSize) {
      resize(this->count * 2);
    }

    pair p = new pair(elem, prio);
    this->count++;
    this->arr[this->count] = p;

    siftUp(this->count);
  }
  virtual E top() override {
    assert(!isEmpty());
    return this->arr[1].elem;
  }
  virtual E pop() override {
    assert(!isEmpty());
    E ret = this->arr[1].elem;

    this->arr[1] = this->arr[this->count];
    this->count--;
    siftDown(1);

    return ret;
  }
};
