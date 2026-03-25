#include "adts/bst/avl.cpp"
#include <iostream>
#include <string>

int main() {

  bst<std::string> *tree = new avl<std::string>();

  std::string strIn = "";

  while (strIn != "exit") {
    std::cout << "write \"exit\" to stop" << " the program" << std::endl;

    std::cin >> strIn;

    if (strIn != "exit") {

      tree->insert(strIn);

      std::cout << "Tree size is " << tree->size() << "\nTree height is "
                << tree->height() << std::endl;
    }
  }

  return 0;
}
