class Math{
	int op1,op2;
	void addition(int a,int b){
		op1=a;
		op2=b;
	}
	int subtraction(int a, int b){
		return a-b; 
	}
}

class FirstProgramme {
	public static void main(String args[]) {
		int sum,difference;
		Math add = new Math();
		add.addition(12,2);
		sum = add.op1+add.op2;
		System.out.println("sum of 12 and 2 is :" +sum);
		Math sub = new Math();
		difference = sub.subtraction(10,5);
		System.out.println("the difference between 10 and 5 is : "+difference);
	}
}
