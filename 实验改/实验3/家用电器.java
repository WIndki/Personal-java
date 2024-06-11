package 实验改.实验3;

public class 家用电器 {
        public static void main(String[] args) {
            电器 电视 = new 电视机("海尔");
            电器 空调 = new 空调("美的");
            电器 微波炉 = new 微波炉("松下");
            电视.打开();
            System.out.println(电视.工作状态());
            电视.工作多久了();
            电视.关闭();
            空调.打开();
            System.out.println(空调.工作状态());
            空调.工作多久了();
            空调.关闭();
            微波炉.打开();
            System.out.println(微波炉.工作状态());
            微波炉.工作多久了();
            微波炉.关闭();
            
        }
}

abstract class 电器 {
    protected String name;
    public abstract String 工作状态();
    public abstract void 打开();
    public abstract void 工作多久了();
    public abstract void 关闭();
}

class 电视机 extends 电器 {
    public 电视机(String name) {
        this.name = name;
    }
    public String 工作状态() {
        return name+"电视机正在播放节目";
    }
    public void 打开() {
        System.out.println(name+"电视机已打开");
    }
    public void 工作多久了() {
        System.out.println(name+"电视机工作太久需要关闭！");
    }
    public void 关闭() {
        System.out.println(name+"电视机已关闭");
    }
}

class 空调 extends 电器 {
    public 空调(String name) {
        this.name = name;
    }
    public String 工作状态() {
        return "空调正在制冷";
    }
    public void 打开() {
        System.out.println(name+"空调已打开");
    }
    public void 工作多久了() {
        System.out.println(name+"空调工作太久需要关闭！");
    }
    public void 关闭() {
        System.out.println(name+"空调已关闭");
    }
}

class 微波炉 extends 电器 {
    public 微波炉(String name) {
        this.name = name;
    }
    public String 工作状态() {
        return "微波炉正在加热食物";
    }
    public void 打开() {
        System.out.println(name+"微波炉已打开");
    }
    public void 工作多久了() {
        System.out.println(name+"微波炉工作太久需要关闭！");
    }
    public void 关闭() {
        System.out.println(name+"微波炉已关闭");
    }
}
