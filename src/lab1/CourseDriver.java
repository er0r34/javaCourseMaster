package lab1;

public class CourseDriver {
    public static void main(String[] args) {
        MyAbstractSuperClass introProgramming =
                new IntroToProgrammingCourse("Introduction to Programming", "ITP-101");
        introProgramming.setCredits(3.0);

        MyAbstractSuperClass introJava =
                new IntroJavaCourse("Introduction to Java", "JAVA-201");
        introJava.setCredits(4.0);
        introJava.setPrerequisites("ITP-101");

        MyAbstractSuperClass advancedJava =
                new AdvancedJavaCourse("Advanced Java", "JAVA-401");
        advancedJava.setCredits(3.0);
        advancedJava.setPrerequisites("JAVA-201");

        MyAbstractSuperClass[] catalog = {introProgramming, introJava, advancedJava};

        System.out.println("Lab 1 course catalog:");
        for (MyAbstractSuperClass course : catalog) {
            System.out.println(course.getCourseNumber() + " | "
                    + course.getCourseName() + " | "
                    + course.getCredits() + " credits | prereq: "
                    + course.getPrerequisites());
        }

        // Good: abstraction reduces duplication and allows one shared API for all courses.
        // Bad: forcing all subclasses into one abstract contract can create awkward behavior,
        // such as IntroToProgrammingCourse supporting a prerequisite method it never uses.

        // LSP is advantageous when client code only needs shared members in MyAbstractSuperClass.
        // It is less advantageous when client code needs subtype-specific rules or behavior.
    }
}
