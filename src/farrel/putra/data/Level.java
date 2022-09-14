package farrel.putra.data;

import farrel.putra.annotation.Fancy;

@Fancy(name = "Level", tags = {"application", "java"})
public enum Level {
    STANDARD("Standard leve"),
    PREMIUM("Premium level"),
    VIP("VIP level");

    private String description;

    Level(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
