package lab14;

public class Test_Class {

	public static void main(String[] args) {
		/* values are updated but the NumUni is not being added up since every time the
		 * object is created, it is invoking the base class's constructor i.e. IndianUniversity
		 * which initializes all the variables to the default value i.e. 0,0,0.
		 */
		Bennett b=new Bennett();
		SNU s=new SNU();
		IITB i=new IITB();
		b.display();
		s.display();
		i.display();
	}

}
