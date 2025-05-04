package testNG;

import org.testng.annotations.Test;

public class firstclass {
@Test(priority = 1)
void login() {
	System.out.println("1");
}

         @Test (priority = 2)
void search() {
	System.out.println("2");
}

@Test (priority = 3)
void logout() {
	System.out.println("3");
}
	
}
