package uk.org.sappho.maven.release.report.plugin;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugin.logging.Log;

import java.util.List;

/**
 * Generate a release report
 *
 * @goal report
 */
public class ReleaseReportMojo extends AbstractMojo {

    /**
     * @parameter expression="${toVersion}
     * @required
     * @readonly
     */
    private String toVersion;

    /**
     * @parameter expression="${project.remoteArtifactRepositories}"
     * @required
     * @readonly
     */
    private List remoteArtifactRepositories;

    private final Log log = getLog();

    public void execute() throws MojoExecutionException, MojoFailureException {

        log.info(toVersion);
    }
}
