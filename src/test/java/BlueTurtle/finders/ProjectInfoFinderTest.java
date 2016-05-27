package BlueTurtle.finders;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

/**
 * Test for the ProjectInforFinder class.
 * 
 * @author BlueTurtle.
 *
 */
public class ProjectInfoFinderTest {

	private ProjectInfoFinder pif;
	private String exampleFilePath;
	private static String srcDir = System.getProperty("user.dir") + "/src";


	/**
	 * Initialize the objects that are needed.
	 * 
	 * @throws Exception
	 *             throws an exception if problem is encountered while
	 *             instantiating the objects.
	 */
	@Before
	public void setUp() throws Exception {
		pif = new ProjectInfoFinder();
		exampleFilePath = Paths.get("src", "test", "resources", "TestCodeFolder", "AllClosestPoints.java").toAbsolutePath().toString();
		pif.findFiles(new File(Paths.get("src", "test", "resources").toAbsolutePath().toString()));
		pif.findFiles(new File(srcDir));
	}

	/**
	 * Test finding files does not give an empty list of paths.
	 * 
	 */
	@Test
	public void testFindFilesNonEmptyListOfPaths() {
		assertFalse(ProjectInfoFinder.getClassPaths().isEmpty());
	}

	/**
	 * Test that the right package name is returned given a path to a file.
	 * 
	 */
	@Test
	public void testRightPackageNameForPathIsReturned() {
		String packageName = ProjectInfoFinder.getClassPackage().get(exampleFilePath);
		assertEquals("default", packageName);
	}

	/**
	 * Test that the right loc is returned given path.
	 * 
	 */
	@Test
	public void testRightLOCForPathIsReturned() {
		int actual = ProjectInfoFinder.getClassLocs().get(exampleFilePath);
		assertEquals(272, actual);
	}

	/**
	 * Test that the right set of packages names is returned given path.
	 * 
	 */
	@Test
	public void testRightSetOfPackagesIsReturned() {
		Set<String> actual = ProjectInfoFinder.getPackages();
		Set<String> expected = new HashSet<String>();
		expected.add("default");
		expected.add("BlueTurtle.warnings");
		expected.add("BlueTurtle.groupers");
		expected.add("BlueTurtle.computers");
		expected.add("BlueTurtle.TSE");
		expected.add("BlueTurtle.finders");
		expected.add("BlueTurtle.gui");
		expected.add("BlueTurtle.writers");
		expected.add("BlueTurtle.summarizers");
		expected.add("BlueTurtle.parsers");
		assertEquals(expected, actual);
	}

}
