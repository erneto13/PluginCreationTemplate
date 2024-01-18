package pct.erneto1307;

import org.bukkit.Bukkit;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;
import pct.erneto1307.Utils.MessageUtils;

public class PluginCreationTemplate extends JavaPlugin {

    // Variables, constants, constructors
    private final PluginDescriptionFile file = getDescription();
    private final String pluginVersion = file.getVersion();

    public static String pluginPrefix = "&8[&aPluginCreationTemplate&8] ";
    public void onEnable(){
        Bukkit.getConsoleSender().sendMessage(MessageUtils.getColoredMessage
                (pluginPrefix + "#ea3630PluginCreationTemplate has been enabled correctly. erneto1307" +
                        "Official Plugin. v" + pluginVersion));
    }

    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage(MessageUtils.getColoredMessage
                (pluginPrefix + "#ea3630PluginCreationTemplate has been disabled correctly. erneto1307" +
                        "Official Plugin. v" + pluginVersion));
    }
}
