import java.util.*;

class Animal{
    String name;
    double height;
    int weight;
    int speed;

    void show(){
        System.out.println("姓名:"+name+" 身高: "+height+" 體重: "+weight+" 速度:"+speed);
    }

    double distance(int x, double y){
        return this.speed*x*y;
    }

    int distance(int x){
        return this.speed*x;
    }
}

public class A1093376_0324_1{
    public static void main (String [] argv){
        Animal animal1, animal2, animal3, animal4;
        animal1 = new Animal();
        animal2 = new Animal();
        animal3 = new Animal();
        animal4 = new Animal();

        animal1.name="雪寶";
        animal1.height=1.1;
        animal1.weight=52;
        animal1.speed=100;
        animal1.show();
        int x1;
        double y1;
        System.out.print("請輸入"+animal1.name+"奔跑的時間(分鐘):");
        Scanner input = new Scanner(System.in);
        x1=input.nextInt();
        System.out.print("請輸入"+animal1.name+"的加速度:");
        y1=input.nextDouble();
        if(y1!=0){
            System.out.println(animal1.name+"奔跑的距離:"+animal1.distance(x1, y1));
        }else {
            System.out.println(animal1.name+"奔跑的距離:"+animal1.distance(x1));
        }

        animal2.name="驢子";
        animal2.height=1.5;
        animal2.weight=99;
        animal2.speed=200;
        animal2.show();
        int x2;
        double y2;
        System.out.print("請輸入"+animal2.name+"奔跑的時間(分鐘):");
        x2=input.nextInt();
        System.out.print("請輸入"+animal2.name+"的加速度:");
        y2=input.nextDouble();
        if(y2!=0){
            System.out.println(animal2.name+"奔跑的距離:"+animal2.distance(x2, y2));
        }else {
            System.out.println(animal2.name+"奔跑的距離:"+animal2.distance(x2));
        }

        animal3.name="安那";
        animal3.height=1.7;
        animal3.weight=48;
        animal3.speed=120;
        animal3.show();
        int x3;
        double y3;
        System.out.print("請輸入"+animal3.name+"奔跑的時間(分鐘):");
        x3=input.nextInt();
        System.out.print("請輸入"+animal3.name+"的加速度:");
        y3=input.nextDouble();
        if(y3!=0){
            System.out.println(animal3.name+"奔跑的距離:"+animal3.distance(x3, y3));
        }else {
            System.out.println(animal3.name+"奔跑的距離:"+animal3.distance(x3));
        }

        animal4.name="愛沙";
        animal4.height=1.7;
        animal4.weight=50;
        animal4.speed=120;
        animal4.show();
        int x4;
        double y4;
        System.out.print("請輸入"+animal4.name+"奔跑的時間(分鐘):");
        x4=input.nextInt();
        System.out.print("請輸入"+animal4.name+"的加速度:");
        y4=input.nextDouble();
        if(y4!=0){
            System.out.println(animal4.name+"奔跑的距離:"+animal4.distance(x4, y4));
        }else {
            System.out.println(animal4.name+"奔跑的距離:"+animal4.distance(x4));
        }
    }
}