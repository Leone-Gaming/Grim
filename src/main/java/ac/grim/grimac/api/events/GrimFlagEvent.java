package ac.grim.grimac.api.events;

import ac.grim.grimac.api.AbstractCheck;
import ac.grim.grimac.api.GrimUser;
import lombok.Getter;
import org.jetbrains.annotations.Nullable;

@Getter
public class GrimFlagEvent extends FlagEvent {

    private final @Nullable String verbose;

    public GrimFlagEvent(GrimUser grimUser, AbstractCheck check, @Nullable String verbose) {
        super(grimUser, check);

        this.verbose = verbose;
    }

}
