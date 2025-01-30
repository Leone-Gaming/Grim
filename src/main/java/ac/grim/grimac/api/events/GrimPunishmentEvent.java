package ac.grim.grimac.api.events;

import ac.grim.grimac.api.AbstractCheck;
import ac.grim.grimac.api.GrimUser;
import ac.grim.grimac.manager.PunishmentManager;
import lombok.Getter;
import org.jetbrains.annotations.Nullable;

@Getter
public class GrimPunishmentEvent extends FlagEvent {

    private final PunishmentType type;
    private final @Nullable String verbose;
    private final @Nullable PunishmentManager.ParsedCommand command;

    public GrimPunishmentEvent(GrimUser grimUser, AbstractCheck check, PunishmentType type, @Nullable String verbose, PunishmentManager.ParsedCommand command) {
        super(grimUser, check, verbose);

        this.type = type;
        this.verbose = verbose;
        this.command = command;
    }

    public enum PunishmentType {
        ALERT,
        PROXY,
        LOG,
        WEBHOOK,
        COMMAND

    }

}
