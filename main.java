package me.diamondgear1.test2

public class Main extends JavaPlugin, Implements Listener {

public void RegisterManager() {
PluginManager pm = getServer().registerEvents();

pm.registerEvents(new test3(), this);

}

public void onEnable() {
RegisterManager();


}


}
