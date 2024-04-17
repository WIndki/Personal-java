package 实验4;

public class 内容2银行 {
    public static void main(String args[]){
	    int amount=8000;
	    ConstructionBank bank1=new ConstructionBank();
	    bank1.savedMoney=amount;
	    bank1.year=8.236;
	    bank1.setInterestRate(0.035);
	    double interest1=bank1.computerInterest();
	    BankOfHRB bank2=new BankOfHRB();
	    bank2.savedMoney=amount;
	    bank2.year=8.236;
	    bank2.setInterestRate(0.035);
	    double interest2=bank2.computerInterest();
	    System.out.printf("两个银行利息相差：%f元\n",interest2-interest1);
	    }
}

class Bank {
int savedMoney;
int year;
double interest;
double interestRate=0.29;
public double computerInterest(){
	     interest=year*interestRate*savedMoney;
	     return interest;
}
public void setInterestRate(double rate){
	   interestRate=rate;
}
}

class ConstructionBank extends Bank {
double year;
public double computerInterest(){
	  super.year=(int)year;
	  double r=year-(int)year;
	  int day=(int)(r*1000);
	  double yearInterest=super.computerInterest();//super调用隐藏的computerInterest()方法
	  double dayInterest=day*0.0001*savedMoney;
	  interest=yearInterest+dayInterest;
	  System.out.printf("%d元存在建设银行%d年零%d天的利息：%f元\n",savedMoney,super.year,day,interest);
	  return interest;
}
}
class BankOfHRB extends Bank{
	  double year;
	  public double computerInterest(){
		super.year=(int)year;
		double r=year-(int)year;
		int day=(int)(r*1000);
		double yearInterest=super.computerInterest();//super调用隐藏的computerInterest方法
		double dayInterest=day*0.00012*savedMoney;
		interest=yearInterest+dayInterest;
		System.out.printf("%d元存在哈尔滨银行%d年零%d天的利息：%f元\n",savedMoney,super.year,day,interest);
		return interest;
		}
}
