package GqtCodes;
class Test{
	int a;
	static int c;
}
public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(Test.c);  //10
        Test t1=new Test();  //t1 is local
        t1.a=10;
        t1.c=200;
        System.out.println(t1.a);
        System.out.println(t1.c);
        Test t2=new Test();   //t2 is local
        t2.a=20;
        System.out.println(t2.a);
        System.out.println(t2.c);
        Test t3= new Test();
        Test t4=new Test();
	}

}
