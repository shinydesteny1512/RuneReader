package runereader.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.util.List;

@Getter
public class Runes {

    @JsonProperty("runes")
    private List<Rune> runeArray;

}
