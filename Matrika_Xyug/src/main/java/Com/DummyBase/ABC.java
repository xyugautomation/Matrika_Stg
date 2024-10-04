package Com.DummyBase;

public class ABC {

	public String name;

	public ABC() {

		System.out.println("Without parameter constructor..!!");

	}

	public ABC(String name) {
		this.name = name;
		System.out.println("One parameter constructor...!!!");
		System.out.println(name);

	

	
	
	
		
		
		
	}
	
	
	static public void  main(String[] args) {
//		ABC ab = new ABC("Shiv");
//		ab.name = "Shiva";
//		System.out.println(ab.name = "Shiva");

		String name="Shiv";
		
		char ch=name.charAt(1);
		System.out.println(ch);
		
		int strLength=name.length();
		
		System.out.println(strLength);
		
		for(int i=0;i<name.length()-1;i++) {
			
			if(i%2!=0) {
				System.out.println("Char at"+i+"place" +name.charAt(i));
				
			}
			
		}
		
		int count=0;
		for(int i=0;i<name.length()-1;i++) {
			if(name.charAt(i)=='h') {
				
				count++;
				
			}
			
		}
		System.out.println("Frequency of s is:" +count);
		
		
		String s1="Sachin";
		String s2="Sachin";
		String s3="Saurav";
		String s4 =new String ("Sachin");
		
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s4));
		System.out.println(s1.equals(s3));
		
		
		
		
		
		
		
//		String str[] = { "Shiv", "For", "Geeks" };
//		for (int i = 0; i < str.length; i++) {
//			System.out.println(str[i]);
//
//		}

	}

}
