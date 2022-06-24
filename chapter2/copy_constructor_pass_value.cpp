#include <iostream>
using namespace std;

class A
{
private:
    int value;

public:
    A(int n) { value = n; }

    // A(A another) { value = another.value; }
    // 上面这一句会导致编译错误。形参another是传值参数，把形参复制到实参会调用复制构造函数，造成在复制构造函数内调用复制构造函数
    // 形成不会停止的递归调用从而导致栈溢出。

    // 正确写法如下（把传值参数改成常量引用）
    A(const A &another) { value = another.value; }
    void Print() { std::cout << value << std::endl; }
};

int main()
{
    A a = 10;
    A b = a;
    b.Print();

    cout << sizeof(A) << "\n" << endl;// 如果类型A不包含任何成员变量或者函数，那么size就是1个字节，空类型也必须在内存中占据一段声明信息

    system("pause");
    return 0;
}
