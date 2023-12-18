package cn.paper_card.player_title.api;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.UUID;

@SuppressWarnings("unused")
public interface PlayerTitleService {
    void addTitle(@NotNull String key, @NotNull String content) throws Exception;

    boolean removeTitle(@NotNull String key) throws Exception;

    @Nullable TitleInfo queryByKey(@NotNull String key) throws Exception;

    @NotNull TitleInfo addPlayerTitle(@NotNull PlayerTitleInfo info) throws Exception;

    void removePlayerTitle(@NotNull String key, @NotNull UUID playerId) throws Exception;

    @Nullable PlayerTitleInfoInUse queryOnePlayerTitleInUse(@NotNull UUID uuid) throws Exception;

    void queryPlayerTitleByPage(@NotNull UUID uuid, int limit, int offset) throws Exception;
}
