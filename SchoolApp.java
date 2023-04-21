package cm4SchoolSystem;

public class SchoolApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Year year2020 = new Year();
		year2020.id = 1;
		year2020.year = 2020;

		Year year2021 = new Year();
		year2021.id = 2;
		year2021.year = 2021;

		Year year2022 = new Year();
		year2022.id = 3;
		year2022.year = 2022;

		Year[] years = { year2020, year2021, year2022 };

		Semester semester1 = new Semester();
		semester1.id = 1;
		semester1.name = "HK 1";
		semester1.multiplication = 1;
		semester1.year = year2020;

		Semester semester2 = new Semester();
		semester2.id = 2;
		semester2.name = "HK 2";
		semester2.multiplication = 2;
		semester2.year = year2020;
		
		Semester semester1Y21 = new Semester();
		semester1Y21.id = 3;
		semester1Y21.name = "HK 1";
		semester1Y21.multiplication = 3;
		semester1Y21.year = year2021;

		Semester semester2Y21 = new Semester();
		semester2Y21.id = 4;
		semester2Y21.name = "HK 2";
		semester2Y21.multiplication = 2;
		semester2Y21.year = year2021;
		
		Semester semester1Y22 = new Semester();
		semester1Y22.id = 5;
		semester1Y22.name = "HK 1";
		semester1Y22.multiplication = 3;
		semester1Y22.year = year2022;

		Semester semester2Y22 = new Semester();
		semester2Y22.id = 6;
		semester2Y22.name = "HK 2";
		semester2Y22.multiplication = 2;
		semester2Y22.year = year2022;

		Semester[] semesters = { semester1, semester2, semester1Y21, 
							semester2Y21, semester1Y22, semester2Y22 };

		Room room1 = new Room();
		room1.id = 1;
		room1.name = "Phong 1 Khu 1";

		Room[] rooms = { room1 };

		Teacher teacherDung = new Teacher();
		teacherDung.id = 1;
		teacherDung.name = "Dung Nguyen";

		Teacher teacherTri = new Teacher();
		teacherTri.id = 2;
		teacherTri.name = "Tri Tran";

		Teacher[] teachers = { teacherDung, teacherTri };

		Clazz clazz10A1 = new Clazz();
		clazz10A1.id = 1;
		clazz10A1.name = "10A1";
		clazz10A1.room = room1;
		clazz10A1.primaryTeacher = teacherDung;

		Clazz clazz10A2 = new Clazz();
		clazz10A2.id = 2;
		clazz10A2.name = "10A2";
		clazz10A2.room = room1;
		clazz10A2.primaryTeacher = teacherTri;

		Clazz[] clazzs = { clazz10A1, clazz10A2 };

		Student studentNghi = new Student();
		studentNghi.id = 1;
		studentNghi.name = "Anh Nghi";
		studentNghi.studyingClazz = clazz10A1;

		Student[] students = { studentNghi };

		Subject subjectMath = new Subject();
		subjectMath.id = 1;
		subjectMath.name = "Toan";
		subjectMath.multiplication = 2;

		Subject subjectHistory = new Subject();
		subjectHistory.id = 2;
		subjectHistory.name = "Lich Su";
		subjectHistory.multiplication = 1;

		Subject[] subjects = { subjectMath, subjectHistory };

		TeacherTeachSubject dungTeachMath = new TeacherTeachSubject();
		dungTeachMath.teacher = teacherDung;
		dungTeachMath.teachingSubject = subjectMath;

		TeacherTeachSubject dungTeachHistory = new TeacherTeachSubject();
		dungTeachHistory.teacher = teacherDung;
		dungTeachHistory.teachingSubject = subjectHistory;

		TeacherTeachSubject triTeachHistory = new TeacherTeachSubject();
		triTeachHistory.teacher = teacherTri;
		triTeachHistory.teachingSubject = subjectHistory;

		TeacherTeachSubject[] teacherTeachSubject = { dungTeachMath, dungTeachHistory, triTeachHistory };

		Exam examFinalSem1Math20 = new Exam();
		examFinalSem1Math20.id = 1;
		examFinalSem1Math20.name = "Final Mon Toan HK1";

		Exam examFinalSem2Math20 = new Exam();
		examFinalSem2Math20.id = 2;
		examFinalSem2Math20.name = "Final Mon Toan HK2";

		Exam examOralSem1Math20 = new Exam();
		examOralSem1Math20.id = 3;
		examOralSem1Math20.name = "Mieng Mon Toan HK1";

		Exam examOralSem2Math20 = new Exam();
		examOralSem2Math20.id = 4;
		examOralSem2Math20.name = "Mieng Mon Toan HK2";

		Exam examFinalSem1His20 = new Exam();
		examFinalSem1His20.id = 5;
		examFinalSem1His20.name = "Final Mon Su HK1";

		Exam examFinalSem2His20 = new Exam();
		examFinalSem2His20.id = 6;
		examFinalSem2His20.name = "Final Mon Su HK2";

		
		Exam examFinalSem1Math21 = new Exam();
		examFinalSem1Math21.id = 1;
		examFinalSem1Math21.name = "Final Mon Toan HK1";

		Exam examFinalSem2Math21 = new Exam();
		examFinalSem2Math21.id = 2;
		examFinalSem2Math21.name = "Final Mon Toan HK2";

		Exam examOralSem1Math21 = new Exam();
		examOralSem1Math21.id = 3;
		examOralSem1Math21.name = "Mieng Mon Toan HK1";

		Exam examOralSem2Math21 = new Exam();
		examOralSem2Math21.id = 4;
		examOralSem2Math21.name = "Mieng Mon Toan HK2";

		Exam examFinalSem1His21 = new Exam();
		examFinalSem1His21.id = 5;
		examFinalSem1His21.name = "Final Mon Su HK1";

		Exam examFinalSem2His21 = new Exam();
		examFinalSem2His21.id = 6;
		examFinalSem2His21.name = "Final Mon Su HK2";
		
		Exam examFinalSem1Math22 = new Exam();
		examFinalSem1Math22.id = 7;
		examFinalSem1Math22.name = "Final Mon Toan HK1";

		Exam examFinalSem2Math22 = new Exam();
		examFinalSem2Math22.id = 8;
		examFinalSem2Math22.name = "Final Mon Toan HK2";

		Exam examOralSem1Math22 = new Exam();
		examOralSem1Math22.id = 9;
		examOralSem1Math22.name = "Mieng Mon Toan HK1";

		Exam examOralSem2Math22 = new Exam();
		examOralSem2Math22.id = 10;
		examOralSem2Math22.name = "Mieng Mon Toan HK2";

		Exam examFinalSem1His22 = new Exam();
		examFinalSem1His22.id = 11;
		examFinalSem1His22.name = "Final Mon Su HK1";

		Exam examFinalSem2His22 = new Exam();
		examFinalSem2His22.id = 12;
		examFinalSem2His22.name = "Final Mon Su HK2";
		
		Exam[] exams = { examFinalSem1Math20, examFinalSem2Math20, examOralSem1Math20, 
						examOralSem2Math20, examFinalSem1His20, examFinalSem2His20,
						examFinalSem1Math21, examFinalSem2Math21, examOralSem1Math21,
						examOralSem2Math21, examFinalSem1His21, examFinalSem2His21,
						examFinalSem1Math22, examFinalSem2Math22, examOralSem1Math22,
						examOralSem2Math22, examFinalSem1His22, examFinalSem2His22};

		ExamDetails examDetails1 = new ExamDetails();
		examDetails1.exam = examFinalSem1Math20;
		examDetails1.student = studentNghi;
		examDetails1.subject = subjectMath;
		examDetails1.semester = semester1;
		examDetails1.point = 5;
		examDetails1.multiplication = 2;

		ExamDetails examDetails2 = new ExamDetails();
		examDetails2.exam = examOralSem1Math20;
		examDetails2.student = studentNghi;
		examDetails2.subject = subjectMath;
		examDetails2.semester = semester1;
		examDetails2.point = 8;
		examDetails2.multiplication = 1;

		ExamDetails examDetails3 = new ExamDetails();
		examDetails3.exam = examOralSem2Math20;
		examDetails3.student = studentNghi;
		examDetails3.subject = subjectMath;
		examDetails3.semester = semester2;
		examDetails3.point = 8;
		examDetails3.multiplication = 1;

		ExamDetails examDetails4 = new ExamDetails();
		examDetails4.exam = examFinalSem1His20;
		examDetails4.student = studentNghi;
		examDetails4.subject = subjectHistory;
		examDetails4.semester = semester1;
		examDetails4.point = 7.5;
		examDetails4.multiplication = 1;

		ExamDetails examDetails5 = new ExamDetails();
		examDetails5.exam = examFinalSem2His20;
		examDetails5.student = studentNghi;
		examDetails5.subject = subjectHistory;
		examDetails5.semester = semester2;
		examDetails5.point = 8;
		examDetails5.multiplication = 1;

		ExamDetails examDetails6 = new ExamDetails();
		examDetails6.exam = examFinalSem2Math20;
		examDetails6.student = studentNghi;
		examDetails6.subject = subjectMath;
		examDetails6.semester = semester2;
		examDetails6.point = 7;
		examDetails6.multiplication = 2;

		ExamDetails examDetails1Y21 = new ExamDetails();
		examDetails1Y21.exam = examFinalSem1Math21;
		examDetails1Y21.student = studentNghi;
		examDetails1Y21.subject = subjectMath;
		examDetails1Y21.semester = semester1Y21;
		examDetails1Y21.point = 6;
		examDetails1Y21.multiplication = 2;

		ExamDetails examDetails2Y21 = new ExamDetails();
		examDetails2Y21.exam = examOralSem1Math21;
		examDetails2Y21.student = studentNghi;
		examDetails2Y21.subject = subjectMath;
		examDetails2Y21.semester = semester1Y21;
		examDetails2Y21.point = 7.5;
		examDetails2Y21.multiplication = 1;

		ExamDetails examDetails3Y21 = new ExamDetails();
		examDetails3Y21.exam = examOralSem2Math21;
		examDetails3Y21.student = studentNghi;
		examDetails3Y21.subject = subjectMath;
		examDetails3Y21.semester = semester2Y21;
		examDetails3Y21.point = 9;
		examDetails3Y21.multiplication = 1;

		ExamDetails examDetails4Y21 = new ExamDetails();
		examDetails4Y21.exam = examFinalSem1His21;
		examDetails4Y21.student = studentNghi;
		examDetails4Y21.subject = subjectHistory;
		examDetails4Y21.semester = semester1Y21;
		examDetails4Y21.point = 8;
		examDetails4Y21.multiplication = 1;

		ExamDetails examDetails5Y21 = new ExamDetails();
		examDetails5Y21.exam = examFinalSem2His21;
		examDetails5Y21.student = studentNghi;
		examDetails5Y21.subject = subjectHistory;
		examDetails5Y21.semester = semester2Y21;
		examDetails5Y21.point = 5.8;
		examDetails5Y21.multiplication = 1;

		ExamDetails examDetails6Y21 = new ExamDetails();
		examDetails6Y21.exam = examFinalSem2Math21;
		examDetails6Y21.student = studentNghi;
		examDetails6Y21.subject = subjectMath;
		examDetails6Y21.semester = semester2Y21;
		examDetails6Y21.point = 6;
		examDetails6Y21.multiplication = 2;
		
		
		ExamDetails examDetails1Y22 = new ExamDetails();
		examDetails1Y22.exam = examFinalSem1Math22;
		examDetails1Y22.student = studentNghi;
		examDetails1Y22.subject = subjectMath;
		examDetails1Y22.semester = semester1Y22;
		examDetails1Y22.point = 8.5;
		examDetails1Y22.multiplication = 2;

		ExamDetails examDetails2Y22 = new ExamDetails();
		examDetails2Y22.exam = examOralSem1Math22;
		examDetails2Y22.student = studentNghi;
		examDetails2Y22.subject = subjectMath;
		examDetails2Y22.semester = semester1Y22;
		examDetails2Y22.point = 8;
		examDetails2Y22.multiplication = 1;

		ExamDetails examDetails3Y22 = new ExamDetails();
		examDetails3Y22.exam = examOralSem2Math22;
		examDetails3Y22.student = studentNghi;
		examDetails3Y22.subject = subjectMath;
		examDetails3Y22.semester = semester2Y22;
		examDetails3Y22.point = 9;
		examDetails3Y22.multiplication = 1;

		ExamDetails examDetails4Y22 = new ExamDetails();
		examDetails4Y22.exam = examFinalSem1Math22;
		examDetails4Y22.student = studentNghi;
		examDetails4Y22.subject = subjectHistory;
		examDetails4Y22.semester = semester1Y22;
		examDetails4Y22.point = 8.5;
		examDetails4Y22.multiplication = 1;

		ExamDetails examDetails5Y22 = new ExamDetails();
		examDetails5Y22.exam = examFinalSem2Math22;
		examDetails5Y22.student = studentNghi;
		examDetails5Y22.subject = subjectHistory;
		examDetails5Y22.semester = semester2Y22;
		examDetails5Y22.point = 9;
		examDetails5Y22.multiplication = 1;

		ExamDetails examDetails6Y22 = new ExamDetails();
		examDetails6Y22.exam = examFinalSem2Math22;
		examDetails6Y22.student = studentNghi;
		examDetails6Y22.subject = subjectMath;
		examDetails6Y22.semester = semester2Y22;
		examDetails6Y22.point = 7.8;
		examDetails6Y22.multiplication = 2;
		
		ExamDetails[] examDetails = { examDetails1, examDetails2, examDetails3, 
										examDetails4, examDetails5,examDetails6,
										examDetails1Y21, examDetails2Y21, examDetails3Y21, 
										examDetails4Y21, examDetails5Y21, examDetails6Y21,
										examDetails1Y22, examDetails2Y22, examDetails3Y22,
										examDetails4Y22, examDetails5Y22, examDetails6Y22};

		for (Student student : students) {
			double diemTongKet = 0;
			
			System.out.println("Student Name: " + student.name);
			System.out.println("Class: " + student.studyingClazz.name);
			System.out.println("Primary Teacher: " + student.studyingClazz.primaryTeacher.name);
			for (Year year : years) {
				double mathAveragePoint = 0;
				double historyAveragePoint = 0;
				double dtb = 0;
				double dtbhk1 = 0;
				double dtbhk2 = 0;
				double diemTrungBinhCong = 0;
				System.out.println("Year: " + year.year);
				for (Semester semester : semesters) {
					if (year.id == semester.year.id) {
						int totalSubjectMultiplication = 0;
						System.out.println("Semester: " + semester.name);
						System.out.println("-----");
						for (Subject subject : subjects) {
							double averagePoint = 0;
							double total = 0;
							double totalMultiplication = 0;
							System.out.println("Subject: " + subject.name);
							for (ExamDetails examDetail : examDetails) {
								if (subject.id == examDetail.subject.id && student.id == examDetail.student.id
									&& semester.id == examDetail.semester.id && year.id == examDetail.semester.year.id) {
									System.out.println(
											"Exam: " + examDetail.exam.name + " -- Point: " + examDetail.point);

									totalMultiplication += examDetail.multiplication;
									// System.out.println("Total multiplication: " + totalMultiplication);
									total += (examDetail.point * examDetail.multiplication);
									// System.out.println("Total: " + total);
									averagePoint = total / totalMultiplication;
									// System.out.println("Average: " + averagePoint);
								}
							}

							System.out.println("-----");
							System.out.println("The Average Point of " + subject.name + " is : "
									+ Math.round(averagePoint * 100.0) / 100.0);
							System.out.println("-----");

							// Adding up subjects' multiplications
							totalSubjectMultiplication += subject.multiplication;
							// System.out.println("Total Subject Multiplication: " +
							// totalSubjectMultiplication);

							// Storing math and history average point
							if (subject.name.equalsIgnoreCase("TOAN")) {
								mathAveragePoint = averagePoint * subjectMath.multiplication;
								// System.out.println("math: " + mathAveragePoint);
							}
							if (subject.name.equalsIgnoreCase("LICH SU")) {
								historyAveragePoint = averagePoint * subjectHistory.multiplication;
							}

						}

						// Calculate the average points of all subjects for each semester
						dtb = (mathAveragePoint + historyAveragePoint) / totalSubjectMultiplication;
						System.out.println("The Average Point of every Subjects in " + semester.name + " is: "
								+ Math.round(dtb * 100.0) / 100.0);

						System.out.println();
						System.out.println("**********");
						// calculate the final grade by formula (dtbhk1 +(dtbhk2 *2)) /3
						// Adding up dtb of each semester
						diemTrungBinhCong += dtb;
						// storing dtb value to dtbhk2
						dtbhk2 = dtb;
						// dtbhk1 = diemTrungBinhCong - dtbhk1
						dtbhk1 = diemTrungBinhCong - dtbhk2;
						diemTongKet = (dtbhk1 + (dtbhk2 * semester.multiplication)) / 3;
					}
					
					
				}
				System.out.println("The Final Grade of the Year is: " + Math.round(diemTongKet * 100.0) / 100.0);
				if(diemTongKet > 8) {
					System.out.println("Excellent Student");
				}
				else if(diemTongKet > 7) {
					System.out.println("Good Student");
				}
				else if(diemTongKet > 6) {
					System.out.println("Average Student");
				}
				else if(diemTongKet > 5) {
					System.out.println("Normal Student");
				}
				else {
					System.out.println("Failed");
				}
				System.out.println("*********");
			}

		}

	}

}
