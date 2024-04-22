class A {
    void fA() {
      System.out.println("I am A!!");
    }
  }
class B {
    void fB() {
      System.out.println("I am B!!");
    }
  }
class C {
    void fC() {
      System.out.println("I am C!!!!");
    }
  }

  public class 内容2 {
  public static void main(String args[]) {
  System.out.println("你好，只需编译我");
  A a = new A();
  a.fA();
  B b = new B();
  b.fB();
  C c = new C();
  c.fC();
  }
  }
  