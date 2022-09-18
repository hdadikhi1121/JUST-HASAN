public class Student {
    private int id;
    private String studentNumber;
    private String averageMark;
    private String personId;
    public Student(int id, String studentNumber, String averageMark, String personId) {
        this.id = id;
        this.studentNumber = studentNumber;
        this.averageMark = averageMark;
        this.personId = personId;
    }
    @Override
    public String toString() {
        return "Student [averageMark=" + averageMark + ", id=" + id + ", personId=" + personId + ", studentNumber="
                + studentNumber + "]";
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getStudentNumber() {
        return studentNumber;
    }
    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }
    public String getAverageMark() {
        return averageMark;
    }
    public void setAverageMark(String averageMark) {
        this.averageMark = averageMark;
    }
    public String getPersonId() {
        return personId;
    }
    public void setPersonId(String personId) {
        this.personId = personId;
    }

    
}
