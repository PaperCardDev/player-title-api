package cn.paper_card.player_title.api;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.UUID;

@SuppressWarnings("unused")
public interface PlayerTitleService {
    void addTitle(@NotNull String key, @NotNull String content) throws Exception;

    boolean removeTitle(@NotNull String key) throws Exception;

    /**
     * 添加或更新称号
     *
     * @param key     称号的key
     * @param content 称号的内容（格式代码）
     * @return 添加返回true，更新返回false
     * @throws Exception 操作失败抛出异常
     */
    boolean addOrUpdate(@NotNull String key, @NotNull String content) throws Exception;

    @Nullable TitleInfo queryByKey(@NotNull String key) throws Exception;

    @NotNull TitleInfo addPlayerTitle(@NotNull PlayerTitleInfo info) throws Exception;

    void removePlayerTitle(@NotNull String key, @NotNull UUID playerId) throws Exception;

    boolean addOrUpdatePlayerTitle(@NotNull PlayerTitleInfo info) throws Exception;

    @Nullable PlayerTitleInfoInUse queryOnePlayerTitleInUse(@NotNull UUID uuid) throws Exception;

    void queryPlayerTitleByPage(@NotNull UUID uuid, int limit, int offset) throws Exception;
}
