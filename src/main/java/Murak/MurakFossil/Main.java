/* im beginner
 *  and i also not good at English
 *  i hope u can enjoy it
 *  ill change this code when i got more knowledge about java 
 */

package Murak.MurakFossil;

import Murak.MurakFossil.Events.Iron;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public final class Main extends JavaPlugin {

    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    LocalDateTime now = LocalDateTime.now();

    @Override
    public void onEnable() {
        Bukkit.getLogger().info(dtf.format(now) + "Enabled");
        getCommand("today").setExecutor(new Murak.MurakFossil.Commands.GetTime());
        getServer().getPluginManager().registerEvents(new Iron(), this);

    }

    @Override
    public void onDisable() {
        Bukkit.getLogger().info(dtf.format(now) + "Disabled");
    }
}
