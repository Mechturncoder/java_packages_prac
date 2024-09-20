package day12;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;

public class DemoReflections {

	private static CreatedBy myanno;

	public static void main(String[] args) throws ClassNotFoundException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {

		Students s = new Students();
//		Class c = s.getClass();
		
		Class c = Class.forName("day12.Students");
		Field[] fields = c.getDeclaredFields();
		
		for(Field f: fields)
		{
			Type type = f.getGenericType();
			System.out.println(type.getTypeName());
			System.out.println(f.getName());
		}
		for(Field f: fields)
		{
			f.setAccessible(true);
			if(f.getName().equals("rollno"))
				f.setInt(s,10);
			if(f.getName().equals("name"))
				f.set(s,"abc");
		}
		System.out.println(s);
		
		Method[] methods = c.getDeclaredMethods();
		for(Method method : methods)
		{
			System.out.println(method.getName());
			if(method.getName().equals("simpleMethod"))
				method.invoke(s);
			if(method.getName().equals("methodWithParam")){
				Type [] types = method.getGenericParameterTypes();
				System.out.println(Arrays.toString(types));
				method.invoke(s, 23, "kkk");
			}
			if(method.getName().equals("privateMethod")) {
				method.setAccessible(true);
				method.invoke(s);
			}
			if(method.getName().equals("staticMethod")) {
				method.setAccessible(true);
				method.invoke(null);
			}
			
			Constructor<Students> [] cons = c.getDeclaredConstructors();
			for(Constructor<Students> con : cons)
			{
				if(con.getParameterCount()==2)
				{
					Students ss = con.newInstance(12,"sss");
					System.out.println(ss);
				}
			}
			for(Method method1: methods)
			{
				if(method1.getDeclaredAnnotation(CreatedBy.class)!=null)
				{
					CreatedBy myanno = method1.getAnnotation(CreatedBy.class);
					System.out.println(myanno.name());
					System.out.println(myanno.priority());
					if(myanno.priority() == 1)
						method1.invoke(s, 34, "ppp");
				}
			}
		}
	}	

}
