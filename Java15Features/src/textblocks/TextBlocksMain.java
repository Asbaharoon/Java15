package textblocks;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class TextBlocksMain {

	public static void main(String[] args) {
		
		exampleOne();
		System.out.println("------------------------------------------------");
		
		exampleTwo();
		System.out.println("------------------------------------------------");
		
		exampleThree();
		System.out.println("------------------------------------------------");
	
		exampleFour();
		System.out.println("------------------------------------------------");
	}
	
	
	private static void exampleOne() {
		
		String exampleOneText =
                """
                <html>
                    <body>
                        <p>Hello, world</p>
                        <p>%1$tY-%1$tm-%1$td</p>
                    </body>
                </html>
                """;
		
		exampleOneText = exampleOneText.formatted(LocalDate.now());

        System.out.println(exampleOneText);
		
	}
	
	private static void exampleTwo() {
		
		String exampleTwoText = 
				"""
                <html> \
                   <body> \
                     <p>Hello, world</p> \
                   </body> \
                </html> \
                """;
		
		System.out.println(exampleTwoText);
	}
	
	private static void exampleThree() {
		
		String exampleThreeText = 
				"""
	            <html>                   \s
	               <body>                \s
	                 <p>Hello, world</p> \s
	               </body>               \s
	            </html>                  \s
	            """;
		
		System.out.println(exampleThreeText);
	}
	
	private static void exampleFour() {
		String exampleFourText = 
				"""
                <html>                  
                   <body>               
                     <p> %s </p>
                     <p> %.1f </p>
                     <p> %d </p>
                     <p> %c </p>
                     <p> %s </p>
                   </body>              
                </html>                 
                """;
		
		String today = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
		
		exampleFourText = exampleFourText.formatted("Hello", 1234.6, 15 , 'y', today);
		
		System.out.println(exampleFourText);
	}
	
}
