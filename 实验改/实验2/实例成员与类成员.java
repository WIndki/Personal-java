package 实验改.实验2;

public class 实例成员与类成员 {
    public static void main(String args[]) {
        A.b = 100; // 通过类名操作类变量 b,并赋值 100
        A.inputB(); // 通过类名调用方法 inputB()

        A cat = new A();
        A dog = new A();

        cat.setA(200); // cat 调用方法 setA(int a)将 cat 的成员 a 的值设置为 200
        cat.setB(400); // cat 调用方法 setB(int b)将 cat 的成员 b 的值设置为 400

        dog.setA(150); // dog 调用方法 setA(int a)将 dog 的成员 a 的值设置为 150
        dog.setB(300); // dog 调用方法 setB(int b)将 dog 的成员 b 的值设置为 300

        cat.inputA(); // cat 调用 inputA()
        cat.inputB(); // cat 调用 inputB()

        dog.inputA(); // dog 调用 inputA()
        dog.inputB(); // dog 调用 inputB()
    }
}

class A {
    float a; // 声明一个 float 型实例变量 a
    static float b; // 声明一个 float 型类变量 b,即 static 变量 b

    void setA(float a) {
        this.a = a; // 将参数 a 的值赋值给成员变量 a
    }

    void setB(float b) {
        A.b = b; // 将参数 b 的值赋值给成员变量 b
    }

    float getA() {
        return a;
    }

    float getB() {
        return b;
    }

    void inputA() {
        System.out.println(a);
    }

    static void inputB() {
        System.out.println(b);
    }
}