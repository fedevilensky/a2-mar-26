#include "./adts/list/linked_list.cpp"
#include <string>
#include <iostream>

int main()
{

   list<std::string> *lStr = new linked_list<std::string>();
   std::cout << lStr->exists("hola") << std::endl;

   lStr->add("hola");

   std::cout << lStr->exists("hola") << std::endl;

   return 0;
}
