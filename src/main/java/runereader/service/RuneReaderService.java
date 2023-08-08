package runereader.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import runereader.dto.Rune;
import runereader.dto.Runes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class RuneReaderService {

    private String readdata;

    private ObjectMapper objectMapper;

    public RuneReaderService() {
        init();
    }

    private void init() {
        try {
            readdata = readdata();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Rune> createRuneObjects() {
        objectMapper = new ObjectMapper();
        Runes runeList;
        try {
            runeList = objectMapper.readValue(readdata, Runes.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

        return runeList.getRuneArray();
    }

    public String readdata() throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            File file = new File("src/main/resources/shinydesteny-4504846.json");
            System.out.println("Readin: " + file.getAbsolutePath());
            fileReader = new FileReader(file);
            System.out.println("FileReader initialize: " + fileReader.toString());
            bufferedReader = new BufferedReader(fileReader);
            System.out.println("BufferedReader initialize: " + bufferedReader.toString());


            int counter = 1;
            String line;
            while ((line = bufferedReader.readLine()) != null) {
//                System.out.println(counter + " Line  initialize: " + bufferedReader.readLine());
                if (!line.equalsIgnoreCase("null")) {
                    stringBuilder.append(line);
                }
                counter++;
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            assert fileReader != null;
            fileReader.close();
            assert bufferedReader != null;
            bufferedReader.close();
        }

        return stringBuilder.toString();
    }
}
