import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LiteracyComparison {

	public static void main(String[] args) {
		String filename = "literacy.csv";
		String line;
		String splitBy = ",";
		List<LiteracyRecord> literacyRecord = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
			while ((line = br.readLine()) != null) {
				String[] tokens = line.split(splitBy);
				String country = tokens[3].trim();
				String year = tokens[4].trim();
				String gender = tokens[2].trim().split(" ")[0];
				double literacyRate = Double.parseDouble(tokens[5].trim());

				literacyRecord.add(new LiteracyRecord(country, year, gender, literacyRate));
			}

			literacyRecord.sort(Comparator.comparingDouble(LiteracyRecord::getLiteracyRate));

			for (LiteracyRecord record : literacyRecord) {
				System.out.println(record.getCountry() + " (" + record.getYear() + "), " + record.getGender() + ", " + record.getLiteracyRate());
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
