package cn.paper_card.player_title.api;

import java.util.UUID;

public record PlayerTitleInfo(
        UUID uuid,
        String key,
        boolean inUse,
        long createTime,
        long validTime
) {
}
