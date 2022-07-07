package co.edu;

public class StudentMain {
/*
 * static 정적메소드 정적필드 사용
 */
	public static void main(String[] args) {
		System.out.println(args[0]);
		System.out.println(args[1]);
		
		
		
		Student Kim = new Student();		// 인스턴스 만들어줌
		Kim.setSno("22-001"); 				// set 값을 담아줌
		Kim.setName("김민수");
		Kim.setScore(80);
		
		System.out.println("이름" + Kim.getName());  // get 값을 반환
		Kim.showInfo();
		
		Student park = new Student("22-002","박희수",85);
		park.showInfo();
		
		Student Jeong = new Student();		// 반에 학생 추가
		Jeong.setSno("22-003"); 				
		Jeong.setName("정민선");
		Jeong.setScore(100);
		Jeong.showInfo();
		
				
		Course course = new Course("김철수" , "1-3", 25);
		System.out.println("선생님의 이름은 " + course.getTname());
		System.out.println("반 정보는 " + course.getBname());
		
		//학생등록
		course.addStudent(Kim);
		course.addStudent(park);
		course.addStudent(Jeong);
		
		//학생리스트 보기ㅣ
		course.getStudent();
		
		//최고점 학생정보보기/
		System.out.println("최고점수 학생: ");
		Student maxStudent = course.getMaxStudent();
		maxStudent.showInfo();
		
		//학생 평균 점수 보기
		System.out.println("반 평균 점수: " + course.getAvgScore());
		
		
	}

}
