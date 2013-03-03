package core;

import net.minecraft.creativetab.CreativeTabs;
import network.PacketBase;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(name = Strings.MOD_NAME, modid = Strings.MOD_ID, version = Strings.MOD_VERSION )
@NetworkMod(clientSideRequired = true, serverSideRequired = false, packetHandler = PacketBase.class, channels = Strings.NETWORK_CHANNELS)
public class TechnicalArcana {

	@Instance("TechnicalArcana")
	public static TechnicalArcana instatnce;
	
	public static CreativeTabs customTab = new TACreativeTab("taTab");
	
	@Init
	public void init(FMLInitializationEvent evt){
		Proxy.load();
		LanguageRegistry.instance().addStringLocalization("itemGroup.taTab", "en_US", "Technical Arcana");
	}
	
	@PostInit
	public void preInit(FMLPreInitializationEvent evt){
		
	}
	
	@PreInit
	public void postInit(FMLPostInitializationEvent evt){
		
	}
	
}
