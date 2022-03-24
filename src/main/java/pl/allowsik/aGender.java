package pl.allowsik;


import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class aGender extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Objects.requireNonNull(this.getCommand("gender")).setExecutor(new Plec());
    }

}
