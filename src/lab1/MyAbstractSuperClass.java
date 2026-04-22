package lab1;

public abstract class MyAbstractSuperClass {

    private String courseName;
    private String courseNumber;
    private double credits;

    public MyAbstractSuperClass(String courseName, String courseNumber) {
        setCourseName(courseName);
        setCourseNumber(courseNumber);
    }

    public final String getCourseName() {
        return courseName;
    }

    public final void setCourseName(String courseName) {
        validateNotBlank(courseName, "courseName");
        this.courseName = courseName;
    }

    public final String getCourseNumber() {
        return courseNumber;
    }

    public final void setCourseNumber(String courseNumber) {
        validateNotBlank(courseNumber, "courseNumber");
        this.courseNumber = courseNumber;
    }

    public final double getCredits() {
        return credits;
    }

    public final void setCredits(double credits) {
        if (credits < 0.5 || credits > 4.0) {
            throw new IllegalArgumentException("credits must be in the range 0.5 to 4.0");
        }
        this.credits = credits;
    }

    protected final void validateNotBlank(String value, String fieldName) {
        if (value == null || value.trim().isEmpty()) {
            throw new IllegalArgumentException(fieldName + " cannot be null or blank");
        }
    }

    public abstract String getPrerequisites();

    public abstract void setPrerequisites(String prerequisites);
}
