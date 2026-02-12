package gay.marie_the.themetip;

import folk.sisby.kaleido.api.WrappedConfig;
import folk.sisby.kaleido.lib.quiltconfig.api.annotations.Comment;
import folk.sisby.kaleido.lib.quiltconfig.api.annotations.Matches;

public class ThemetipConfig extends WrappedConfig {
    public static int asColor(String argb) {
        try {
            return Integer.parseUnsignedInt(argb.replace("#", ""), 16);
        } catch (NumberFormatException e) {
            return 0xFF_FFFFFF;
        }
    }

    @Comment("Enable tooltip border gradient.")
    public boolean gradient = true;

    @Comment("Enables the extra pixel on the outside of the border.")
    public boolean thickEdges = true;

    @Matches("#[0-9A-Fa-f]{8}")
    @Comment("The primary color of the border gradient")
    @Comment("#AARRGGBB, in hex")
    public String primaryColor = "#505000FF";

    @Matches("#[0-9A-Fa-f]{8}")
    @Comment("The secondary color of the border gradient")
    @Comment("#AARRGGBB, in hex")
    public String secondaryColor = "#5028007F";

    @Matches("#[0-9A-Fa-f]{8}")
    @Comment("The color of the tooltip background")
    @Comment("#AARRGGBB, in hex")
    public String backgroundColor = "#F0100010";

    @Comment("Lets Marie know that you are really awesome!")
    public boolean importantSetting = true;
}
