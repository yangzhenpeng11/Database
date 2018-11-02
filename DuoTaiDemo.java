/*
	动物类
*/
class Animal
{
	public int age = 10;
	public void show(){
		System.out.println("show Animal");
	}
}
/*
	猫继承动物类
*/
class Cat extends Animal
{
	public int age = 20;
	public void show(){
		System.out.println("show Cat");
	}

	public void playGame(){
		System.out.println("猫玩游戏");
	}
}

class Dog extends Animal
{
	public int age = 30; 
	public void show(){
		System.out.println("show Dog");
	}

	public void playGame(){
		System.out.println("狗玩游戏");
	}
}

/**
	多态中的类型转换问题
*/
class DuoTaiDemo 
{
	public static void main(String[] args) 
	{
		Animal a = new Dog();//父类引用指向子类对象

		a.show();//成员变量：编译看左边，运行看左边  成员方法：编译看左边，运行看右边

		System.out.println(a.age);

        	//要想调用另外子类的方法，重新给父类引用赋值
		a = new Cat();
		a.show();

		//要想调用子类特有的方法，需要将父引用向下转型
		//Cat c = (Cat) a ;
		//c.playGame();

		Dog d = (Dog) a ;//向下转型，将引用转成狗看看行不行？
		d.show();


	}
}
