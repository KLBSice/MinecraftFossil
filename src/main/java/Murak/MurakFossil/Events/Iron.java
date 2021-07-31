package Murak.MurakFossil.Events;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Collections;
import java.util.Random;


public class Iron implements Listener {

    Random rand = new Random();

    @EventHandler
    public void onBreak(BlockBreakEvent event) {
        event.getPlayer();
        Player p = event.getPlayer();
        Block b = (Block) event.getBlock();
        Material material = p.getInventory().getItemInMainHand().getType();
        if(material==Material.IRON_PICKAXE||material==Material.DIAMOND_PICKAXE) {
            if(b.getType()==Material.STONE) {
                int n = rand.nextInt(100000);
                n += 1;
                if(1 < n && n < 12) {
                    p.sendMessage(String.valueOf(n));
                    int i = rand.nextInt(20);
                    i += 1;
                    if(i >= 1 && i <= 10 ) {
                        ItemStack item = new ItemStack(Material.NAUTILUS_SHELL, 1);
                        ItemMeta meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.GREEN + "Common Fossil");
                        meta.setLore(Collections.singletonList(ChatColor.WHITE + "it's just a common fossil throw it"));
                        item.setItemMeta(meta);
                        p.getInventory().addItem(item);
                    } else {
                        if (i > 10 && i < 16 ) {
                            ItemStack item = new ItemStack(Material.NAUTILUS_SHELL, 1);
                            ItemMeta meta = item.getItemMeta();
                            meta.setDisplayName(ChatColor.LIGHT_PURPLE + "Rare Fossil");
                            meta.setLore(Collections.singletonList(ChatColor.GREEN + "get this is harder than get common fossil"));
                            item.setItemMeta(meta);
                            p.getInventory().addItem(item);
                        } else if (i >= 16 && i < 18) {
                            ItemStack item = new ItemStack(Material.NAUTILUS_SHELL, 1);
                            ItemMeta meta = item.getItemMeta();
                            meta.setDisplayName(ChatColor.GOLD + "epic fossil");
                            meta.setLore(Collections.singletonList(ChatColor.YELLOW + "this owner can feeling the power of the void... Adun Toridas"));
                            item.setItemMeta(meta);
                            p.getInventory().addItem(item);
                        } else if (i >= 19 && i < 20) {
                            ItemStack item = new ItemStack(Material.NAUTILUS_SHELL, 1);
                            ItemMeta meta = item.getItemMeta();
                            meta.setDisplayName(ChatColor.YELLOW + "§4§lre§6§lgen§e§lda§3§lry §a§lFos§1§lsil");
                            meta.setLore(Collections.singletonList(ChatColor.YELLOW + "oh it's just a legendary fossil throw it bitch"));
                            item.setItemMeta(meta);
                            p.getInventory().addItem(item);
                        }
                    }
                }
            }
        }
        if(material==Material.IRON_PICKAXE||material==Material.DIAMOND_PICKAXE) {
            if(b.getType()==Material.COAL_ORE) {
                int n = rand.nextInt(10000);
                n += 1;
                if(1 < n && n < 420) {
                    int i = rand.nextInt(20);
                    i += 1;
                    if(i >= 1 && i <= 10 ) {
                        ItemStack item = new ItemStack(Material.NAUTILUS_SHELL, 1);
                        ItemMeta meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.GREEN + "Common Fossil");
                        meta.setLore(Collections.singletonList(ChatColor.WHITE + "it's just a common fossil throw it"));
                        item.setItemMeta(meta);
                        p.getInventory().addItem(item);
                    } else {
                        if (i > 10 && i < 16 ) {
                            ItemStack item = new ItemStack(Material.NAUTILUS_SHELL, 1);
                            ItemMeta meta = item.getItemMeta();
                            meta.setDisplayName(ChatColor.LIGHT_PURPLE + "Rare Fossil");
                            meta.setLore(Collections.singletonList(ChatColor.GREEN + "get this is harder than get common fossil"));
                            item.setItemMeta(meta);
                            p.getInventory().addItem(item);
                        } else if (i >= 16 && i < 18) {
                            ItemStack item = new ItemStack(Material.NAUTILUS_SHELL, 1);
                            ItemMeta meta = item.getItemMeta();
                            meta.setDisplayName(ChatColor.GOLD + "Epic Fossil");
                            meta.setLore(Collections.singletonList(ChatColor.YELLOW + "this owner can feeling the power of the void... Adun Toridas"));
                            item.setItemMeta(meta);
                            p.getInventory().addItem(item);
                        } else if (i >= 19 && i < 20) {
                            ItemStack item = new ItemStack(Material.NAUTILUS_SHELL, 1);
                            ItemMeta meta = item.getItemMeta();
                            meta.setDisplayName(ChatColor.YELLOW + "§4§lre§6§lgen§e§lda§3§lry §a§lFos§1§lsil");
                            meta.setLore(Collections.singletonList(ChatColor.YELLOW + "oh it's just a legendary fossil throw it bitch"));
                            item.setItemMeta(meta);
                            p.getInventory().addItem(item);
                        }
                    }
                }
            }
        }
        if(material==Material.IRON_PICKAXE||material==Material.DIAMOND_PICKAXE) {
            if(b.getType()==Material.REDSTONE_ORE) {
                int n = rand.nextInt(10000);
                n += 1;
                if(1 < n && n < 96) {
                    int i = rand.nextInt(20);
                    i += 1;
                    if(i >= 1 && i <= 10 ) {
                        ItemStack item = new ItemStack(Material.NAUTILUS_SHELL, 1);
                        ItemMeta meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.GREEN + "Common Fossil");
                        meta.setLore(Collections.singletonList(ChatColor.WHITE + "it's just a common fossil throw it"));
                        item.setItemMeta(meta);
                        p.getInventory().addItem(item);
                    } else {
                        if (i > 10 && i < 16 ) {
                            ItemStack item = new ItemStack(Material.NAUTILUS_SHELL, 1);
                            ItemMeta meta = item.getItemMeta();
                            meta.setDisplayName(ChatColor.LIGHT_PURPLE + "Rare Fossil");
                            meta.setLore(Collections.singletonList(ChatColor.GREEN + "get this is harder than get common fossil"));
                            item.setItemMeta(meta);
                            p.getInventory().addItem(item);
                        } else if (i >= 16 && i < 18) {
                            ItemStack item = new ItemStack(Material.NAUTILUS_SHELL, 1);
                            ItemMeta meta = item.getItemMeta();
                            meta.setDisplayName(ChatColor.GOLD + "Epic Fossil");
                            meta.setLore(Collections.singletonList(ChatColor.YELLOW + "this owner can feeling the power of the void... Adun Toridas"));
                            item.setItemMeta(meta);
                            p.getInventory().addItem(item);
                        } else if (i >= 19 && i < 20) {
                            ItemStack item = new ItemStack(Material.NAUTILUS_SHELL, 1);
                            ItemMeta meta = item.getItemMeta();
                            meta.setDisplayName(ChatColor.YELLOW + "§4§lre§6§lgen§e§lda§3§lry §a§lFos§1§lsil");
                            meta.setLore(Collections.singletonList(ChatColor.YELLOW + "oh it's just a legendary fossil throw it bitch"));
                            item.setItemMeta(meta);
                            p.getInventory().addItem(item);
                        }
                    }
                }
            }
        }
        if(material==Material.IRON_PICKAXE||material==Material.DIAMOND_PICKAXE) {
            if(b.getType()==Material.LAPIS_ORE) {
                int n = rand.nextInt(100);
                n += 1;
                if(1 < n && n < 12) {
                    int i = rand.nextInt(20);
                    i += 1;
                    if(i >= 1 && i <= 10 ) {
                        ItemStack item = new ItemStack(Material.NAUTILUS_SHELL, 1);
                        ItemMeta meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.GREEN + "Common Fossil");
                        meta.setLore(Collections.singletonList(ChatColor.WHITE + "it's just a common fossil throw it"));
                        item.setItemMeta(meta);
                        p.getInventory().addItem(item);
                    } else {
                        if (i > 10 && i < 16 ) {
                            ItemStack item = new ItemStack(Material.NAUTILUS_SHELL, 1);
                            ItemMeta meta = item.getItemMeta();
                            meta.setDisplayName(ChatColor.LIGHT_PURPLE + "Rare Fossil");
                            meta.setLore(Collections.singletonList(ChatColor.GREEN + "get this is harder than get common fossil"));
                            item.setItemMeta(meta);
                            p.getInventory().addItem(item);
                        } else if (i >= 16 && i < 18) {
                            ItemStack item = new ItemStack(Material.NAUTILUS_SHELL, 1);
                            ItemMeta meta = item.getItemMeta();
                            meta.setDisplayName(ChatColor.GOLD + "Epic Fossil");
                            meta.setLore(Collections.singletonList(ChatColor.YELLOW + "this owner can feeling the power of the void... Adun Toridas"));
                            item.setItemMeta(meta);
                            p.getInventory().addItem(item);
                        } else if (i >= 19 && i < 20) {
                            ItemStack item = new ItemStack(Material.NAUTILUS_SHELL, 1);
                            ItemMeta meta = item.getItemMeta();
                            meta.setDisplayName(ChatColor.YELLOW + "§4§lre§6§lgen§e§lda§3§lry §a§lFos§1§lsil");
                            meta.setLore(Collections.singletonList(ChatColor.YELLOW + "oh it's just a legendary fossil throw it bitch"));
                            item.setItemMeta(meta);
                            p.getInventory().addItem(item);
                        }
                    }
                }
            }
        }
        if (material == Material.DIAMOND_PICKAXE || material == Material.IRON_PICKAXE) {
            if (b.getType() == Material.DIAMOND_ORE) {
                int n = rand.nextInt(10);
                n += 1;
                if (n == 1) {
                    int i = rand.nextInt(20);
                    i += 1;
                    if (i >= 1 && i <= 10) {
                        ItemStack item = new ItemStack(Material.NAUTILUS_SHELL, 1);
                        ItemMeta meta = item.getItemMeta();
                        meta.setDisplayName(ChatColor.GREEN + "Common Fossil");
                        meta.setLore(Collections.singletonList(ChatColor.WHITE + "it's just a common fossil throw it"));
                        item.setItemMeta(meta);
                        p.getInventory().addItem(item);
                    } else {
                        if (i > 10 && i < 16) {
                            ItemStack item = new ItemStack(Material.NAUTILUS_SHELL, 1);
                            ItemMeta meta = item.getItemMeta();
                            meta.setDisplayName(ChatColor.LIGHT_PURPLE + "Rare Fossil");
                            meta.setLore(
                                    Collections.singletonList(ChatColor.GREEN + "get this is harder than get common fossil"));
                            item.setItemMeta(meta);
                            p.getInventory().addItem(item);
                        } else if (i >= 16 && i < 18) {
                            ItemStack item = new ItemStack(Material.NAUTILUS_SHELL, 1);
                            ItemMeta meta = item.getItemMeta();
                            meta.setDisplayName(ChatColor.GOLD + "Epic Fossil");
                            meta.setLore(
                                    Collections.singletonList(ChatColor.YELLOW + "this owner can feeling the power of the void... Adun Toridas"));
                            item.setItemMeta(meta);
                            p.getInventory().addItem(item);
                        } else if (i >= 19 && i < 20) {
                            ItemStack item = new ItemStack(Material.NAUTILUS_SHELL, 1);
                            ItemMeta meta = item.getItemMeta();
                            meta.setDisplayName(ChatColor.YELLOW + "§4§lre§6§lgen§e§lda§3§lry §a§lFos§1§lsil");
                            meta.setLore(Collections.singletonList(
                                    ChatColor.YELLOW + "oh it's just a legendary fossil throw it bitch"));
                            item.setItemMeta(meta);
                            p.getInventory().addItem(item);
                        }
                    }
                }
            }
        }
    }
}
