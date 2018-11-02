class Animal
{
	public int age = 10;
	public void show(){
		System.out.println("show Animal");
	}
}

class Cat extends Animal
{
	public int age = 20;
	public void show(){
		System.out.println("show Cat");
	}

	public void playGame(){
		System.out.println("è����Ϸ");
	}
}

class Dog extends Animal
{
	public int age = 30; 
	public void show(){
		System.out.println("show Dog");
	}

	public void playGame(){
		System.out.println("������Ϸ");
	}
}

/**
	��̬�е�����ת������
*/
class DuoTaiDemo 
{
	public static void main(String[] args) 
	{
		Animal a = new Dog();//��������ָ���������

		a.show();//��Ա���������뿴��ߣ����п����  ��Ա���������뿴��ߣ����п��ұ�

		System.out.println(a.age);

        //Ҫ�������������ķ��������¸��������ø�ֵ
		a = new Cat();
		a.show();

		//Ҫ������������еķ�������Ҫ������������ת��
		//Cat c = (Cat) a ;
		//c.playGame();

		Dog d = (Dog) a ;//����ת�ͣ�������ת�ɹ������в��У�
		d.show();


	}
}
