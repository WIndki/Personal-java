package 实验4;

public class 内容3公司支出薪水 {
    public static void main(String arg[]){
        Employee[] employee=new Employee[29]; //公司有29名雇员
        for(int i=0;i<employee.length;i++){      //雇员分成三类
            if(i%3==0)
                employee[i]=new WeekWorker();
            if(i%3==1)
                employee[i]=new MonthWorker(); 
            if(i%3==2)
                employee[i]=new YearWorker();
        }
        Company company=new Company(employee);
        System.out.println("公司薪水总额："+company.salaiesPay()+"元");
    }
}

abstract class Employee{
	public abstract double earnings();
}
class YearWorker extends Employee{
	public double earnings(){
        return 12000;
    } //重写earnings（）方法
}

class MonthWorker extends Employee{
	public double earnings(){
        return 2300;
    } //重写earnings（）方法	}
}

class WeekWorker extends Employee{
	public double earnings(){
        return 600;
    } //重写earnings（）方法	}
}

class Company{
	Employee[] employee;
	double salaries=0;
	public Company(Employee[] employee){
		this.employee=employee;
	}
	public double salaiesPay(){
		salaries=0;
		for(Employee worker : employee){
            if (worker instanceof WeekWorker) {
                salaries += worker.earnings() * 52;
            } else if (worker instanceof MonthWorker) {
                salaries += worker.earnings() * 12;
            } else if (worker instanceof YearWorker) {
                salaries += worker.earnings();     
            }
        }//计算salaries
        return salaries;
	}
}

