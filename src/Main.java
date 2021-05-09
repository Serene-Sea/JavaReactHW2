
public class Main {

	public static void main(String[] args) {
		
		//create courses
		Courses course1 = new Courses(1,"Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)", "Engin Demiroð");
		Courses course2 = new Courses(2,"Yazýlým Geliþtirici Yetiþtirme Kampý (C# + ANGULAR)", "Engin Demiroð");
		Courses course3 = new Courses(3,"Programlamaya Giriþ Ýçin Temel Kurs", "Engin Demiroð");
		
		Courses[] courses = {course1, course2, course3};
		for(Courses coursesPrint: courses) {
			System.out.println(coursesPrint.courseName);
		}
		
		//create users
		
		User user1 = new User(10,"Deniz","deniz123","deniz@gmail.com");
		User user2 = new User(11,"Can","Can123","can@gmail.com");
		
		CourseManager courseManager = new CourseManager();
		courseManager.registerCourse(course1, user1);
		courseManager.registerCourse(course2, user2);
	}
	
}
