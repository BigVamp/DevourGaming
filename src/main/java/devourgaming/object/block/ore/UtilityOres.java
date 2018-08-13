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

public class UtilityOres extends Block implements IModel, IMeta {
	public static final PropertyEnum<UtilityEnumType> VARIANT = PropertyEnum.<UtilityEnumType>create("variant", UtilityEnumType.class);
	@SuppressWarnings("unused")
	private String name;
	@SuppressWarnings("unused")
	private int dimension;
	public UtilityOres(String name, Material material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.BlockTab);
		setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, UtilityEnumType.BITUMEN));
		this.name = name;
		this.dimension = 0;
		BlockInit.BLOCKS.add(this);
		MaterialInit.MATERIALS.add(new ItemBlockVariants(this).setRegistryName(this.getRegistryName()));
	}
	
	@Override
	public int damageDropped(IBlockState state) {
		return ((UtilityEnumType)state.getValue(VARIANT)).getMeta();
	}
	
	@Override
	public int getMetaFromState(IBlockState state) {
		return ((UtilityEnumType)state.getValue(VARIANT)).getMeta();
	}
	
	@Override
	public IBlockState getStateFromMeta(int meta) {
		return this.getDefaultState().withProperty(VARIANT, UtilityEnumType.byMetadata(meta));
	}
	
	@Override
	public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
		return new ItemStack(Item.getItemFromBlock(this), 1, getMetaFromState(world.getBlockState(pos)));
	}
	
	@Override
	public void getSubBlocks(CreativeTabs itemIn, NonNullList<ItemStack> items) {
		for(UtilityEnumType variant : UtilityEnumType.values()) {
			items.add(new ItemStack(this, 1, variant.getMeta()));
		}
	}
	
	@Override
	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, new IProperty[] {VARIANT});
	}
	
	@Override
	public String getSpecialName(ItemStack stack) {
		return UtilityEnumType.values()[stack.getItemDamage()].getName();
	}
	
	@Override
	public void registerModels() {
		for(int i = 0; i < UtilityEnumType.values().length; i++) {
			Main.proxy.registerVariantRenderer(Item.getItemFromBlock(this), i, UtilityEnumType.values()[i].getName() + "_ore", "inventory");
		}
	}
	
	public static enum UtilityEnumType implements IStringSerializable {
		BITUMEN(0, "bitumen"),
		MAGNESIUM(1, "magnesium"),
		PHOSPHORITE(2,"phosphorite"),
		POTASH(3, "potash"),
		SALTPETER(4, "saltpeter"),
		SULFUR(5, "sulfur"),
		RUBY(6, "ruby"),
		SAPPHIRE(7, "sapphire"),
		AMETHYST(8, "amethyst"),
		TOPAZ(9, "topaz"),
		ONYX(10, "onyx");
		
		private static final UtilityEnumType[] META_LOOKUP = new UtilityEnumType[values().length];
		private final int meta;
		private final String name, unlocializedName;
		private UtilityEnumType(int meta, String name) {
			this(meta, name, name);
		}
		private UtilityEnumType(int meta, String name, String unlocializedName) {
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
		public static UtilityEnumType byMetadata(int meta) {
			return META_LOOKUP[meta];
		}
		static {
			for(UtilityEnumType UtilityEnumType : values()) {
				META_LOOKUP[UtilityEnumType.getMeta()] = UtilityEnumType;
			}
		}
	}
}