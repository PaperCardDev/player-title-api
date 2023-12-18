package cn.paper_card.player_title.api;

import java.util.UUID;

public record PlayerTitleInfoInUse(
        UUID uuid,
        String key,
        String content,
        long time // 剩余时间
) {
}
