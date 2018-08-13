package devourgaming.object.block.ore;

import devourgaming.Main;
import devourgaming.init.BlockInit;
import devourgaming.init.MaterialInit;
import devourgaming.object.block.ItemBlockVariants;
import devourgaming.util.Interface.IModel;
import devourgaming.util.Interface.IMeta;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class NetherOres extends Block implements IModel, IMeta {
	public static final PropertyEnum<NetherEnumType> VARIANT = PropertyEnum.<NetherEnumType>create("variant", NetherEnumType.class);
	@SuppressWarnings("unused")
	private String name;
	@SuppressWarnings("unused")
	private int dimension;
	public NetherOres(String name, Material material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.BlockTab);
		setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, NetherEnumType.ALDUORITE));
		this.name = name;
		this.dimension = 0;
		BlockInit.BLOCKS.add(this);
		MaterialInit.MATERIALS.add(new ItemBlockVariants(this).setRegistryName(this.getRegistryName()));
	}
	
	@Override
	public int damageDropped(IBlockState state) {
		return ((NetherEnumType)state.getValue(VARIANT)).getMeta();
	}
	
	@Override
	public int getMetaFromState(IBlockState state) {
		return ((NetherEnumType)state.getValue(VARIANT)).getMeta();
	}
	
	@Override
	public IBlockState getStateFromMeta(int meta) {
		return this.getDefaultState().withProperty(VARIANT, NetherEnumType.byMetadata(meta));
	}
	
	@Override
	public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
		return new ItemStack(Item.getItemFromBlock(this), 1, getMetaFromState(world.getBlockState(pos)));
	}
	
	@Override
	public void getSubBlocks(CreativeTabs itemIn, NonNullList<ItemStack> items) {
		for(NetherEnumType variant : NetherEnumType.values()) {
			items.add(new ItemStack(this, 1, variant.getMeta()));
		}
	}
	
	@Override
	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, new IProperty[] {VARIANT});
	}
	
	@Override
	public String getSpecialName(ItemStack stack) {
		return NetherEnumType.values()[stack.getItemDamage()].getName();
	}
	
	@Override
	public void registerModels() {
		for(int i = 0; i < NetherEnumType.values().length; i++) {
			Main.proxy.registerVariantRenderer(Item.getItemFromBlock(this), i, NetherEnumType.values()[i].getName() + "_ore", "inventory");
		}
	}
	
	public static enum NetherEnumType implements IStringSerializable {
		ALDUORITE(0, "alduorite"),
		ARIDITE(1, "aridite"),
		CERUCLASE(2,"ceruclase"),
		COBALT(3, "cobalt"),
		IGNATIUS(4, "ignatius"),
		KALENDRITE(5, "kalendrite"),
		LEMURITE(6, "lemurite"),
		MIDASIUM(7, "midasium"),
		SANGUINITE(8, "sanguinite"),
		SHADOW_IRON(9, "shadow_iron"),
		VULCANITE(10, "vulcanite"),
		VYROXERES(11, "vyroxeres");
		
		private static final NetherEnumType[] META_LOOKUP = new NetherEnumType[values().length];
		private final int meta;
		private final String name, unlocializedName;
		private NetherEnumType(int meta, String name) {
			this(meta, name, name);
		}
		private NetherEnumType(int meta, String name, String unlocializedName) {
			this.meta = meta;
			this.name= name;
			this.unlocializedName = unlocializedName;
		}
		
		@Override
		public String getName() {
			return this.name;
		}
		public int getMeta() {
			return meta;
		}
		public String getUnlocializedName() {
			return unlocializedName;
		}
		
		@Override
		public String toString() {
			return this.name;
		}
		public static NetherEnumType byMetadata(int meta) {
			return META_LOOKUP[meta];
		}
		static {
			for(NetherEnumType NetherEnumType : values()) {
				META_LOOKUP[NetherEnumType.getMeta()] = NetherEnumType;
			}
		}
	}
}