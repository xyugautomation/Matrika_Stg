package Com.DummyBase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReader {

	
	public static void main(String[] args) throws IOException {
//		//using command line argument	
//		if(args.length>0) {
//			System.out.println("The command line arguments are:" );
//		for(String val:args)
//			System.out.println(val);
//		
//		
//	}else
//		System.out.println("No command line" + "arguments found.");
//	}

	
	
	
	//Buffer Reder class
		
		BufferedReader read=new BufferedReader(new InputStreamReader(System.in));
		String x=read.readLine();
		System.out.println(x);
		
		
		
		
		
	
	
	}
}
