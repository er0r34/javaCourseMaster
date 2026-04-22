package lab2;

/**
 * Intro to programming has no prerequisites.
 */
public class IntroToProgrammingCourse implements MySuperInterfaceClass {

    private String courseName;
    private String courseNumber;
    private double credits;

    public IntroToProgrammingCourse(String courseName, String courseNumber) {
        setCourseName(courseName);
        setCourseNumber(courseNumber);
    }

    @Override
    public String getCourseName() {
        return courseName;
    }

    @Override
    public void setCourseName(String courseName) {
        validateNotBlank(courseName, "courseName");
        this.courseName = courseName;
    }

    @Override
    public String getCourseNumber() {
        return courseNumber;
    }

    @Override
    public void setCourseNumber(String courseNumber) {
        validateNotBlank(courseNumber, "courseNumber");
        this.courseNumber = courseNumber;
    }

    @Override
    public double getCredits() {
        return credits;
    }

    @Override
    public void setCredits(double credits) {
        validateCredits(credits);
        this.credits = credits;
    }

    private void validateNotBlank(String value, String fieldName) {
        if (value == null || value.trim().isEmpty()) {
            throw new IllegalArgumentException(fieldName + " cannot be null or blank");
        }
    }

    private void validateCredits(double credits) {
        if (credits < 0.5 || credits > 4.0) {
            throw new IllegalArgumentException("credits must be in the range 0.5 to 4.0");
        }
    }
}
