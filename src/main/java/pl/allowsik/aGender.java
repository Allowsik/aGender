package pl.allowsik;


import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class aGender extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        this.getCommand("gender").setExecutor(new Plec());
    }

}
