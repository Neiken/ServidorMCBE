package plugin;

import cn.nukkit.plugin.PluginBase;
import cn.nukkit.command.Command;
import cn.nukkit.utils.TextFormat;

//import plugin.commands.*;

public class plugin extends PluginBase
{
  @Override
  public void onEnable()
  {
    getLogger().info(TextFormat.GREEN + "Plugin Enabled");
  }

  void command_register(String name, Command command)
  {
    getServer().getCommandMap().register(name, command);
  }
}
