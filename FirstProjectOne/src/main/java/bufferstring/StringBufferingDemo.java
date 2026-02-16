package bufferstring;

public class StringBufferingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		        StringBuffer sBuffer = new StringBuffer("This is String Buffer");
		        StringBuilder sBuilder = new StringBuilder("This is String Builder");

		        System.out.println(sBuffer);
		        System.out.println(sBuilder);

		        // insert value within the string
		        sBuffer.insert(0, "pre");
		        System.out.println(sBuffer);
		    }
		}
		
	


