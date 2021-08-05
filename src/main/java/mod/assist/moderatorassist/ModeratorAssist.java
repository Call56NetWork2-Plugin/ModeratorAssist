package mod.assist.moderatorassist;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class ModeratorAssist extends JavaPlugin {

    @Override
    public void onLoad() {
        getLogger().info("ModeratorAssistがロードされました");
    }

    @Override
    public void onEnable() {
        getLogger().info("§aModeratorAssistが有効になりました");
    }

    @Override
    public void onDisable() {
        getLogger().warning("§eModeratorAssistが無効になりました");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(command.getName().equalsIgnoreCase("gmc")) {
            Player player = (Player) sender;
            player.setGameMode(GameMode.CREATIVE);
            player.sendMessage("§aゲームモードをクリエイティブに設定しました");
            return true;
        }
        if(command.getName().equalsIgnoreCase("gms")) {
            Player player = (Player) sender;
            player.setGameMode(GameMode.SURVIVAL);
            player.sendMessage("§aゲームモードをサバイバルに設定しました");
            return true;
        }
        return false;
    }
}
