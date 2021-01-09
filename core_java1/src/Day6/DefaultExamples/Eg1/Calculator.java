package Day6.DefaultExamples.Eg1;

public interface Calculator {

	default int add(int x,int y){
		return x+y;
	}
	default void show() {
		System.out.println("Calculator");
	}
}
