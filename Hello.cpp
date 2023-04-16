#include <iostream>

class A
{
public:
    A()
    {
        std::cout << "I am constructor of A \n";
    }
};
class B : public A
{
public:
    B()
    {
        std::cout << "I am constructoe of B \n";
    }
};
class D : public B
{
public:
    D()
    {
        std::cout << "I am construnctor of D\n";
    }
};
class E : public B
{
public:
    E()
    {
        std::cout << "I am construnctor of E \n";
    }
};
class H : public E, public D
{
public:
    H()
    {
        std::cout << "I am construnctor of H \n";
    }
};
class C : public A
{
public:
    C()
    {
        std::cout << "I am constructor of C \n";
    }
};
class F : public C
{
public:
    F()
    {
        std::cout << "I am construnctor of F\n";
    }
};
class G : public C
{
public:
    G()
    {
        std::cout << " I am construnctor of G \n";
    }
};
class I : public F, public G
{
public:
    I()
    {
        std::cout << "I am construnctor of I \n";
    }
};
class J : public H, public I
{
public:
    J()
    {
        std::cout << "I am construnctor of J\n";
    }
};
int main()
{

    J j;

    return 0;
}