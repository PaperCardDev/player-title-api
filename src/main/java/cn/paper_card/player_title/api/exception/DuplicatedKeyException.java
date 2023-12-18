package cn.paper_card.player_title.api.exception;


import cn.paper_card.player_title.api.TitleInfo;
import org.jetbrains.annotations.NotNull;

@SuppressWarnings("unused")
public class DuplicatedKeyException extends Exception {
    private final @NotNull TitleInfo titleInfo;

    public DuplicatedKeyException(@NotNull TitleInfo titleInfo, @NotNull String message) {
        super(message);
        this.titleInfo = titleInfo;
    }

    public @NotNull TitleInfo getTitleInfo() {
        return this.titleInfo;
    }
}
