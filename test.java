public class test{
	private int i=0;
	test increment(){
		i++;
		return this;
	}
	
	void print(){
		System.out.println("i=" +i);
	}
	
	public static void main(String[] args){
		test x=new test();
		x.increment().increment().increment().print();
	}
}