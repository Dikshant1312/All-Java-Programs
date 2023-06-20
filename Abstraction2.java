abstract class Shape{
abstract void draw();
}
class Rectangle extends Shape{
void draw(){System.out.println("Rec");}
}
class Circle extends Shape{
super();
void draw(){System.out.println("Cir");}
}
class Abstraction2{
public static void main(String args[]){
Shape s=new Circle();
s.draw();
}
}