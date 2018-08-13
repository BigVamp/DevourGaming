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

public class EndOres extends Block implements IModel, IMeta {
	public static final PropertyEnum<EndEnumType> VARIANT = PropertyEnum.<EndEnumType>create("variant", EndEnumType.class);
	@SuppressWarnings("unused")
	private String name;
	@SuppressWarnings("unused")
	private int dimension;
	public EndOres(String name, Material material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.BlockTab);
		setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, EndEnumType.EXIMITE));
		this.name = name;
		this.dimension = 0;
		BlockInit.BLOCKS.add(this);
		MaterialInit.ITEMS.add(new ItemBlockVariants(this).setRegistryName(this.getRegistryName()));
	}
	
	@Override
	public int damageDropped(IBlockState state) {
		return ((EndEnumType)state.getValue(VARIANT)).getMeta();
	}
	
	@Override
	public int getMetaFromState(IBlockState state) {
		return ((EndEnumType)state.getValue(VARIANT)).getMeta();
	}
	
	@Override
	public IBlockState getStateFromMeta(int meta) {
		return this.getDefaultState().withProperty(VARIANT, EndEnumType.byMetadata(meta));
	}
	
	@Override
	public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
		return new ItemStack(Item.getItemFromBlock(this), 1, getMetaFromState(world.getBlockState(pos)));
	}
	
	@Override
	public void getSubBlocks(CreativeTabs itemIn, NonNullList<ItemStack> items) {
		for(EndEnumType variant : EndEnumType.values()) {
			items.add(new ItemStack(this, 1, variant.getMeta()));
		}
	}
	
	@Override
	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, new IProperty[] {VARIANT});
	}
	
	@Override
	public String getSpecialName(ItemStack stack) {
		return EndEnumType.values()[stack.getItemDamage()].getName();
	}
	
	@Override
	public void registerModels() {
		for(int i = 0; i < EndEnumType.values().length; i++) {
			Main.proxy.registerVariantRenderer(Item.getItemFromBlock(this), i, EndEnumType.values()[i].getName() + "_ore", "inventory");
		}
	}
	
	public static enum EndEnumType implements IStringSerializable {
		EXIMITE(0, "eximite"),
		MEUTOITE(1, "meutoite");
		
		private static final EndEnumType[] META_LOOKUP = new EndEnumType[values().length];
		private final int meta;
		private final String name, unlocializedName;
		private EndEnumType(int meta, String name) {
			this(meta, name, name);
		}
		private EndEnumType(int meta, String name, String unlocializedName) {
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
		public static EndEnumType byMetadata(int meta) {
			return META_LOOKUP[meta];
		}
		static {
			for(EndEnumType EndEnumType : values()) {
				META_LOOKUP[EndEnumType.getMeta()] = EndEnumType;
			}
		}
	}
}