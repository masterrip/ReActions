package me.fromgate.reactions.event;

import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

/**
 * Created by MaxDikiy on 2017-09-04.
 */
public class PickupItemEvent extends RAEvent {
    private ItemStack itemStack;
    private Double pickupDelay;

    public PickupItemEvent(Player p, Item item, double pickupDelay) {
        super(p);
        this.itemStack = item.getItemStack();
        this.pickupDelay = pickupDelay;
    }

    public ItemStack getItemStack() {
        return this.itemStack;
    }

    public void setItemStack(ItemStack itemStack) {
        this.itemStack = itemStack;
    }

    public Double getPickupDelay() {
        return this.pickupDelay;
    }

    public void setPickupDelay(Double pickupDelay) {
        this.pickupDelay = pickupDelay;
    }

}
