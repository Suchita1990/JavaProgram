package Reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.testng.xml.LaunchSuite;

public class ReflectionDemo
{
  public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
	Class reflection=LaunchBrowser.class;
/* Getting methods of the class through the object of the class by using getMethods */ 
	Method[] allMethods=reflection.getDeclaredMethods();
	for(Method method: allMethods)
	{
		/*if(method.getParameterCount())
		{
			method.invoke(new LaunchBrowser(),5,6,7);
		}
	}
	Method add=reflection.getDeclaredMethod("add",int.class,int.class);
	add.invoke(new LaunchBrowser(), 5,6);
}*/
		Annotation[] an=method.getAnnotations();
		if(an.length==0)
		{
			System.out.println("There are no annotations to method:"+method.getName());
		}
			else {
				for(Annotation anno:an)
				{
					System.out.println("Method "+method.getName()+"have annotations. "+anno);
				}
			}
		}
	
  }
  }

  
