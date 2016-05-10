package BlueTurtle.writers;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import BlueTurtle.summarizers.Summarizer;

/**
 * This class can be used to write the output of the analyzer to json format.
 * 
 * @author BlueTurtle.
 *
 */
public class JsonWriter {

	private List<Summarizer> summarizedWarnings;

	/**
	 * Contructor.
	 * 
	 * @param summarizedWarnings
	 *            the list of summarizer(where the warnings are summarized).
	 */
	public JsonWriter(List<Summarizer> summarizedWarnings) {
		setSummarizedWarnings(summarizedWarnings);
	}

	/**
	 * Write the summarized warnings to a file in JSON format.
	 * 
	 * @param outputFilePath
	 *            path to write the output to.
	 * @throws IOException
	 *             throws an exception if something went wrong in the process of
	 *             writing to file.
	 */
	public void writeToJsonFormat(String outputFilePath) throws IOException {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();

		String json = gson.toJson(summarizedWarnings);

		File file = new File(outputFilePath);
		FileOutputStream fOut = new FileOutputStream(file);
		OutputStreamWriter writer = new OutputStreamWriter(fOut);
		writer.append(json);
		writer.close();
		fOut.close();
	}

	/**
	 * Get the list of summarized warnings.
	 * 
	 * @return a list of summarizers.
	 */
	public List<Summarizer> getSummarizedWarnings() {
		return summarizedWarnings;
	}

	/**
	 * Set the list of summarized warnings.
	 * 
	 * @param summarizedWarnings
	 *            list of summarizers.
	 */
	public void setSummarizedWarnings(List<Summarizer> summarizedWarnings) {
		this.summarizedWarnings = summarizedWarnings;
	}

}