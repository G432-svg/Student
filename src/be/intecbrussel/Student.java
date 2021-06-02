package be.intecbrussel;

public class Student {

    private Object ReportCard {;


        private final int studentId;
        private String name;
        private ReportCard reportCard = new ReportCard();
        private  static int numberOfStudents = 0;

        public Student(int studentId, String name) {
            Student student = new Student(numberOfStudents + 1);
            this.studentId = studentId;
            this.name = name;
        }

        public int getStudentId () {
            return studentId;
        }
        public getName(String name) {
            this.name = null;
       }
        public int getReportCard () {
            return ReportCard;
        }
        public static numberOfStudents( int[14]studentsArray){
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        }
        public String toString (Student student){
            return studentId + "student.name" + averageGrade;
        }
    }
}
