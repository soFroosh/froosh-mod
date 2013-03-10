package core;

import java.io.File;

import item.ItemID;
import item.ItemWorldFibre;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.Property;
import network.PacketBase;
import render.RenderFibreExtractor;
import tile.TileFibreExtractor;
import block.BlockFibreExtractor;
import block.BlockID;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;


@Mod(name = Strings.MOD_NAME, modid = Strings.MOD_ID, version = Strings.MOD_VERSION )
@NetworkMod(clientSideRequired = true, serverSideRequired = false, packetHandler = PacketBase.class, channels = Strings.NETWORK_CHANNELS)
public class TechnicalArcana {

	@Instance("TechnicalArcana")
	public static TechnicalArcana instatnce;
	
	public static CreativeTabs blockTab = new TACreativeTabBlocks("taTabBlocks");
	public static CreativeTabs itemTab = new TACreativeTabItems("taTabItems");
	
	//Blocks
	public static Block blockFibreExtractor;
	
	//Items
	public static Item itemWorldFibre;
	
	@Init
	public void init(FMLInitializationEvent evt){
		
		//Init Blocks
		blockFibreExtractor = new BlockFibreExtractor(BlockID.blockFibreExtractorID);
		
		//Init Items
		itemWorldFibre = new ItemWorldFibre(ItemID.worldFibreID);
		
		//PreLoad Textures
		MinecraftForgeClient.preloadTexture(Strings.FIBRE_EXTRACTOR_TEXTURE_FILE);
		
		MinecraftForgeClient.preloadTexture(Strings.ITEM_TEXTURE_FILE);
		MinecraftForgeClient.preloadTexture(Strings.BLOCK_TEXTURE_FILE);
		
		
		/** Registrys */
		
		//Client Tile Entity Registry
		ClientRegistry.bindTileEntitySpecialRenderer(TileFibreExtractor.class, new RenderFibreExtractor());
		
		//Block Game Registry
		GameRegistry.registerBlock(blockFibreExtractor, "blockFibreExtractor");
		
		//Block Language Registry
		LanguageRegistry.addName(blockFibreExtractor, "FibreExtractor");
		
		//Item Game Registrys
		GameRegistry.registerItem(itemWorldFibre, "itemWorldFibre");
		
		//Item Language Registrys
		LanguageRegistry.addName(itemWorldFibre, "World Fibre");
		
		//Custom Tab
		LanguageRegistry.instance().addStringLocalization("itemGroup.blockTab", "en_US", "Technical Arcana Blocks");
		LanguageRegistry.instance().addStringLocalization("itemGroup.itemTab", "en_US", "Technical Arcana Items");
	}
	
	@PreInit
	public void preInit(FMLPreInitializationEvent evt){
		
		Configuration config = new Configuration(new File(Minecraft.getMinecraftDir(), "/config/TechnicalArcana.cfg"));
		config.load();
		
		Property prop = config.getBlock("fibreExtractorBlockID", BlockID.blockFibreExtractorID);
		prop.comment = "The Block ID for the FibreExtractor";
		BlockID.blockFibreExtractorID = prop.getInt();
		
		prop = config.getItem("itemWorldFibreID", ItemID.worldFibreID);
		prop.comment = "The Item ID for the WorldFibre";
		ItemID.worldFibreID = prop.getInt();
		
		config.save();
		
	}
	
	@PostInit
	public void postInit(FMLPostInitializationEvent evt){
		
	}
	
}
