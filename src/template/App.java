package template;

 
import java.util.ArrayList;
 import java.util.List;

import org.apache.log4j.Logger;

/**
 * App to create & test method to find the maximal element in a range of a list. 
 * -- Tested with Lists of Strings, Integers & User defined object (U) . 
 * 
 * @author jkramer
 *
 */

public class App {

	final static Logger logger = Logger.getLogger(App.class);
	List<String> stringList = new ArrayList<>();
	List<Integer> integerList = new ArrayList<>();
	List<User> userDefinedTypeList = new ArrayList<>();

 	public static void main(String[] args){
		App app = new App();
		app.init();
		app.TEST_Get_Max_Element();
	}
	 
	private void TEST_Get_Max_Element(){

		String sResult = getMaxElement(stringList );
		logger.debug("String List Compare Result: " + sResult);

 		Integer iResult = getMaxElement(integerList );
		logger.debug("Integer List Compare Result: " + iResult);

 		User uResult = getMaxElement(userDefinedTypeList );
	//	logger.debug("User Defined List Compare Result: " + uResult.getName() + ", " + uResult.getAge());
 	}

	//TODO
	//Implement a generic static method that returns the maximum element in a List 
	public static <E extends Comparable<E>> E getMaxElement(List<E> list) {
	   return null;
	}

	 

	private void init(){

		// load a list of strings
		stringList.add("meowl");
		stringList.add("yowl");
		stringList.add("zeowl");
		stringList.add("bear");
		stringList.add("reel");
		stringList.add("gobblygook");
		
		integerList.add(3);
		integerList.add(2);
		integerList.add(44);
		integerList.add(222);
		integerList.add(10000);
		integerList.add(12);
	 
	}
}	
 

 


