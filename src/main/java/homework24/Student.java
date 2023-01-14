package hw24;

public class Student {
    private String fullName;
    private String universityId; // будет простенькая БД в следующих ДЗ? =)
    private int currentCourseNumber;
    private float avgExamScore;

    public Student(String fullName, String universityId, int currentCourseNumber, float avgExamScore) {
        this.fullName = fullName;
        this.universityId = universityId;
        this.currentCourseNumber = currentCourseNumber;
        this.avgExamScore = avgExamScore;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setUniversityId(String universityId) {
        this.universityId = universityId;
    }

    public void setCurrentCourseNumber(int currentCourseNumber) {
        this.currentCourseNumber = currentCourseNumber;
    }

    public void setAvgExamScore(float avgExamScore) {
        this.avgExamScore = avgExamScore;
    }

    public String getFullName() {
        return fullName;
    }

    public String getUniversityId() {
        return universityId;
    }

    public int getCurrentCourseNumber() {
        return currentCourseNumber;
    }

    public float getAvgExamScore() {
        return avgExamScore;
    }
    @Override
    public String toString(){
        return "#############" +
                "\nИмя студента: " + this.fullName +
                "\nИдентификатор университета: "+ this.universityId +
                "\nНомер курса: " + this.currentCourseNumber +
                "\nСредний балл: " + this.avgExamScore
                + "\n#############";
    }
}
