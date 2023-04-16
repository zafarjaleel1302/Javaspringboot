#include <iostream>
class Parent {
public:
    int a;
    int b;
    int c;
    void show(){
        std::cout<<"this is plain show \n";
         }

    void show(int a,int b){
        std::cout<<"this is parameter show \n"<<a<<b;
    }  
    
    Parent(){
        std::cout<<"this is is Parent construnctor\n";
    }   

};

int main(){
    Parent p;
    p.show(10,20);
    

}