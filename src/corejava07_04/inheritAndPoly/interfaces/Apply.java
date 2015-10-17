package corejava07_04.inheritAndPoly.interfaces;

public class Apply {
	public static void process(Processor p, Object s) {
		System.out.print("Using Processor " + p.name());
		System.out.print(p.process(s));
	}
} // /:~