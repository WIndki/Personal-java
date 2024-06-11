package 实验改.实验2;

public class 家中的电视 {
    public static void main(String[] args) {
        TV haierTV = new TV();
        haierTV.setChannel(5);
        System.out.println("haierTV目前的频道是："+haierTV.getChannel());
        Family zhangSanFamily = new Family();
        zhangSanFamily.buyTV(haierTV);
        System.out.println("zhangSanFamily开始看电视节目");
        zhangSanFamily.seeTV();
        int m = 2;
        System.out.println("zhangSanFamily换到"+m+"频道");
        zhangSanFamily.remoteControl(m);
        System.out.println("haierTV目前的频道是："+haierTV.getChannel());
        System.out.println("zhangSanFamily在看电视节目");
        zhangSanFamily.seeTV();
    }
    
}


class TV {
    private int channel;
    public void setChannel(int c) {
        if(c>0)channel = c;
    }
    public int getChannel() {
        return channel;
    }
    public void showProgram() {
        switch(channel) {
            case 1:
                System.out.println("综合频道");
                break;
            case 2:
                System.out.println("经济频道");
                break;
            case 3:
                System.out.println("文艺频道");
                break;
            case 4:
                System.out.println("国际频道");
                break;
            case 5:
                System.out.println("体育频道");
                break;
            default:
                System.out.println("不能收看"+channel+"频道");
        }
    }
}

class Family {
    private TV homeTV;
    public void buyTV(TV tv) {
        homeTV = tv;
    }
    public void remoteControl(int c) {
        homeTV.setChannel(c);
    }
    public void seeTV() {
        System.out.print("当前频道是：");
        homeTV.showProgram();
    }
}

