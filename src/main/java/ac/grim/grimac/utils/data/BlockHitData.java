package ac.grim.grimac.utils.data;

import com.github.retrooper.packetevents.protocol.world.BlockFace;
import com.github.retrooper.packetevents.protocol.world.states.WrappedBlockState;
import com.github.retrooper.packetevents.util.Vector3d;
import com.github.retrooper.packetevents.util.Vector3i;
import lombok.Getter;
import lombok.ToString;
import org.bukkit.util.Vector;

@Getter
@ToString
public class BlockHitData extends HitData {
    Vector3i position;
    WrappedBlockState state;
    BlockFace closestDirection;

    public BlockHitData(Vector3i position, Vector blockHitLocation, BlockFace closestDirection, WrappedBlockState state) {
        super(blockHitLocation);
        this.position = position;
        this.closestDirection = closestDirection;
        this.state = state;
    }

    public Vector3d getRelativeBlockHitLocation() {
        return new Vector3d(blockHitLocation.getX() - position.getX(), blockHitLocation.getY() - position.getY(), blockHitLocation.getZ() - position.getZ());
    }
}
