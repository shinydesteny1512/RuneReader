package runereader.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.util.List;

@Getter
public class Rune {

    @JsonProperty("rune_id")
    private Integer runeId;
    @JsonProperty("wizard_id")
    private Integer wizard_id;
    @JsonProperty("occupied_type")
    private Integer occupied_type;
    @JsonProperty("occupied_id")
    private Integer occupied_id;
    @JsonProperty("slot_no")
    private Integer slot_no;
    @JsonProperty("rank")
    private Integer rank;
    @JsonProperty("class")
    private Integer runeClass;
    @JsonProperty("set_id")
    private Integer set_id;
    @JsonProperty("upgrade_limit")
    private Integer upgrade_limit;
    @JsonProperty("upgrade_curr")
    private Integer upgrade_curr;
    @JsonProperty("base_value")
    private Integer base_value;
    @JsonProperty("sell_value")
    private Integer sell_value;
    @JsonProperty("pri_eff")
    private List<Integer> pri_eff;
    @JsonProperty("prefix_eff")
    private List<Integer> prefix_eff;
    @JsonProperty("sec_eff")
    private List<Integer> sec_eff;
    @JsonProperty("extra")
    private List<Integer> extra;

}
