#include <iostream>
class Parent
{
    public:
    int a;
    int b;
    Parent(){
     std::cout<<"This is constructor of Parent \n";
    }
    Parent (int a, int b){
        std:: cout << " this is constructor of Parent with Parameter \n";
    }
    void show(){
        std::cout<<"this is Parent show function \n";
    }
};

class Child : public Parent
{
    public:
    Child(){
        std::cout<<"this is the child constructor \n";
               
    }
    Child(int a,int b){
        std::cout<<"this is the child construnctor with Paremeter \n";
    }

    void show(){
        std::cout<<"this is the child show function \n";
    }
    
};

int main()
{
 
   // Parent P(10,20);
   //Child c;
   //Child c1(10,20);
   //Parent p;
   //p.show();
   Child c;
  c.show();
  
}