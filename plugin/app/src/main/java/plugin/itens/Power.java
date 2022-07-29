package plugin.itens;

import cn.nukkit.item.Item;
import cn.nukkit.utils.TextFormat;

public class Power extends Item
{
  public Power()
  {
    super(521, 0, 1, "Laser Power");

    String lore[] =
    {
      "Laser Power",
      "From " + TextFormat.RED + "Cuphead"
    };
  }
}
