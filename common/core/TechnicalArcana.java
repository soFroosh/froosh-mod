package core;

import render.RenderFibreExtractor;
import render.RenderID;
import tile.TileFibreExtractor;
import block.BlockBase;
import block.BlockFibreExtractor;
import block.BlockID;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.client.MinecraftForgeClient;
import network.PacketBase;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
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
	
	public static CreativeTabs customTab = new TACreativeTab("taTab");
	
	public static Block blockFibreExtractor;
	
	@Init
	public void init(FMLInitializationEvent evt){
		
		//Init Blocks
		blockFibreExtractor = new BlockFibreExtractor(BlockID.blockFibreExtractorID);
		
		//PreLoad Textures
		MinecraftForgeClient.preloadTexture(Strings.FIBRE_EXTRACTOR_TEXTURE_FILE);
		
		//Registrys
		
		ClientRegistry.bindTileEntitySpecialRenderer(TileFibreExtractor.class, new RenderFibreExtractor());
		
		GameRegistry.registerBlock(blockFibreExtractor, "blockFibreExtractor");

		LanguageRegistry.addName(blockFibreExtractor, "FibreExtractor");
		
		//Custom Tab
		LanguageRegistry.instance().addStringLocalization("itemGroup.taTab", "en_US", "Technical Arcana");
	}
	
	@PreInit
	public void preInit(FMLPreInitializationEvent evt){
		
	}
	
	@PostInit
	public void postInit(FMLPostInitializationEvent evt){
		
	}
	
}
