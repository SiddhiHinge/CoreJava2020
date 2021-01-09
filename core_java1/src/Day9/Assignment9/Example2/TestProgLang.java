package Day9.Assignment9.Example2;

public class TestProgLang implements PythonLang{

	public static void main(String[] args) {
		TestProgLang lang = new TestProgLang();
		lang.getJavaName();
		lang.getPythonName();
	}

	@Override
	public void getJavaName() {
		System.out.println("I am Java !");
	}

	@Override
	public void getPythonName() {
		System.out.println("I am Python !");
		
	}

}
