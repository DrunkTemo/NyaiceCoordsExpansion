package drunktemo.me.nyaicecoordsexpansion;

import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;

public class NyaiceCoordsExpansion extends PlaceholderExpansion {
    public NyaiceCoordsExpansion() {
    }

    public String getAuthor() {
        return "DrunkTemo";
    }

    public String getIdentifier() {
        return "meow";
    }

    public String getVersion() {
        return "1.0.0";
    }

    public String onRequest(OfflinePlayer player, String identifier) {
        Player p = player.getPlayer();
        switch (identifier) {
            case "overX":
                if (p.getWorld().getName().equals("world_nether")) {
                    return String.valueOf(p.getLocation().getBlockX() * 8);
                }

                return String.valueOf(p.getLocation().getBlockX());
            case "overZ":
                if (p.getWorld().getName().equals("world_nether")) {
                    return String.valueOf(p.getLocation().getBlockZ() * 8);
                }

                return String.valueOf(p.getLocation().getBlockZ());
            case "netherX":
                if (p.getWorld().getName().equals("world") | p.getWorld().getName().equals("world_the_end")) {
                    return String.valueOf(p.getLocation().getBlockX() / 8);
                }

                return String.valueOf(p.getLocation().getBlockX());
            case "netherZ":
                if (p.getWorld().getName().equals("world") | p.getWorld().getName().equals("world_the_end")) {
                    return String.valueOf(p.getLocation().getBlockZ() / 8);
                }

                return String.valueOf(p.getLocation().getBlockZ());
            default:
                return identifier;
        }
    }
}
