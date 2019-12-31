package classes;

import java.util.Calendar;

public class ClassExample {
	public static void main(String[] args) {
		Object obj = new Friend();
		System.out.println(obj.hashCode());
		
		if(obj instanceof Friend)
		{
			Friend frnd = (Friend) obj;
			System.out.println(frnd.getName() + frnd.getPhone());
		}
		
		
		
		
	}
}


