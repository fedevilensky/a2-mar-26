#pragma once

template <class T> class iterator {
  virtual bool hasNext() = 0;
  virtual T next() = 0;
};

template <class T> class iterable {
  virtual iterator<T> *iterator() = 0;
};
