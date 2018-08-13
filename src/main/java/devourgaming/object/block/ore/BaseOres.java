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

public class BaseOres extends Block implements IModel, IMeta {
	public static final PropertyEnum<BaseEnumType> VARIANT = PropertyEnum.<BaseEnumType>create("variant", BaseEnumType.class);
	@SuppressWarnings("unused")
	private String name;
	public BaseOres(String name, Material material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.BlockTab);
		setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, BaseEnumType.ALUMINUM));
		this.name = name;
		BlockInit.BLOCKS.add(this);
		MaterialInit.MATERIALS.add(new ItemBlockVariants(this).setRegistryName(this.getRegistryName()));
	}
	
	@Override
	public int damageDropped(IBlockState state) {
		return ((BaseEnumType)state.getValue(VARIANT)).getMeta();
	}
	
	@Override
	public int getMetaFromState(IBlockState state) {
		return ((BaseEnumType)state.getValue(VARIANT)).getMeta();
	}
	
	@Override
	public IBlockState getStateFromMeta(int meta) {
		return this.getDefaultState().withProperty(VARIANT, BaseEnumType.byMetadata(meta));
	}
	
	@Override
	public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
		return new ItemStack(Item.getItemFromBlock(this), 1, getMetaFromState(world.getBlockState(pos)));
	}
	
	@Override
	public void getSubBlocks(CreativeTabs itemIn, NonNullList<ItemStack> items) {
		for(BaseEnumType variant : BaseEnumType.values()) {
			items.add(new ItemStack(this, 1, variant.getMeta()));
		}
	}
	
	@Override
	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, new IProperty[] {VARIANT});
	}
	
	@Override
	public String getSpecialName(ItemStack stack) {
		return BaseEnumType.values()[stack.getItemDamage()].getName();
	}
	
	@Override
	public void registerModels() {
		for(int i = 0; i < BaseEnumType.values().length; i++) {
			Main.proxy.registerVariantRenderer(Item.getItemFromBlock(this), i, BaseEnumType.values()[i].getName() + "_ore", "inventory");
		}
	}
	
	public static enum BaseEnumType implements IStringSerializable {
		ALUMINUM(0, "aluminum"),
		COPPER(1, "copper"),
		IRIDIUM(2, "iridium"),
		LEAD(3,"lead"),
		MANGANESE(4, "manganese"),
		NICKEL(5, "nickel"),
		TIN(6, "tin"),
		TITANIUM(7, "titanium"),
		URANIUM(8, "uranium");
		
		private static final BaseEnumType[] META_LOOKUP = new BaseEnumType[values().length];
		private final int meta;
		private final String name, unlocializedName;
		private BaseEnumType(int meta, String name) {
			this(meta, name, name);
		}
		private BaseEnumType(int meta, String name, String unlocializedName) {
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
		public static BaseEnumType byMetadata(int meta) {
			return META_LOOKUP[meta];
		}
		static {
			for(BaseEnumType BaseEnumType : values()) {
				META_LOOKUP[BaseEnumType.getMeta()] = BaseEnumType;
			}
		}
	}
}