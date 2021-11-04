package Jitpack_Project;
import org.joda.time.DateTime;

class Registration {
	
	public static void main(String[] args)
	{
		Student s1 = new Student("Darragh", "22", 12345678, DateTime.parse("28/10/1999"));
		Student s2 = new Student("Liam", "21", 98765432, DateTime.parse("20/5/2000"));
		Student s3 = new Student("Niall", "43", 24681012, DateTime.parse("29/2/2000"));
		Student s4 = new Student ("Phil", "24", 56765676, DateTime.parse("10/3/1990"));
		
		Module m1 = new Module("Software Engineering", "CT417");
		Module m2 = new Module("Machine Learning", "CT4101");
		Module m3 = new Module("Artificial Intelligence", "CT421");
		Module m4 = new Module("Fundamentals of Electronics", "EE201");
		Module m5 = new Module("Professional Skills", "CT321");
		
		Course c1 = new Course("Computer Science", "BCT");
		Course c2 = new Course("Electrical Engineering", "EEC");
		
		//Add Courses to Students
		s1.enrollInCourse(c1);
		s2.enrollInCourse(c1);
		s3.enrollInCOurse(c1);
		s4.enrollInCourse(c2);
		
//------------------------------------------------------------
		//Add Students to Courses
		c1.addStudent(s1);
		c1.addStudent(s2);
		c1.addStudent(s3);
		c2.addStudent(s4);
		
//-----------------------------------------------------------
		//Add Modules to Students - Student One
		s1.addModule(m1);
		s1.addModule(m2);
		s1.addModule(m5);

		//Student Two
		s2.addModule(m1);
		s2.addModule(m3);
		s2.addModule(m5);

		//Student Three
		s3.addModule(m2);
		s3.addModule(m3);
		s3.addModule(m5);

		//Student Four
		s4.addModule(m3);
		s4.addModule(m4);
		s4.addModule(m5);

//-----------------------------------------------------------
		//Add Students to Modules - Module One
		m1.addStudent(s1);
		m1.addStudent(s2);
		
		//Module Two
		m2.addStudent(s1);
		m2.addStudent(s3);

		//Module Three
		m3.addStudent(s2);
		m3.addStudent(s3);
		m3.addStudent(s4);

		//Module Four
		m4.addStudent(s4);

		//Module Five
		m5.addStudent(s1);
		m5.addStudent(s2);
		m5.addStudent(s3);
		m5.addStudent(s4);

		
//-----------------------------------------------------------
		
		//Modules to course
		c1.addModule(m1);
		c1.addModule(m2);
		c1.addModule(m3);
		c1.addModule(m5);
		
		c2.addModule(m2);
		c2.addModule(m3);
		c2.addModule(m4);
		c2.addModule(m5);
		
		//Course to Module
		m1.addCourse(c1);
		
		m2.addCourse(c1);
		m2.addCourse(c2);
		
		m3.addCourse(c1);
		m3.addCourse(c2);
		
		m4.addCourse(c1);
		
		m5.addCourse(c1);
		m5.addCourse(c2);
		
		
		//Print Lists
		s1.listModules();
		s2.listModules();
		s3.listCourses();
		
		m1.listStudents();
		m5.listCourses();
		
		c1.listStudents();
		c2.listModules();
		
		
	}

}
