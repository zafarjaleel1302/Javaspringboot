
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
    virtual void show(){
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
 
   Parent *p;
   Child c;
   p=&c;
   p->show();
  
}