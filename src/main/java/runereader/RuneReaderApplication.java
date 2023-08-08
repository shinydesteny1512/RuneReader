package runereader;

import runereader.dto.Rune;
import runereader.service.RuneReaderService;

import java.util.List;

public class RuneReaderApplication {
    public static void main(String[] args) {
        RuneReaderService runeReaderService = new RuneReaderService();
        List<Rune> runeList = runeReaderService.createRuneObjects();

        for (Rune rune : runeList) {
            System.out.println("RuneOutput: " + rune.getRuneId());
        }
    }
}
