package cn.paper_card.player_title.api.exception;

import org.jetbrains.annotations.NotNull;

@SuppressWarnings("unused")
public class NoSuchTitleException extends Exception {

    public NoSuchTitleException(@NotNull String message) {
        super(message);
    }
}
