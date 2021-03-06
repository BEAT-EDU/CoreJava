package corejava07_08.inheritAndPoly.interfaces;

interface E {
	interface G {
		void f();
	}

	// Redundant "public":
	public interface H {
		void f();
	}

	void g();
	// Cannot be private within an interface:
	// ! private interface I {}
}