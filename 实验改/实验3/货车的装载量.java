package 实验改.实验3;

public class 货车的装载量 {
    public static void main(String args[]) {
        ComputeWeight[] goods = new ComputeWeight[650]; // 650 items
        for (int i = 0; i < goods.length; i++) {
            if (i % 3 == 0)
                goods[i] = new Television();
            else if (i % 3 == 1)
                goods[i] = new Computer();
            else if (i % 3 == 2)
                goods[i] = new WashMachine();
        }
        Truck truck = new Truck(goods);
        System.out.printf("\n 货车装载的货物重量：%-8.5fkg\n", truck.getTotalWeights());

        goods = new ComputeWeight[68]; // 68 items
        for (int i = 0; i < goods.length; i++) {
            if (i % 2 == 0)
                goods[i] = new Television();
            else
                goods[i] = new WashMachine();
        }
        truck.setGoods(goods);
        System.out.printf("\n 货车装载的货物重量：%-8.5fkg\n", truck.getTotalWeights());
    }
}

interface ComputeWeight {
    double computeWeight();
}

class Television implements ComputeWeight {
    public double computeWeight() {
        return 5.0;
    }
}

class Computer implements ComputeWeight {
    public double computeWeight() {
        return 20.0;
    }
}

class WashMachine implements ComputeWeight {
    public double computeWeight() {
        return 50.0;
    }
}

class Truck {
    ComputeWeight[] goods;
    double totalWeights = 0;

    Truck(ComputeWeight[] goods) {
        this.goods = goods;
    }

    public void setGoods(ComputeWeight[] goods) {
        this.goods = goods;
    }

    public double getTotalWeights() {
        totalWeights = 0;
        for (ComputeWeight good : goods) {
            totalWeights += good.computeWeight();
        }
        return totalWeights;
    }
}