package factories;

import java.lang.reflect.Constructor;

import domain.Personeelslid;

public class PersoneelslidFactory {
	public static Personeelslid createPersoneel(
                                      String type, Object... args){
		Personeelslid instance = null;
		Class <?> [] arg = new Class[args.length];
		int tel = 0;
		for (Object object:args){
			arg[tel++] = object.getClass();
		}
		try{
			Class<?> clazz = Class.forName(type);
			Constructor<?> constructor = clazz.getConstructor(arg); 
			instance = (Personeelslid)constructor.newInstance(args);
		}
		catch (Exception ex){System.out.println(ex.getMessage());}
		return instance;
	}
}
