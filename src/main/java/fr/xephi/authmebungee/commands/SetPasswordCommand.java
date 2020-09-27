package fr.xephi.authmebungee.commands;

import ch.jalu.configme.SettingsManager;
import ch.jalu.injector.factory.SingletonStore;
import fr.xephi.authmebungee.config.SettingsDependent;
import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.plugin.Command;
import java.lang.Object
import org.bukkit.event.Event
import org.bukkit.event.player.PlayerEvent
import org.bukkit.event.player.PlayerChatEvent

import javax.inject.Inject;

public class BungeeReloadCommand extends Command {

    private SettingsManager settings;
    private SingletonStore<SettingsDependent> settingsDependentStore;

    @Inject
    public BungeeReloadCommand(SettingsManager settings, SingletonStore<SettingsDependent> settingsDependentStore) {
        super("abreloadproxy", "authmebungee.reload");
        this.settings = settings;
        this.settingsDependentStore = settingsDependentStore;
    }

    @Override
    public void execute(CommandSender commandSender, String[] strings) {
        commandSender.sendMessage(
            new ComponentBuilder("What do you want to set the password to?").color(ChatColor.GREEN).create()
        );
        PlayerChatEvent(Player player, String message)
    }
}
