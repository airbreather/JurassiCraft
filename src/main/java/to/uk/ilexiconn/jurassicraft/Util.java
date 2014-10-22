package to.uk.ilexiconn.jurassicraft;

import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import to.uk.ilexiconn.jurassicraft.entity.Dinosaur;
import to.uk.ilexiconn.jurassicraft.entity.JsonEntityParser;
import to.uk.ilexiconn.jurassicraft.item.ItemDNA;
import to.uk.ilexiconn.jurassicraft.item.ItemDinoEgg;
import to.uk.ilexiconn.jurassicraft.item.ItemMeat;
import to.uk.ilexiconn.jurassicraft.proxy.ServerProxy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @deprecated Start using LLib's Content Handler System instead
 */
@Deprecated
public class Util
{
    /**
     * Stuff
     */
    private static final JsonEntityParser entityParser = new JsonEntityParser();
    @SidedProxy(clientSide = "to.uk.ilexiconn.jurassicraft.proxy.ClientProxy", serverSide = "to.uk.ilexiconn.jurassicraft.proxy.ServerProxy")
    public static ServerProxy proxy;
    private static Item[] items = new Item[512];
    private static ArrayList<ItemDNA> dnas = new ArrayList<ItemDNA>();
    private static ArrayList<ItemDinoEgg> eggs = new ArrayList<ItemDinoEgg>();
    private static Map<Dinosaur, Class<?>> dinos = new HashMap<Dinosaur, Class<?>>();
    private static ArrayList<ItemMeat> meat = new ArrayList<ItemMeat>();

    public static int entityId;

    /**
     * Getters
     */

    public static Class<?> getDinoClass(String dinoName)
    {
        for (Map.Entry<Dinosaur, Class<?>> dino : dinos.entrySet())
        {
            if (dino.getKey().creatureName.equals(dinoName))
            {
                return dino.getValue();
            }
        }

        return null;
    }

    public static Item getItem(int id)
    {
        return items[id];
    }

    public static ArrayList<ItemDNA> getDNAArray()
    {
        return dnas;
    }

    public static ArrayList<ItemDinoEgg> getEggArray()
    {
        return eggs;
    }

    public static String getModId()
    {
        return "jurassicraft:";
    }

    public static JsonEntityParser getEntityParser()
    {
        return entityParser;
    }

    public static Map<Dinosaur, Class<?>> getDinos()
    {
        return dinos;
    }

    public static ArrayList<ItemMeat> getDinoMeats()
    {
        return meat;
    }

    public static Item getMeat(int id)
    {
        return meat.get(id);
    }

    /**
     * Adders
     */

    public void addItem(int id, Item item)
    {
        if (id != -1) items[id] = item;
        GameRegistry.registerItem(item, item.getUnlocalizedName());
    }

    public void addDNA(String dinoName)
    {
        ItemDNA item = new ItemDNA(dinoName);
        dnas.add(item);
        GameRegistry.registerItem(item, item.getUnlocalizedName());
    }

    public void addMeat(String dinoName)
    {
        ItemMeat item = new ItemMeat(dinoName);
        meat.add(item);
        addItem(-1, item);
    }

    public void addEntity(Dinosaur dino)
    {
        try
        {
            Class entity = Class.forName("to.uk.ilexiconn.jurassicraft.entity.dinosaur.Entity" + dino.creatureName);
            dinos.put(dino, entity);
            entityId = EntityRegistry.findGlobalUniqueEntityId();
            EntityRegistry.registerGlobalEntityID(entity, dino.creatureName, entityId, 0, 0);
            EntityRegistry.registerModEntity(entity, dino.creatureName, entityId, JurassiCraft.instance, 64, 1, true);
            addEgg(dino.creatureName);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void addEgg(final String dinoName)
    {
        ItemDinoEgg egg = new ItemDinoEgg(dinoName);

        eggs.add(egg);

        addItem(-1, egg);
    }

    @SideOnly(Side.CLIENT)
    public void addEntityRenderer(Dinosaur dino)
    {
        try
        {
            RenderLiving renderer = (RenderLiving) Class.forName("to.uk.ilexiconn.jurassicraft.entity.render.Render" + dino.creatureName).getDeclaredConstructor(Dinosaur.class).newInstance(dino);
            Class entity = Class.forName("to.uk.ilexiconn.jurassicraft.entity.dinosaur.Entity" + dino.creatureName);
            proxy.renderEntity(entity, renderer);
        }
        catch (Exception e)
        {

        }
    }

    public static Dinosaur getDinoByID(int id)
    {
        for (Entry<Dinosaur, Class<?>> dino : dinos.entrySet())
        {
            if (dino.getKey().creatureID == id)
            {
                return dino.getKey();
            }
        }

        return null;
    }

    public static int getDinoIDByName(String name)
    {
        for (Entry<Dinosaur, Class<?>> dino : dinos.entrySet())
        {
            if (dino.getKey().creatureName.equals(name))
            {
                return dino.getKey().creatureID;
            }
        }
        return -1;
    }

    public static boolean isFavoriteFood(int id, Item heldItem)
    {
    	ArrayList itemList = getDinoByID(id).favoriteFoodList;
        return !itemList.isEmpty() && itemList.contains(heldItem.getUnlocalizedName());
    }

    public static boolean isRidingItem(int id, Item heldItem)
    {
    	ArrayList itemList = getDinoByID(id).ridingItemList;
        return !itemList.isEmpty() && itemList.contains(heldItem.getUnlocalizedName());
    }
}
