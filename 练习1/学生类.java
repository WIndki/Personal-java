package 练习1;
import java.util.Scanner;

public class 学生类 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        collegeStudent[] cs = new collegeStudent[count];
        for(int i=0; i<count; i++) {
            cs[i] = new collegeStudent();
            cs[i].setId(sc.nextInt());
            cs[i].setscore(sc.nextInt(), sc.nextInt());
        }
        float javaavg = 0;
        float cavg = 0;
        for(int i=0; i<count; i++) {
            javaavg += cs[i].getJavascore();
            cavg += cs[i].getCscore();
        }
        javaavg /= count;
        cavg /= count;
        System.out.printf("java average:%.2f%n", javaavg);
        System.out.printf("c    average:%.2f%n", cavg);
        sc.close();
    }
}

class student {
    protected int id;
    
    public void setId(int id) {
        this.id = id;
    }
}

class collegeStudent extends student {
    private int javascore;
    private int cscore;

    public void setscore(int javascore, int cscore) {
        this.javascore = javascore;
        this.cscore = cscore;
    }

    public int getJavascore() {
        return javascore;
    }

    public int getCscore() {
        return cscore;
    }

    public void show() {
        System.out.println(id+" "+javascore+" "+cscore);
    }
}

