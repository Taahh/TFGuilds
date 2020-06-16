package totalfreedom.tfguilds.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import totalfreedom.tfguilds.util.GBase;
import totalfreedom.tfguilds.util.GUtil;

public class TfGuildsCommand extends GBase implements CommandExecutor
{
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args)
    {
        sender.sendMessage(GUtil.color("&aTFGuilds &2is a plugin which allows for players to make their own guilds, providing guild chat and guild teleportation."));
        sender.sendMessage(String.format(GUtil.color("&2Version &av%s"), plugin.getDescription().getVersion()));
        sender.sendMessage(GUtil.color("&2Developed by &aspeednt & supernt"));
        return true;
    }
}
