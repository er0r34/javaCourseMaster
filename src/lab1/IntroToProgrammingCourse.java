package lab1;

/**
 * This course has no prerequisites.
 */
public class IntroToProgrammingCourse extends MyAbstractSuperClass {

    public IntroToProgrammingCourse(String courseName, String courseNumber) {
        super(courseName, courseNumber);
    }

    @Override
    public String getPrerequisites() {
        return "None";
    }

    @Override
    public void setPrerequisites(String prerequisites) {
        if (prerequisites != null && !prerequisites.trim().isEmpty()) {
            throw new UnsupportedOperationException("IntroToProgrammingCourse has no prerequisites");
        }
    }
}
