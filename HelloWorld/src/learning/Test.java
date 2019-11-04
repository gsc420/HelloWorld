package learning;

public class Test {

	public void m4(Animal a) {

		System.out.println("Animal Vesrion");
	}

	public void m4(Monkey mo) {

		System.out.println("Monkey Vesrion");
	}

	public static void main(String[] args) {
		
		
		Test t = new Test();
		Animal an = new Animal();
		Monkey mon = new Monkey();
		
		t.m4(an);
		t.m4(mon);
		
		Animal anm = new Monkey();
		t.m4(an);
		
		

		/*
		 * Parent p = new Parent();
		 * 
		 * p.parentmethod(10); p.parentmethod(10.6f); p.parentmethod('a');
		 * p.parentmethod(10l); ChildClass c = new ChildClass(); c.marry();
		 * p.marry(); Parent p1 = new ChildClass(); p1.marry();
		 */

		testLearning tl = new testLearning();

		// #case1#
		/*
		 * tl.m1(new Object()); tl.m1("test"); tl.m1(null);
		 */

		/* #case2# */
		tl.m1("Gaurav");
		tl.m1(new StringBuffer("Garav Chandel"));

		LearningSampl2 ls = new LearningSampl2();

		ls.m(10, 10.5f);
		ls.m(10.5f, 10);
		// ls.m(10,10); //-- compile error --The method m(int, float) is
		// ambiguous for the type LearningSampl2
		// ls.m(10.5,10.5); //The method m(int, float) in the type
		// LearningSampl2 is not applicable for the arguments (double, double)

		learningTest lt = new learningTest();

		lt.m3();
		lt.m3(10, 30, 90, 10);
		lt.m3(5);

	}

}
