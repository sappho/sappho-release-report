package uk.org.sappho.maven.release.report.plugin;

import org.apache.maven.plugin.testing.AbstractMojoTestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.util.Properties;

public class ReleaseReportMojoTest extends AbstractMojoTestCase {

    private final Properties properties = System.getProperties();

    @Before
    public void setUp() throws Exception {

        super.setUp();
    }

    @After
    public void tearDown() throws Exception {

        super.tearDown();
    }

    @Test
    public void test() throws Exception {

        File pom = getTestFile("src/test/resources/project/pom.xml");
        ReleaseReportMojo releaseReportMojo = (ReleaseReportMojo) lookupMojo("report", pom);
        assertNotNull(releaseReportMojo);
        String toVersion = properties.getProperty("toVersion");
        assertNotNull(toVersion);
        setVariableValueToObject(releaseReportMojo, "toVersion", toVersion);
        releaseReportMojo.execute();
    }
}
