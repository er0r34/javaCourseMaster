package lab1;

/**
 * Describe responsibilities here.
 *
 * @author your name goes here
 * @version 1.00
 */
public class AdvancedJavaCourse extends MyAbstractSuperClass {

    private String prerequisites;

    public AdvancedJavaCourse(String courseName, String courseNumber) {
        super(courseName, courseNumber);
    }

    @Override
    public String getPrerequisites() {
        return prerequisites;
    }

    @Override
    public void setPrerequisites(String prerequisites) {
        validateNotBlank(prerequisites, "prerequisites");
        this.prerequisites = prerequisites;
    }
}
