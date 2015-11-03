
public class Program {

	//MAIN STATIC METHOD
	public static void main(String[] args) {
		
		ExampleWindow frame = new ExampleWindow();
		
		try {
			//Overrides the label text defined addUIComponents method---
			frame.getHelloLabel().setText("Hello World!");
			frame.setVisible(true);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
