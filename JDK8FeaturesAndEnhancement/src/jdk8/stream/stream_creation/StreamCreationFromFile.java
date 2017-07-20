package jdk8.stream.stream_creation;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamCreationFromFile {
	public static void main(String[] args) throws URISyntaxException, IOException {
		URL resource = StreamCreationFromFile.class.getClassLoader().getResource("jdk8/stream/stream_creation/test.txt");
        if (resource != null) {
            try (Stream<String> lines = Files.lines(Paths.get(resource.toURI()))) {
                lines.forEach(System.out::println);
            }
        }
        
        Path dir = Paths.get(".");
        System.out.printf("%nThe file tree for %s%n", dir.toAbsolutePath());
        try (Stream<Path> fileTree = Files.walk(dir)) {
          fileTree.forEach(System.out::println);
        } 
	}
}
