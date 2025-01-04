package TestNG;

import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;
import org.testng.TestNG;
import java.util.ArrayList;
import java.util.List;

public class CreateXml {
    public static void runfromprogram() {
        XmlSuite suite = new XmlSuite();
        suite.setName("Suite");

        XmlTest test = new XmlTest(suite);
        test.setName("Test");

        List<XmlClass> classes = new ArrayList<>();
        classes.add(new XmlClass("Sample"));

        test.setXmlClasses(classes);

        List<XmlSuite> suites = new ArrayList<>();
        suites.add(suite);

        TestNG testNG = new TestNG();
        testNG.setXmlSuites(suites);

        testNG.run();
    }
}