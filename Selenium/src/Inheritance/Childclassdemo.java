package Inheritance;

public class Childclassdemo extends Parentdemo{

String name ="QAClickAcademy";


public Childclassdemo()
{
//super();   // this should be always be at first line
System.out.println("child class construtor");

}
public void getStringdata()
{
	System.out.println(super.name);
System.out.println(name);

}


public void getData()
{
//super.getData();								//Overriding - Same method in parent class - getdata()
System.out.println("I am in child class");
}
public static void main(String[] args) {
// TODO Auto-generated method stub

Childclassdemo cd = new Childclassdemo();
//Parentdemo PD=new Parentdemo();
cd.getStringdata();
cd.getData();
}

}