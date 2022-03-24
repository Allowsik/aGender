package pl.allowsik;

import net.kyori.adventure.text.Component;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public class Plec implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command cmd, @NotNull String s, String[] args) {
        if (args.length == 1) {
            if (args[0].equalsIgnoreCase("female") || args[0].equalsIgnoreCase("male")){
                boolean isMale = args[0].equalsIgnoreCase("male");
                String gender = (isMale ? "&bMale" : "&dFemale");
                sender.sendMessage(Component.text(ChatColor.translateAlternateColorCodes('&', "&x&f&f&0&0&f&fGENDER &cSuccessfully set your gender to: &f " + gender)));
            } else {
                sender.sendMessage(Component.text(ChatColor.translateAlternateColorCodes('&', "&x&f&f&0&0&f&fGENDER &cCorrect usage: /gender <male/female>")));
            }
        } else {
            sender.sendMessage(Component.text(ChatColor.translateAlternateColorCodes('&', "&x&f&f&0&0&f&fGENDER &cCorrect usage: /gender <man/female>")));
        }
        return false;
    }
}
