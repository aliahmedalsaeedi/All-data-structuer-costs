public class StuClass {

        private int student_id;
        private String student_name;

        public StuClass() {
        }

        public StuClass(int student_id, String student_name) {
            this.student_id = student_id;
            this.student_name = student_name;
        }

        public int getStu_id() {
            return student_id;
        }

        public void setStu_id(int student_id) {
            this.student_id = student_id;
        }

        public String getStudent_name() {
            return student_name;
        }

        public void setStudent_name(String student_name) {
            this.student_name = student_name;
        }

        @Override
        public String toString() {
            return "\nStudentClass{" + "student_id=" + student_id + "  , student_name= " + student_name + "" + '}';
        }
}

