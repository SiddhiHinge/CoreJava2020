package Day4.innerClasses;

public class TestInnerClass {

	public static void main(String[] args) {
		OuterClass outerClass = new OuterClass();
		System.out.println("OuterClass x : "+outerClass.x);
		OuterClass.InnerClass innerClass = outerClass.new InnerClass();
		System.out.println("InnerClass y : "+innerClass.y);
	}
	
	/*We can write Inner class object as - 
	 import Day4.innerClasses.OuterClass.InnerClass;
	 InnerClass innerClass = outerClass.new InnerClass();
	 */
	

}
