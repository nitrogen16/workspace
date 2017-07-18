package Example2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

public class AddingFileToArchive {
	public static void main(String[] args) throws IOException {
		String fileName = args[0];
		String pathToZip = args[1];
		Map<String, byte[]> map = new HashMap<>();

		ZipFile zipFile = new ZipFile(pathToZip);
		Enumeration<? extends ZipEntry> entries = zipFile.entries();
		while (entries.hasMoreElements()) {
			ZipEntry zipEntry = entries.nextElement();
			if (!zipEntry.isDirectory()) {
				InputStream inputStream = zipFile.getInputStream(zipEntry);
				byte[] buffer = new byte[inputStream.available()];
				inputStream.read(buffer);
				map.put(zipEntry.getName(), buffer);
				inputStream.close();
			}
		}

		ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(pathToZip));
		Path newPath = Paths.get(fileName);
		String newFileName = newPath.getFileName().toString();
		for (Map.Entry<String, byte[]> pair : map.entrySet()) {
			if (!pair.getKey().equals(newFileName) && !pair.getKey().equals("new/" + newFileName)) {
				zipOutputStream.putNextEntry(new ZipEntry(pair.getKey()));
				zipOutputStream.write(pair.getValue());
				zipOutputStream.closeEntry();
			}
		}
		//zipOutputStream.putNextEntry(new ZipEntry("new/" + newFileName));
		Files.copy(newPath, zipOutputStream);
		zipOutputStream.close();
	}
}
// C:\\Users\\Viachaslau_Amelin\\Desktop\\Examples
