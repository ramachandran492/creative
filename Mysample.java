class dample{

void fun(){

System.out.println("Im from parent class fun");

}

void display (){
System.out.println("I'm display in parent class");

}

}

class Mysample{

public static void main(String[] args){

dample d1=new dample();
d1.fun();
d1.display();



}
}