package abstractionAssignment;

public class Automation extends MultipleLangauge implements Language,TestTool{
	
	

	public static void main(String[] args) {

		Automation callMethods = new Automation();
		
		callMethods.python();
		callMethods.ruby();
		callMethods.Selenium();
		callMethods.Java();
	}

	public void Selenium() {
		System.out.println("Learn Selenium");
	}

	public void Java() {
		System.out.println("Learn JAVA");
	}

	@Override
	public void ruby() {

		System.out.println("Learn RUBY");
	}

}
