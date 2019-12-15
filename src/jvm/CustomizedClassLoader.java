package jvm;

public class CustomizedClassLoader extends ClassLoader{
	@Override
	public Class<?> loadClass(String name) throws ClassNotFoundException {
		return super.loadClass(name);
	}
}
