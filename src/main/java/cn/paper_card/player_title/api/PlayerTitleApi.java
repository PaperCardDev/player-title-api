package cn.paper_card.player_title.api;

import org.jetbrains.annotations.NotNull;

@SuppressWarnings("unused")
public interface PlayerTitleApi {
    @NotNull PlayerTitleService getPlayerTitleService();

    // 返回Component
    @NotNull Object parseTitleContent(@NotNull String content) throws Exception;
}
