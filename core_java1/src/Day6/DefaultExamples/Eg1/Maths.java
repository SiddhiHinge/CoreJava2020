package Day6.DefaultExamples.Eg1;

public interface Maths {
	
	default int add(int a,int b){
		return a+b;
	}
	default void show() {
		System.out.println("Maths");
	}

}
