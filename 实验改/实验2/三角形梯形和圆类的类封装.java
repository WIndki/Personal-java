package 实验改.实验2;

public class 三角形梯形和圆类的类封装 {
    public static void main(String args[])
    { 
       double length,area;
       Circle circle;
       Trangle trangle;
       Lader lader;
       circle = new Circle(10); //创建对象circle。
       trangle = new Trangle(10,10,10);//创建对象trangle。
       lader = new Lader(5, 10, 5);//创建对象lader
       length = circle.getLength(); // circle调用方法返回周长并赋值给length
        System.out.println("圆的周长:"+length); 
       area = circle.getArea();// circle调用方法返回面积并赋值给area
        System.out.println("圆的面积:"+area); 
       length = trangle.getLength(); // trangle调用方法返回周长并赋值给length
        System.out.println("三角形的周长:"+length); 
       area = trangle.getArea(); // trangle调用方法返回面积并赋值给area
        System.out.println("三角形的面积:"+area); 
       area = lader.getArea(); // lader调用方法返回面积并赋值给area
        System.out.println("梯形的面积:"+area); 
       trangle.setABC(12, 34, 1); // trangle调用方法设置三个边，要求将三个边修改为12,34,1。
       area = trangle.getArea(); // trangle调用方法返回面积并赋值给area
        System.out.println("三角形的面积:"+area); 
       length = trangle.getLength(); // trangle调用方法返回周长并赋值给length
        System.out.println("三角形的周长:"+length);
        double r=10;
        System.out.println("修改circle的半径位"+r);
        circle.setRadius(r);
        area = circle.getArea(); // circle调用方法返回面积并赋值给area
        System.out.println("修改后圆的面积:"+area);
        length = circle.getLength(); // circle调用方法返回周长并赋值给length
        System.out.println("修改后圆的周长:"+length);
    }
}

class Trangle  
{  
   double sideA,sideB,sideC,area,length;
   boolean boo;
   public  Trangle(double a,double b,double c) 
   { 
    this.sideA = a; //参数a,b,c分别赋值给sideA,sideB,sideC
    this.sideB = b;
    this.sideC = c;
     if(a+b>c&&b+c>a&&a+c>b) //a,b,c构成三角形的条件表达式,两边之和大于第三边
     { 
       boo=true; //给boo赋值。
     }    
    else
     { 
        boo=false; //给boo赋值。
     }
   }
   public double getLength() 
   {   
        if(boo){
        length = sideA+sideB+sideC;
        return length; //方法体，要求计算出length的值并返回 
        }
        else
        { 
          System.out.println("不是一个三角形,不能计算周长");
          return 0;
        }
  }
   public double  getArea() 
   {  
      if(boo)
        { 
          double p=(sideA+sideB+sideC)/2.0;
          area=Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC)) ;
          return area;
        }
      else
        { 
          System.out.println("不是一个三角形,不能计算面积");
          return 0;
        }
   } 
   public void setABC(double a,double b,double c)
   { 
    this.sideA = a; //参数a,b,c分别赋值给sideA,sideB,sideC
    this.sideB = b;
    this.sideC = c;
     if(a+b>c&&b+c>a&&a+c>b) //a,b,c构成三角形的条件表达式,两边之和大于第三边
     { 
       boo=true; //给boo赋值。
     }    
    else
     { 
        boo=false; //给boo赋值。
     }
   }
}

class Lader 
{   
    double above,bottom,height,area; 
    Lader(double a,double b,double h)
    {
        this.above = a; //方法体，将参数a,b,c分别赋值给above,bottom,height
        this.bottom = b;
        this.height = h;
    }
    public double getArea()
    {
        area=(above+bottom)*height/2.0;
        return area;//方法体，,要求计算出area返回
    }
}

class Circle 
{  
    double radius,area,length;
    Circle(double r)
    { 
        this.radius = r;//方法体
    }
    public double getArea() 
    {  
       area = Math.PI*radius*radius; //方法体，要求计算出area返回
         return area;
    }
    public double getLength() 
    {  
       length = Math.PI*2*radius;//getArea方法体的代码,要求计算出length返回
         return length;
    }
    public void setRadius(double newRadius)
    {  
       radius=newRadius;
    }
    public double getRadius() 
    { 
        return radius;
    }
}
