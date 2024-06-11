package 实验改.实验1;
public class 儿童类{
    public static void main(String[] args) {
        Child[] children = new Child[3];
        children[0] = new Child("张三", "男", 10, "玩游戏");
        children[1] = new Child("李四", "女", 8, "画画");
        children[2] = new Child("王五", "男", 12, "踢足球");
        for (Child child : children) {
            child.displayData();
            System.out.println();
        }
    }
}
class Child {
    private String name;
    private String gender;
    private int age;
    private String hobby;
    private static int childCount;

    public Child(String name, String gender, int age, String hobby) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.hobby = hobby;
        childCount++;
    }

    public static int getChildCount() {
        return childCount;
    }

    public void displayData() {
        System.out.println("姓名: " + name);
        System.out.println("性别: " + gender);
        System.out.println("年龄: " + age);
        System.out.println("爱好: " + hobby);
    }
}
