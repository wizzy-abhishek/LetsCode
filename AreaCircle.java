
/* 

HOW TO DECLARE VARIABLE 
datatype variablename;

datatype variablename = value;

identifers are the name given to various prog elements such as variable , class , functions obj


class Test{

}
void show()
{

}
double d;
Test t=new Test();

rules of identifilers
first char should be an alphbet A-Z , a-z or _ or $
then we can use other alphabets or digits or _ $
special symbol and keywords are not allowed  

*/
 class AreaCircle{
	
	public static void main(String args[]){
	
	double rad=4.5;
	double area;
	area = 3.14*rad*rad; //Math.PI*rad*rad
	System.out.println("Area of circle" + area);
	}
}