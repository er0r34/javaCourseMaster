package lab2;

public class CourseDriver {

    public static void main(String[] args) {
        IntroToProgrammingCourse introProgramming =
                new IntroToProgrammingCourse("Introduction to Programming", "ITP-101");
        introProgramming.setCredits(3.0);

        IntroJavaCourse introJava = new IntroJavaCourse("Introduction to Java", "JAVA-201");
        introJava.setCredits(4.0);
        introJava.setPrerequisites("ITP-101");

        AdvancedJavaCourse advancedJava = new AdvancedJavaCourse("Advanced Java", "JAVA-401");
        advancedJava.setCredits(3.0);
        advancedJava.setPrerequisites("JAVA-201");

        MySuperInterfaceClass[] catalog = {
            introProgramming,
            introJava,
            advancedJava
        };

        System.out.println("Course catalog (through interface references):");
        for (MySuperInterfaceClass course : catalog) {
            System.out.println(course.getCourseNumber() + " | "
                    + course.getCourseName() + " | "
                    + course.getCredits() + " credits");
        }

        // Good: interface-based design gives one common API for all course types.
        // Bad: because interfaces do not hold instance fields, validation logic is duplicated.

        // LSP applies when clients only depend on shared behavior in MySuperInterfaceClass.
        // LSP is not possible for subtype-specific behavior (for example getPrerequisites),
        // because that method is not part of the interface contract.
    }
}
