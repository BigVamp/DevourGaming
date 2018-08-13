package devourgaming.init;

import java.util.ArrayList;
import java.util.List;

import devourgaming.object.equipment.EquipmentBase;
import devourgaming.util.Reference;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;

public class EquipmentInit {
	public static final List<Item> EQUIPS = new ArrayList<Item>();
	//Material
	public static final ArmorMaterial ARMOR_MATERIAL_ADAMANTINE = EnumHelper.addArmorMaterial("armor_material_adamantine", Reference.MOD_ID + ":adamantine", 10, new int[] {1, 1, 1, 1}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_ALDUORITE = EnumHelper.addArmorMaterial("armor_material_alduorite", Reference.MOD_ID + ":alduorite", 10, new int[] {1, 1, 1, 1}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_AMORDRINE = EnumHelper.addArmorMaterial("armor_material_amordrine", Reference.MOD_ID + ":amordrine", 10, new int[] {1, 1, 1, 1}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_ANGMALLEN = EnumHelper.addArmorMaterial("armor_material_angmallen", Reference.MOD_ID + ":angmallen", 10, new int[] {1, 1, 1, 1}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_ARIDITE = EnumHelper.addArmorMaterial("armor_material_aridite", Reference.MOD_ID + ":aridite", 10, new int[] {1, 1, 1, 1}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_ATLARUS = EnumHelper.addArmorMaterial("armor_material_atlarus", Reference.MOD_ID + ":atlarus", 10, new int[] {1, 1, 1, 1}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_BLACK_STEEL = EnumHelper.addArmorMaterial("armor_material_black_steel", Reference.MOD_ID + ":black_steel", 10, new int[] {1, 1, 1, 1}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_BRASS = EnumHelper.addArmorMaterial("armor_material_brass", Reference.MOD_ID + ":brass", 10, new int[] {1, 1, 1, 1}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_BRONZE = EnumHelper.addArmorMaterial("armor_material_bronze", Reference.MOD_ID + ":bronze", 10, new int[] {1, 1, 1, 1}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_CELENEGIL = EnumHelper.addArmorMaterial("armor_material_celenegil", Reference.MOD_ID + ":copper", 10, new int[] {1, 1, 1, 1}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_CERUCLASE = EnumHelper.addArmorMaterial("armor_material_ceruclase", Reference.MOD_ID + ":ceruclase", 10, new int[] {1, 1, 1, 1}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_COBALT = EnumHelper.addArmorMaterial("armor_material_cobalt", Reference.MOD_ID + ":cobalt", 10, new int[] {1, 1, 1, 1}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_COPPER = EnumHelper.addArmorMaterial("armor_material_copper", Reference.MOD_ID + ":copper", 10, new int[] {1, 1, 1, 1}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_CARMOT = EnumHelper.addArmorMaterial("armor_material_carmot", Reference.MOD_ID + ":carmot", 10, new int[] {1, 1, 1, 1}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_DAMASCUS_STEEL = EnumHelper.addArmorMaterial("armor_material_damascus_steel", Reference.MOD_ID + ":damascus_steel", 10, new int[] {1, 1, 1, 1}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_DEEP_IRON = EnumHelper.addArmorMaterial("armor_material_deep_iron", Reference.MOD_ID + ":deep_iron", 10, new int[] {1, 1, 1, 1}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_DESICHALKOS = EnumHelper.addArmorMaterial("armor_material_desichalkos", Reference.MOD_ID + ":desichalkos", 10, new int[] {1, 1, 1, 1}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_ELECTRUM = EnumHelper.addArmorMaterial("armor_material_electrum", Reference.MOD_ID + ":electrum", 10, new int[] {1, 1, 1, 1}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_EXIMITE = EnumHelper.addArmorMaterial("armor_material_eximite", Reference.MOD_ID + ":eximite", 10, new int[] {1, 1, 1, 1}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_HADEROTH = EnumHelper.addArmorMaterial("armor_material_haderoth", Reference.MOD_ID + ":haderoth", 10, new int[] {1, 1, 1, 1}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_HEPATIZON = EnumHelper.addArmorMaterial("armor_material_hepatizon", Reference.MOD_ID + ":hepatizon", 10, new int[] {1, 1, 1, 1}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_IGNATIUS = EnumHelper.addArmorMaterial("armor_material_ignatius", Reference.MOD_ID + ":ignatius", 10, new int[] {1, 1, 1, 1}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_INFUSCOLIUM = EnumHelper.addArmorMaterial("armor_material_infuscolium", Reference.MOD_ID + ":infuscolium", 10, new int[] {1, 1, 1, 1}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_INOLASHITE = EnumHelper.addArmorMaterial("armor_material_inolashite", Reference.MOD_ID + ":inolashite", 10, new int[] {1, 1, 1, 1}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_KALENDRITE = EnumHelper.addArmorMaterial("armor_material_kalendrite", Reference.MOD_ID + ":kalendrite", 10, new int[] {1, 1, 1, 1}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_LEAD = EnumHelper.addArmorMaterial("armor_material_lead", Reference.MOD_ID + ":lead", 10, new int[] {1, 1, 1, 1}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_LEMURITE = EnumHelper.addArmorMaterial("armor_material_lemurite", Reference.MOD_ID + ":lemurite", 10, new int[] {1, 1, 1, 1}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_MANGANESE = EnumHelper.addArmorMaterial("armor_material_manganese", Reference.MOD_ID + ":manganese", 10, new int[] {1, 1, 1, 1}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_MIDASIUM = EnumHelper.addArmorMaterial("armor_material_midasium", Reference.MOD_ID + ":midasium", 10, new int[] {1, 1, 1, 1}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_MITHRIL = EnumHelper.addArmorMaterial("armor_material_mithril", Reference.MOD_ID + ":mithril", 10, new int[] {1, 1, 1, 1}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_NICKEL = EnumHelper.addArmorMaterial("armor_material_nickel", Reference.MOD_ID + ":nickel", 10, new int[] {1, 1, 1, 1}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_ORICHALCUM = EnumHelper.addArmorMaterial("armor_material_orichalcum", Reference.MOD_ID + ":orichalcum", 10, new int[] {1, 1, 1, 1}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_OURECLASE = EnumHelper.addArmorMaterial("armor_material_oureclase", Reference.MOD_ID + ":oureclase", 10, new int[] {1, 1, 1, 1}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_PLATINUM = EnumHelper.addArmorMaterial("armor_material_platinum", Reference.MOD_ID + ":platinum", 10, new int[] {1, 1, 1, 1}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_PROMETHEUM = EnumHelper.addArmorMaterial("armor_material_prometheum", Reference.MOD_ID + ":prometheum", 10, new int[] {1, 1, 1, 1}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_QUICKSILVER = EnumHelper.addArmorMaterial("armor_material_quicksilver", Reference.MOD_ID + ":quicksilver", 10, new int[] {1, 1, 1, 1}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_RUBRACIUM = EnumHelper.addArmorMaterial("armor_material_rubracium", Reference.MOD_ID + ":rubracium", 10, new int[] {1, 1, 1, 1}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_SANGUINITE = EnumHelper.addArmorMaterial("armor_material_sanguinite", Reference.MOD_ID + ":sanguinite", 10, new int[] {1, 1, 1, 1}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_SHADOW_IRON = EnumHelper.addArmorMaterial("armor_material_shadow_iron", Reference.MOD_ID + ":shadow_iron", 10, new int[] {1, 1, 1, 1}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_SHADOW_STEEL = EnumHelper.addArmorMaterial("armor_material_shadow_steel", Reference.MOD_ID + ":shadow_steel", 10, new int[] {1, 1, 1, 1}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_SILVER = EnumHelper.addArmorMaterial("armor_material_silver", Reference.MOD_ID + ":silver", 10, new int[] {1, 1, 1, 1}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_STEEL = EnumHelper.addArmorMaterial("armor_material_steel", Reference.MOD_ID + ":steel", 10, new int[] {1, 1, 1, 1}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_TARTARITE = EnumHelper.addArmorMaterial("armor_material_tartarite", Reference.MOD_ID + ":tartarite", 10, new int[] {1, 1, 1, 1}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_TIN = EnumHelper.addArmorMaterial("armor_material_tin", Reference.MOD_ID + ":tin", 10, new int[] {1, 1, 1, 1}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_TITANIUM = EnumHelper.addArmorMaterial("armor_material_titanium", Reference.MOD_ID + ":titanium", 10, new int[] {1, 1, 1, 1}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_VULCANITE = EnumHelper.addArmorMaterial("armor_material_vulcanite", Reference.MOD_ID + ":vulcanite", 10, new int[] {1, 1, 1, 1}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_VYROXERES = EnumHelper.addArmorMaterial("armor_material_vyroxeres", Reference.MOD_ID + ":vyroxeres", 10, new int[] {1, 1, 1, 1}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	
	//Adamantine
	public static final Item ADAMANTINE_HELMET = new EquipmentBase("adamantine_helmet", ARMOR_MATERIAL_ADAMANTINE, 1, EntityEquipmentSlot.HEAD);
	public static final Item ADAMANTINE_CHEST = new EquipmentBase("adamantine_chest", ARMOR_MATERIAL_ADAMANTINE, 1, EntityEquipmentSlot.CHEST);
	public static final Item ADAMANTINE_LEGS = new EquipmentBase("adamantine_legs", ARMOR_MATERIAL_ADAMANTINE, 2, EntityEquipmentSlot.LEGS);
	public static final Item ADAMANTINE_BOOTS = new EquipmentBase("adamantine_boots", ARMOR_MATERIAL_ADAMANTINE, 1, EntityEquipmentSlot.FEET);
	//Alduorite
	public static final Item ALDUORITE_HELMET = new EquipmentBase("alduorite_helmet", ARMOR_MATERIAL_ALDUORITE, 1, EntityEquipmentSlot.HEAD);
	public static final Item ALDUORITE_CHEST = new EquipmentBase("alduorite_chest", ARMOR_MATERIAL_ALDUORITE, 1, EntityEquipmentSlot.CHEST);
	public static final Item ALDUORITE_LEGS = new EquipmentBase("alduorite_legs", ARMOR_MATERIAL_ALDUORITE, 2, EntityEquipmentSlot.LEGS);
	public static final Item ALDUORITE_BOOTS = new EquipmentBase("alduorite_boots", ARMOR_MATERIAL_ALDUORITE, 1, EntityEquipmentSlot.FEET);
	//Amordrine
	public static final Item AMORDRINE_HELMET = new EquipmentBase("amordrine_helmet", ARMOR_MATERIAL_AMORDRINE, 1, EntityEquipmentSlot.HEAD);
	public static final Item AMORDRINE_CHEST = new EquipmentBase("amordrine_chest", ARMOR_MATERIAL_AMORDRINE, 1, EntityEquipmentSlot.CHEST);
	public static final Item AMORDRINE_LEGS = new EquipmentBase("amordrine_legs", ARMOR_MATERIAL_AMORDRINE, 2, EntityEquipmentSlot.LEGS);
	public static final Item AMORDRINE_BOOTS = new EquipmentBase("amordrine_boots", ARMOR_MATERIAL_AMORDRINE, 1, EntityEquipmentSlot.FEET);
	//Angmallen
	public static final Item ANGMALLEN_HELMET = new EquipmentBase("angmallen_helmet", ARMOR_MATERIAL_ANGMALLEN, 1, EntityEquipmentSlot.HEAD);
	public static final Item ANGMALLEN_CHEST = new EquipmentBase("_chest", ARMOR_MATERIAL_ANGMALLEN, 1, EntityEquipmentSlot.CHEST);
	public static final Item ANGMALLEN_LEGS = new EquipmentBase("_legs", ARMOR_MATERIAL_ANGMALLEN, 2, EntityEquipmentSlot.LEGS);
	public static final Item ANGMALLEN_BOOTS = new EquipmentBase("_boots", ARMOR_MATERIAL_ANGMALLEN, 1, EntityEquipmentSlot.FEET);
	//Aridite
	public static final Item ARIDITE_HELMET = new EquipmentBase("aridite_helmet", ARMOR_MATERIAL_ARIDITE, 1, EntityEquipmentSlot.HEAD);
	public static final Item ARIDITE_CHEST = new EquipmentBase("aridite_chest", ARMOR_MATERIAL_ARIDITE, 1, EntityEquipmentSlot.CHEST);
	public static final Item ARIDITE_LEGS = new EquipmentBase("aridite_legs", ARMOR_MATERIAL_ARIDITE, 2, EntityEquipmentSlot.LEGS);
	public static final Item ARIDITE_BOOTS = new EquipmentBase("aridite_boots", ARMOR_MATERIAL_ARIDITE, 1, EntityEquipmentSlot.FEET);
	//Atlarus
	public static final Item ATLARUS_HELMET = new EquipmentBase("atlarus_helmet", ARMOR_MATERIAL_ATLARUS, 1, EntityEquipmentSlot.HEAD);
	public static final Item ATLARUS_CHEST = new EquipmentBase("atlarus_chest", ARMOR_MATERIAL_ATLARUS, 1, EntityEquipmentSlot.CHEST);
	public static final Item ATLARUS_LEGS = new EquipmentBase("atlarus_legs", ARMOR_MATERIAL_ATLARUS, 2, EntityEquipmentSlot.LEGS);
	public static final Item ATLARUS_BOOTS = new EquipmentBase("atlarus_boots", ARMOR_MATERIAL_ATLARUS, 1, EntityEquipmentSlot.FEET);
	//Black Steel
	public static final Item BLACK_STEEL_HELMET = new EquipmentBase("black_steel_helmet", ARMOR_MATERIAL_BLACK_STEEL, 1, EntityEquipmentSlot.HEAD);
	public static final Item BLACK_STEEL_CHEST = new EquipmentBase("black_steel_chest", ARMOR_MATERIAL_BLACK_STEEL, 1, EntityEquipmentSlot.CHEST);
	public static final Item BLACK_STEEL_LEGS = new EquipmentBase("black_steel_legs", ARMOR_MATERIAL_BLACK_STEEL, 2, EntityEquipmentSlot.LEGS);
	public static final Item BLACK_STEEL_BOOTS = new EquipmentBase("black_steel_boots", ARMOR_MATERIAL_BLACK_STEEL, 1, EntityEquipmentSlot.FEET);
	//Brass
	public static final Item BRASS_HELMET = new EquipmentBase("brass_helmet", ARMOR_MATERIAL_BRASS, 1, EntityEquipmentSlot.HEAD);
	public static final Item BRASS_CHEST = new EquipmentBase("brass_chest", ARMOR_MATERIAL_BRASS, 1, EntityEquipmentSlot.CHEST);
	public static final Item BRASS_LEGS = new EquipmentBase("brass_legs", ARMOR_MATERIAL_BRASS, 2, EntityEquipmentSlot.LEGS);
	public static final Item BRASS_BOOTS = new EquipmentBase("brass_boots", ARMOR_MATERIAL_BRASS, 1, EntityEquipmentSlot.FEET);
	//Bronze
	public static final Item BRONZE_HELMET = new EquipmentBase("bronze_helmet", ARMOR_MATERIAL_BRONZE, 1, EntityEquipmentSlot.HEAD);
	public static final Item BRONZE_CHEST = new EquipmentBase("bronze_chest", ARMOR_MATERIAL_BRONZE, 1, EntityEquipmentSlot.CHEST);
	public static final Item BRONZE_LEGS = new EquipmentBase("bronze_legs", ARMOR_MATERIAL_BRONZE, 2, EntityEquipmentSlot.LEGS);
	public static final Item BRONZE_BOOTS = new EquipmentBase("bronze_boots", ARMOR_MATERIAL_BRONZE, 1, EntityEquipmentSlot.FEET);
	//Celenegil
	public static final Item CELENEGIL_HELMET = new EquipmentBase("celenegil_helmet", ARMOR_MATERIAL_CELENEGIL, 1, EntityEquipmentSlot.HEAD);
	public static final Item CELENEGIL_CHEST = new EquipmentBase("celenegil_chest", ARMOR_MATERIAL_CELENEGIL, 1, EntityEquipmentSlot.CHEST);
	public static final Item CELENEGIL_LEGS = new EquipmentBase("celenegil_legs", ARMOR_MATERIAL_CELENEGIL, 2, EntityEquipmentSlot.LEGS);
	public static final Item CELENEGIL_BOOTS = new EquipmentBase("celenegil_boots", ARMOR_MATERIAL_CELENEGIL, 1, EntityEquipmentSlot.FEET);
	//Ceruclase
	public static final Item CERUCLASE_HELMET = new EquipmentBase("ceruclase_helmet", ARMOR_MATERIAL_CERUCLASE, 1, EntityEquipmentSlot.HEAD);
	public static final Item CERUCLASE_CHEST = new EquipmentBase("ceruclase_chest", ARMOR_MATERIAL_CERUCLASE, 1, EntityEquipmentSlot.CHEST);
	public static final Item CERUCLASE_LEGS = new EquipmentBase("ceruclase_legs", ARMOR_MATERIAL_CERUCLASE, 2, EntityEquipmentSlot.LEGS);
	public static final Item CERUCLASE_BOOTS = new EquipmentBase("ceruclase_boots", ARMOR_MATERIAL_CERUCLASE, 1, EntityEquipmentSlot.FEET);
	//Cobalt
	public static final Item COBALT_HELMET = new EquipmentBase("cobalt_helmet", ARMOR_MATERIAL_COBALT, 1, EntityEquipmentSlot.HEAD);
	public static final Item COBALT_CHEST = new EquipmentBase("cobalt_chest", ARMOR_MATERIAL_COBALT, 1, EntityEquipmentSlot.CHEST);
	public static final Item COBALT_LEGS = new EquipmentBase("cobalt_legs", ARMOR_MATERIAL_COBALT, 2, EntityEquipmentSlot.LEGS);
	public static final Item COBALT_BOOTS = new EquipmentBase("cobalt_boots", ARMOR_MATERIAL_COBALT, 1, EntityEquipmentSlot.FEET);
	//Copper
	public static final Item COPPER_HELMET = new EquipmentBase("copper_helmet", ARMOR_MATERIAL_COPPER, 1, EntityEquipmentSlot.HEAD);
	public static final Item COPPER_CHEST = new EquipmentBase("copper_chest", ARMOR_MATERIAL_COPPER, 1, EntityEquipmentSlot.CHEST);
	public static final Item COPPER_LEGS = new EquipmentBase("copper_legs", ARMOR_MATERIAL_COPPER, 2, EntityEquipmentSlot.LEGS);
	public static final Item COPPER_BOOTS = new EquipmentBase("copper_boots", ARMOR_MATERIAL_COPPER, 1, EntityEquipmentSlot.FEET);
	//Carmot
	public static final Item CARMOT_HELMET = new EquipmentBase("carmot_helmet", ARMOR_MATERIAL_CARMOT, 1, EntityEquipmentSlot.HEAD);
	public static final Item CARMOT_CHEST = new EquipmentBase("carmot_chest", ARMOR_MATERIAL_CARMOT, 1, EntityEquipmentSlot.CHEST);
	public static final Item CARMOT_LEGS = new EquipmentBase("carmot_legs", ARMOR_MATERIAL_CARMOT, 2, EntityEquipmentSlot.LEGS);
	public static final Item CARMOT_BOOTS = new EquipmentBase("carmot_boots", ARMOR_MATERIAL_CARMOT, 1, EntityEquipmentSlot.FEET);
	//Damascus Steel
	public static final Item DAMASCUS_STEEL_HELMET = new EquipmentBase("damascus_steel_helmet", ARMOR_MATERIAL_DAMASCUS_STEEL, 1, EntityEquipmentSlot.HEAD);
	public static final Item DAMASCUS_STEEL_CHEST = new EquipmentBase("damascus_steel_chest", ARMOR_MATERIAL_DAMASCUS_STEEL, 1, EntityEquipmentSlot.CHEST);
	public static final Item DAMASCUS_STEEL_LEGS = new EquipmentBase("damascus_steel_legs", ARMOR_MATERIAL_DAMASCUS_STEEL, 2, EntityEquipmentSlot.LEGS);
	public static final Item DAMASCUS_STEEL_BOOTS = new EquipmentBase("damascus_steel_boots", ARMOR_MATERIAL_DAMASCUS_STEEL, 1, EntityEquipmentSlot.FEET);
	//Deep Iron
	public static final Item DEEP_IRON_HELMET = new EquipmentBase("deep_iron_helmet", ARMOR_MATERIAL_DEEP_IRON, 1, EntityEquipmentSlot.HEAD);
	public static final Item DEEP_IRON_CHEST = new EquipmentBase("deep_iron_chest", ARMOR_MATERIAL_DEEP_IRON, 1, EntityEquipmentSlot.CHEST);
	public static final Item DEEP_IRON_LEGS = new EquipmentBase("deep_iron_legs", ARMOR_MATERIAL_DEEP_IRON, 2, EntityEquipmentSlot.LEGS);
	public static final Item DEEP_IRON_BOOTS = new EquipmentBase("deep_iron_boots", ARMOR_MATERIAL_DEEP_IRON, 1, EntityEquipmentSlot.FEET);
	//Desichalkos
	public static final Item DESICHALKOS_HELMET = new EquipmentBase("desichalkos_helmet", ARMOR_MATERIAL_DESICHALKOS, 1, EntityEquipmentSlot.HEAD);
	public static final Item DESICHALKOS_CHEST = new EquipmentBase("desichalkos_chest", ARMOR_MATERIAL_DESICHALKOS, 1, EntityEquipmentSlot.CHEST);
	public static final Item DESICHALKOS_LEGS = new EquipmentBase("desichalkos_legs", ARMOR_MATERIAL_DESICHALKOS, 2, EntityEquipmentSlot.LEGS);
	public static final Item DESICHALKOS_BOOTS = new EquipmentBase("desichalkos_boots", ARMOR_MATERIAL_DESICHALKOS, 1, EntityEquipmentSlot.FEET);
	//Electrum
	public static final Item ELECTRUM_HELMET = new EquipmentBase("electrum_helmet", ARMOR_MATERIAL_ELECTRUM, 1, EntityEquipmentSlot.HEAD);
	public static final Item ELECTRUM_CHEST = new EquipmentBase("electrum_chest", ARMOR_MATERIAL_ELECTRUM, 1, EntityEquipmentSlot.CHEST);
	public static final Item ELECTRUM_LEGS = new EquipmentBase("electrum_legs", ARMOR_MATERIAL_ELECTRUM, 2, EntityEquipmentSlot.LEGS);
	public static final Item ELECTRUM_BOOTS = new EquipmentBase("electrum_boots", ARMOR_MATERIAL_ELECTRUM, 1, EntityEquipmentSlot.FEET);
	//Eximite
	public static final Item EXIMITE_HELMET = new EquipmentBase("eximite_helmet", ARMOR_MATERIAL_EXIMITE, 1, EntityEquipmentSlot.HEAD);
	public static final Item EXIMITE_CHEST = new EquipmentBase("eximite_chest", ARMOR_MATERIAL_EXIMITE, 1, EntityEquipmentSlot.CHEST);
	public static final Item EXIMITE_LEGS = new EquipmentBase("eximite_legs", ARMOR_MATERIAL_EXIMITE, 2, EntityEquipmentSlot.LEGS);
	public static final Item EXIMITE_BOOTS = new EquipmentBase("eximite_boots", ARMOR_MATERIAL_EXIMITE, 1, EntityEquipmentSlot.FEET);
	//Haderoth
	public static final Item HADEROTH_HELMET = new EquipmentBase("haderoth_helmet", ARMOR_MATERIAL_HADEROTH, 1, EntityEquipmentSlot.HEAD);
	public static final Item HADEROTH_CHEST = new EquipmentBase("haderoth_chest", ARMOR_MATERIAL_HADEROTH, 1, EntityEquipmentSlot.CHEST);
	public static final Item HADEROTH_LEGS = new EquipmentBase("haderoth_legs", ARMOR_MATERIAL_HADEROTH, 2, EntityEquipmentSlot.LEGS);
	public static final Item HADEROTH_BOOTS = new EquipmentBase("haderoth_boots", ARMOR_MATERIAL_HADEROTH, 1, EntityEquipmentSlot.FEET);
	//Hepatizon
	public static final Item HEPATIZON_HELMET = new EquipmentBase("hepatizon_helmet", ARMOR_MATERIAL_HEPATIZON, 1, EntityEquipmentSlot.HEAD);
	public static final Item HEPATIZON_CHEST = new EquipmentBase("hepatizon_chest", ARMOR_MATERIAL_HEPATIZON, 1, EntityEquipmentSlot.CHEST);
	public static final Item HEPATIZON_LEGS = new EquipmentBase("hepatizon_legs", ARMOR_MATERIAL_HEPATIZON, 2, EntityEquipmentSlot.LEGS);
	public static final Item HEPATIZON_BOOTS = new EquipmentBase("hepatizon_boots", ARMOR_MATERIAL_HEPATIZON, 1, EntityEquipmentSlot.FEET);
	//Ignatius
	public static final Item IGNATIUS_HELMET = new EquipmentBase("ignatius_helmet", ARMOR_MATERIAL_IGNATIUS, 1, EntityEquipmentSlot.HEAD);
	public static final Item IGNATIUS_CHEST = new EquipmentBase("ignatius_chest", ARMOR_MATERIAL_IGNATIUS, 1, EntityEquipmentSlot.CHEST);
	public static final Item IGNATIUS_LEGS = new EquipmentBase("ignatius_legs", ARMOR_MATERIAL_IGNATIUS, 2, EntityEquipmentSlot.LEGS);
	public static final Item IGNATIUS_BOOTS = new EquipmentBase("ignatius_boots", ARMOR_MATERIAL_IGNATIUS, 1, EntityEquipmentSlot.FEET);
	//Infuscolium
	public static final Item INFUSCOLIUM_HELMET = new EquipmentBase("infuscolium_helmet", ARMOR_MATERIAL_INFUSCOLIUM, 1, EntityEquipmentSlot.HEAD);
	public static final Item INFUSCOLIUM_CHEST = new EquipmentBase("infuscolium_chest", ARMOR_MATERIAL_INFUSCOLIUM, 1, EntityEquipmentSlot.CHEST);
	public static final Item INFUSCOLIUM_LEGS = new EquipmentBase("infuscolium_legs", ARMOR_MATERIAL_INFUSCOLIUM, 2, EntityEquipmentSlot.LEGS);
	public static final Item INFUSCOLIUM_BOOTS = new EquipmentBase("infuscolium_boots", ARMOR_MATERIAL_INFUSCOLIUM, 1, EntityEquipmentSlot.FEET);
	//Inolashite
	public static final Item INOLASHITE_HELMET = new EquipmentBase("inolashite_helmet", ARMOR_MATERIAL_INOLASHITE, 1, EntityEquipmentSlot.HEAD);
	public static final Item INOLASHITE_CHEST = new EquipmentBase("inolashite_chest", ARMOR_MATERIAL_INOLASHITE, 1, EntityEquipmentSlot.CHEST);
	public static final Item INOLASHITE_LEGS = new EquipmentBase("inolashite_legs", ARMOR_MATERIAL_INOLASHITE, 2, EntityEquipmentSlot.LEGS);
	public static final Item INOLASHITE_BOOTS = new EquipmentBase("inolashite_boots", ARMOR_MATERIAL_INOLASHITE, 1, EntityEquipmentSlot.FEET);
	//Kalendrite
	public static final Item KALENDRITE_HELMET = new EquipmentBase("kalendrite_helmet", ARMOR_MATERIAL_KALENDRITE, 1, EntityEquipmentSlot.HEAD);
	public static final Item KALENDRITE_CHEST = new EquipmentBase("kalendrite_chest", ARMOR_MATERIAL_KALENDRITE, 1, EntityEquipmentSlot.CHEST);
	public static final Item KALENDRITE_LEGS = new EquipmentBase("kalendrite_legs", ARMOR_MATERIAL_KALENDRITE, 2, EntityEquipmentSlot.LEGS);
	public static final Item KALENDRITE_BOOTS = new EquipmentBase("kalendrite_boots", ARMOR_MATERIAL_KALENDRITE, 1, EntityEquipmentSlot.FEET);
	//Lead
	public static final Item LEAD_HELMET = new EquipmentBase("lead_helmet", ARMOR_MATERIAL_LEAD, 1, EntityEquipmentSlot.HEAD);
	public static final Item LEAD_CHEST = new EquipmentBase("lead_chest", ARMOR_MATERIAL_LEAD, 1, EntityEquipmentSlot.CHEST);
	public static final Item LEAD_LEGS = new EquipmentBase("lead_legs", ARMOR_MATERIAL_LEAD, 2, EntityEquipmentSlot.LEGS);
	public static final Item LEAD_BOOTS = new EquipmentBase("lead_boots", ARMOR_MATERIAL_LEAD, 1, EntityEquipmentSlot.FEET);
	//Lemurite
	public static final Item LEMURITE_HELMET = new EquipmentBase("lemurite_helmet", ARMOR_MATERIAL_LEMURITE, 1, EntityEquipmentSlot.HEAD);
	public static final Item LEMURITE_CHEST = new EquipmentBase("lemurite_chest", ARMOR_MATERIAL_LEMURITE, 1, EntityEquipmentSlot.CHEST);
	public static final Item LEMURITE_LEGS = new EquipmentBase("lemurite_legs", ARMOR_MATERIAL_LEMURITE, 2, EntityEquipmentSlot.LEGS);
	public static final Item LEMURITE_BOOTS = new EquipmentBase("lemurite_boots", ARMOR_MATERIAL_LEMURITE, 1, EntityEquipmentSlot.FEET);
	//Manganese
	public static final Item MANGANESE_HELMET = new EquipmentBase("manganese_helmet", ARMOR_MATERIAL_MANGANESE, 1, EntityEquipmentSlot.HEAD);
	public static final Item MANGANESE_CHEST = new EquipmentBase("manganese_chest", ARMOR_MATERIAL_MANGANESE, 1, EntityEquipmentSlot.CHEST);
	public static final Item MANGANESE_LEGS = new EquipmentBase("manganese_legs", ARMOR_MATERIAL_MANGANESE, 2, EntityEquipmentSlot.LEGS);
	public static final Item MANGANESE_BOOTS = new EquipmentBase("manganese_boots", ARMOR_MATERIAL_MANGANESE, 1, EntityEquipmentSlot.FEET);
	//Midasium
	public static final Item MIDASIUM_HELMET = new EquipmentBase("midasium_helmet", ARMOR_MATERIAL_MIDASIUM, 1, EntityEquipmentSlot.HEAD);
	public static final Item MIDASIUM_CHEST = new EquipmentBase("midasium_chest", ARMOR_MATERIAL_MIDASIUM, 1, EntityEquipmentSlot.CHEST);
	public static final Item MIDASIUM_LEGS = new EquipmentBase("midasium_legs", ARMOR_MATERIAL_MIDASIUM, 2, EntityEquipmentSlot.LEGS);
	public static final Item MIDASIUM_BOOTS = new EquipmentBase("midasium_boots", ARMOR_MATERIAL_MIDASIUM, 1, EntityEquipmentSlot.FEET);
	//Mithril
	public static final Item MITHRIL_HELMET = new EquipmentBase("mithril_helmet", ARMOR_MATERIAL_MITHRIL, 1, EntityEquipmentSlot.HEAD);
	public static final Item MITHRIL_CHEST = new EquipmentBase("mithril_chest", ARMOR_MATERIAL_MITHRIL, 1, EntityEquipmentSlot.CHEST);
	public static final Item MITHRIL_LEGS = new EquipmentBase("mithril_legs", ARMOR_MATERIAL_MITHRIL, 2, EntityEquipmentSlot.LEGS);
	public static final Item MITHRIL_BOOTS = new EquipmentBase("mithril_boots", ARMOR_MATERIAL_MITHRIL, 1, EntityEquipmentSlot.FEET);
	//Nickel
	public static final Item NICKEL_HELMET = new EquipmentBase("nickel_helmet", ARMOR_MATERIAL_NICKEL, 1, EntityEquipmentSlot.HEAD);
	public static final Item NICKEL_CHEST = new EquipmentBase("nickel_chest", ARMOR_MATERIAL_NICKEL, 1, EntityEquipmentSlot.CHEST);
	public static final Item NICKEL_LEGS = new EquipmentBase("nickel_legs", ARMOR_MATERIAL_NICKEL, 2, EntityEquipmentSlot.LEGS);
	public static final Item NICKEL_BOOTS = new EquipmentBase("nickel_boots", ARMOR_MATERIAL_NICKEL, 1, EntityEquipmentSlot.FEET);
	//Orichalcum
	public static final Item ORICHALCUM_HELMET = new EquipmentBase("orichalcum_helmet", ARMOR_MATERIAL_ORICHALCUM, 1, EntityEquipmentSlot.HEAD);
	public static final Item ORICHALCUM_CHEST = new EquipmentBase("orichalcum_chest", ARMOR_MATERIAL_ORICHALCUM, 1, EntityEquipmentSlot.CHEST);
	public static final Item ORICHALCUM_LEGS = new EquipmentBase("orichalcum_legs", ARMOR_MATERIAL_ORICHALCUM, 2, EntityEquipmentSlot.LEGS);
	public static final Item ORICHALCUM_BOOTS = new EquipmentBase("orichalcum_boots", ARMOR_MATERIAL_ORICHALCUM, 1, EntityEquipmentSlot.FEET);
	//Oureclase
	public static final Item OURECLASE_HELMET = new EquipmentBase("oureclase_helmet", ARMOR_MATERIAL_OURECLASE, 1, EntityEquipmentSlot.HEAD);
	public static final Item OURECLASE_CHEST = new EquipmentBase("oureclase_chest", ARMOR_MATERIAL_OURECLASE, 1, EntityEquipmentSlot.CHEST);
	public static final Item OURECLASE_LEGS = new EquipmentBase("oureclase_legs", ARMOR_MATERIAL_OURECLASE, 2, EntityEquipmentSlot.LEGS);
	public static final Item OURECLASE_BOOTS = new EquipmentBase("oureclase_boots", ARMOR_MATERIAL_OURECLASE, 1, EntityEquipmentSlot.FEET);
	//Platinum
	public static final Item PLATINUM_HELMET = new EquipmentBase("platinum_helmet", ARMOR_MATERIAL_PLATINUM, 1, EntityEquipmentSlot.HEAD);
	public static final Item PLATINUM_CHEST = new EquipmentBase("platinum_chest", ARMOR_MATERIAL_PLATINUM, 1, EntityEquipmentSlot.CHEST);
	public static final Item PLATINUM_LEGS = new EquipmentBase("platinum_legs", ARMOR_MATERIAL_PLATINUM, 2, EntityEquipmentSlot.LEGS);
	public static final Item PLATINUM_BOOTS = new EquipmentBase("platinum_boots", ARMOR_MATERIAL_PLATINUM, 1, EntityEquipmentSlot.FEET);
	//Prometheum
	public static final Item PROMETHEUM_HELMET = new EquipmentBase("prometheum_helmet", ARMOR_MATERIAL_PROMETHEUM, 1, EntityEquipmentSlot.HEAD);
	public static final Item PROMETHEUM_CHEST = new EquipmentBase("prometheum_chest", ARMOR_MATERIAL_PROMETHEUM, 1, EntityEquipmentSlot.CHEST);
	public static final Item PROMETHEUM_LEGS = new EquipmentBase("prometheum_legs", ARMOR_MATERIAL_PROMETHEUM, 2, EntityEquipmentSlot.LEGS);
	public static final Item PROMETHEUM_BOOTS = new EquipmentBase("prometheum_boots", ARMOR_MATERIAL_PROMETHEUM, 1, EntityEquipmentSlot.FEET);
	//Quicksilver
	public static final Item QUICKSILVER_HELMET = new EquipmentBase("quicksilver_helmet", ARMOR_MATERIAL_QUICKSILVER, 1, EntityEquipmentSlot.HEAD);
	public static final Item QUICKSILVER_CHEST = new EquipmentBase("quicksilver_chest", ARMOR_MATERIAL_QUICKSILVER, 1, EntityEquipmentSlot.CHEST);
	public static final Item QUICKSILVER_LEGS = new EquipmentBase("quicksilver_legs", ARMOR_MATERIAL_QUICKSILVER, 2, EntityEquipmentSlot.LEGS);
	public static final Item QUICKSILVER_BOOTS = new EquipmentBase("quicksilver_boots", ARMOR_MATERIAL_QUICKSILVER, 1, EntityEquipmentSlot.FEET);
	//Rubracium
	public static final Item RUBRACIUM_HELMET = new EquipmentBase("rubracium_helmet", ARMOR_MATERIAL_RUBRACIUM, 1, EntityEquipmentSlot.HEAD);
	public static final Item RUBRACIUM_CHEST = new EquipmentBase("rubracium_chest", ARMOR_MATERIAL_RUBRACIUM, 1, EntityEquipmentSlot.CHEST);
	public static final Item RUBRACIUM_LEGS = new EquipmentBase("rubracium_legs", ARMOR_MATERIAL_RUBRACIUM, 2, EntityEquipmentSlot.LEGS);
	public static final Item RUBRACIUM_BOOTS = new EquipmentBase("rubracium_boots", ARMOR_MATERIAL_RUBRACIUM, 1, EntityEquipmentSlot.FEET);
	//Sanguinite
	public static final Item SANGUINITE_HELMET = new EquipmentBase("sanguinite_helmet", ARMOR_MATERIAL_SANGUINITE, 1, EntityEquipmentSlot.HEAD);
	public static final Item SANGUINITE_CHEST = new EquipmentBase("sanguinite_chest", ARMOR_MATERIAL_SANGUINITE, 1, EntityEquipmentSlot.CHEST);
	public static final Item SANGUINITE_LEGS = new EquipmentBase("sanguinite_legs", ARMOR_MATERIAL_SANGUINITE, 2, EntityEquipmentSlot.LEGS);
	public static final Item SANGUINITE_BOOTS = new EquipmentBase("sanguinite_boots", ARMOR_MATERIAL_SANGUINITE, 1, EntityEquipmentSlot.FEET);
	//Shadow Iron
	public static final Item SHADOW_IRON_HELMET = new EquipmentBase("shadow_iron_helmet", ARMOR_MATERIAL_SHADOW_IRON, 1, EntityEquipmentSlot.HEAD);
	public static final Item SHADOW_IRON_CHEST = new EquipmentBase("shadow_iron_chest", ARMOR_MATERIAL_SHADOW_IRON, 1, EntityEquipmentSlot.CHEST);
	public static final Item SHADOW_IRON_LEGS = new EquipmentBase("shadow_iron_legs", ARMOR_MATERIAL_SHADOW_IRON, 2, EntityEquipmentSlot.LEGS);
	public static final Item SHADOW_IRON_BOOTS = new EquipmentBase("shadow_iron_boots", ARMOR_MATERIAL_SHADOW_IRON, 1, EntityEquipmentSlot.FEET);
	//Shadow Steel
	public static final Item SHADOW_STEEL_HELMET = new EquipmentBase("shadow_steel_helmet", ARMOR_MATERIAL_SHADOW_STEEL, 1, EntityEquipmentSlot.HEAD);
	public static final Item SHADOW_STEEL_CHEST = new EquipmentBase("shadow_steel_chest", ARMOR_MATERIAL_SHADOW_STEEL, 1, EntityEquipmentSlot.CHEST);
	public static final Item SHADOW_STEEL_LEGS = new EquipmentBase("shadow_steel_legs", ARMOR_MATERIAL_SHADOW_STEEL, 2, EntityEquipmentSlot.LEGS);
	public static final Item SHADOW_STEEL_BOOTS = new EquipmentBase("shadow_steel_boots", ARMOR_MATERIAL_SHADOW_STEEL, 1, EntityEquipmentSlot.FEET);
	//Silver
	public static final Item SILVER_HELMET = new EquipmentBase("silver_helmet", ARMOR_MATERIAL_SILVER, 1, EntityEquipmentSlot.HEAD);
	public static final Item SILVER_CHEST = new EquipmentBase("silver_chest", ARMOR_MATERIAL_SILVER, 1, EntityEquipmentSlot.CHEST);
	public static final Item SILVER_LEGS = new EquipmentBase("silver_legs", ARMOR_MATERIAL_SILVER, 2, EntityEquipmentSlot.LEGS);
	public static final Item SILVER_BOOTS = new EquipmentBase("silver_boots", ARMOR_MATERIAL_SILVER, 1, EntityEquipmentSlot.FEET);
	//Steel
	public static final Item STEEL_HELMET = new EquipmentBase("steel_helmet", ARMOR_MATERIAL_STEEL, 1, EntityEquipmentSlot.HEAD);
	public static final Item STEEL_CHEST = new EquipmentBase("steel_chest", ARMOR_MATERIAL_STEEL, 1, EntityEquipmentSlot.CHEST);
	public static final Item STEEL_LEGS = new EquipmentBase("steel_legs", ARMOR_MATERIAL_STEEL, 2, EntityEquipmentSlot.LEGS);
	public static final Item STEEL_BOOTS = new EquipmentBase("steel_boots", ARMOR_MATERIAL_STEEL, 1, EntityEquipmentSlot.FEET);
	//Tartarite
	public static final Item TARTARITE_HELMET = new EquipmentBase("tartarite_helmet", ARMOR_MATERIAL_TARTARITE, 1, EntityEquipmentSlot.HEAD);
	public static final Item TARTARITE_CHEST = new EquipmentBase("tartarite_chest", ARMOR_MATERIAL_TARTARITE, 1, EntityEquipmentSlot.CHEST);
	public static final Item TARTARITE_LEGS = new EquipmentBase("tartarite_legs", ARMOR_MATERIAL_TARTARITE, 2, EntityEquipmentSlot.LEGS);
	public static final Item TARTARITE_BOOTS = new EquipmentBase("tartarite_boots", ARMOR_MATERIAL_TARTARITE, 1, EntityEquipmentSlot.FEET);
	//Tin
	public static final Item TIN_HELMET = new EquipmentBase("tin_helmet", ARMOR_MATERIAL_TIN, 1, EntityEquipmentSlot.HEAD);
	public static final Item TIN_CHEST = new EquipmentBase("tin_chest", ARMOR_MATERIAL_TIN, 1, EntityEquipmentSlot.CHEST);
	public static final Item TIN_LEGS = new EquipmentBase("tin_legs", ARMOR_MATERIAL_TIN, 2, EntityEquipmentSlot.LEGS);
	public static final Item TIN_BOOTS = new EquipmentBase("tin_boots", ARMOR_MATERIAL_TIN, 1, EntityEquipmentSlot.FEET);
	//Titanium
	public static final Item TITANIUM_HELMET = new EquipmentBase("titanium_helmet", ARMOR_MATERIAL_TITANIUM, 1, EntityEquipmentSlot.HEAD);
	public static final Item TITANIUM_CHEST = new EquipmentBase("titanium_chest", ARMOR_MATERIAL_TITANIUM, 1, EntityEquipmentSlot.CHEST);
	public static final Item TITANIUM_LEGS = new EquipmentBase("titanium_legs", ARMOR_MATERIAL_TITANIUM, 2, EntityEquipmentSlot.LEGS);
	public static final Item TITANIUM_BOOTS = new EquipmentBase("titanium_boots", ARMOR_MATERIAL_TITANIUM, 1, EntityEquipmentSlot.FEET);
	//Vulcanite
	public static final Item VULCANITE_HELMET = new EquipmentBase("vulcanite_helmet", ARMOR_MATERIAL_VULCANITE, 1, EntityEquipmentSlot.HEAD);
	public static final Item VULCANITE_CHEST = new EquipmentBase("vulcanite_chest", ARMOR_MATERIAL_VULCANITE, 1, EntityEquipmentSlot.CHEST);
	public static final Item VULCANITE_LEGS = new EquipmentBase("vulcanite_legs", ARMOR_MATERIAL_VULCANITE, 2, EntityEquipmentSlot.LEGS);
	public static final Item VULCANITE_BOOTS = new EquipmentBase("vulcanite_boots", ARMOR_MATERIAL_VULCANITE, 1, EntityEquipmentSlot.FEET);
	//Vyroxeres
	public static final Item VYROXERES_HELMET = new EquipmentBase("vyroxeres_helmet", ARMOR_MATERIAL_VYROXERES, 1, EntityEquipmentSlot.HEAD);
	public static final Item VYROXERES_CHEST = new EquipmentBase("vyroxeres_chest", ARMOR_MATERIAL_VYROXERES, 1, EntityEquipmentSlot.CHEST);
	public static final Item VYROXERES_LEGS = new EquipmentBase("vyroxeres_legs", ARMOR_MATERIAL_VYROXERES, 2, EntityEquipmentSlot.LEGS);
	public static final Item VYROXERES_BOOTS = new EquipmentBase("vyroxeres_boots", ARMOR_MATERIAL_VYROXERES, 1, EntityEquipmentSlot.FEET);
}