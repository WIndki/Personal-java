package 实验改.实验1;

import java.util.Scanner;

public class 学生类 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生的姓名：");
        String name = sc.next();
        System.out.println("请输入学生的年龄：");
        int age = sc.nextInt();
        System.out.println("请输入学生的性别：");
        String sex = sc.next();
        System.out.println("请输入学生的专业");
        String major = sc.next();
        System.out.println("请输入学生的生日");
        String birthday = sc.next();
        Student student = new Student(name,age,sex,major,birthday);
        System.out.println(student.getInformation());
    }
}

class Student {
    private String name;
    private int age;
    private String sex;
    private String major;
    private String birthday;

    public Student(String name, int age, String sex, String major, String birthday) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.major = major;
        this.birthday = birthday;
    }

    public int  getAge() {
        return age;
    }

    public String getInformation(){
        return "subject："+major+"name："+name+"age："+age+"sex："+"birthday："+birthday;
    }
}