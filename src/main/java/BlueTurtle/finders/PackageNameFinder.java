package BlueTurtle.finders;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * This class can be used for finding the package name of a component.
 * 
 * @author BlueTurtle.
 *
 */
@SuppressWarnings("checkstyle:hideutilityclassconstructor")
public final class PackageNameFinder {

	private static PackageNameFinder packageNameFinder = null;

	/**
	 * Constructor. Only this class can instantiate itself.
	 */
	private PackageNameFinder() { }

	/**
	 * Get an instance of this class.
	 * 
	 * @return an instance of PackageNameFinder.
	 */
	public static PackageNameFinder getInstance() {
		if (packageNameFinder == null) {
			packageNameFinder = new PackageNameFinder();
		}
		return packageNameFinder;
	}

	/**
	 * Find the package name based on the given file path.
	 * 
	 * @param filePath
	 *            the path to the file.
	 * @return the package name.
	 * @throws IOException
	 *             throws an exception if problem is encountered while reading
	 *             the file.
	 */
	public String findPackageName(String filePath) throws IOException {
		String packageName = "default";
		BufferedReader reader = new BufferedReader(new FileReader(filePath));
		String line = reader.readLine();
		
		while (line != null && !line.startsWith("package") && !line.startsWith("import")) {
			line = reader.readLine();
		}

		if (line != null && line.split(" ")[0].equals("package")) {
			packageName = line.split(" ")[1].split(";")[0];
		}

		reader.close();
		return packageName;
	}

}
