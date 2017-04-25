package rustic.common.blocks.crops;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.EnumPlantType;
import rustic.common.items.ItemHerbEdible;

public class Herbs {
	
	public static BlockHerbBase ALOE_VERA;
	public static BlockHerbBase BLOOD_ORCHID;
	public static BlockHerbBase CHAMOMILE;
	public static BlockHerbBase COHOSH;
	public static BlockHerbBase CORE_ROOT_CROP;
	public static BlockHerbBase DEATHSTALK;
	public static BlockHerbBase GINSENG_CROP;
	public static BlockHerbBase HORSETAIL;
	public static BlockHerbBase MARSH_MALLOW_CROP;
	public static BlockHerbBase MOONCAP;
	public static BlockHerbBase WIND_THISTLE;
	
	public static ItemHerbEdible CORE_ROOT;
	public static ItemHerbEdible GINSENG;
	public static ItemHerbEdible MARSH_MALLOW;

	public static void init() {
		ALOE_VERA = new BlockHerbBase("aloe_vera", false) {
			@Override
			public EnumPlantType getPlantType(IBlockAccess world, BlockPos pos) {
				return EnumPlantType.Desert;
			}

			@Override
			public Item getHerb() {
				return Item.getItemFromBlock(this);
			}
		};
		BLOOD_ORCHID = new BlockHerbBase("blood_orchid", false) {
			@Override
			public EnumPlantType getPlantType(IBlockAccess world, BlockPos pos) {
				return EnumPlantType.Plains;
			}

			@Override
			public Item getHerb() {
				return Item.getItemFromBlock(this);
			}
		};
		CHAMOMILE = new BlockHerbBase("chamomile", false) {
			@Override
			public EnumPlantType getPlantType(IBlockAccess world, BlockPos pos) {
				return EnumPlantType.Plains;
			}

			@Override
			public Item getHerb() {
				return Item.getItemFromBlock(this);
			}
		};
		COHOSH = new BlockHerbBase("cohosh", false) {
			@Override
			public EnumPlantType getPlantType(IBlockAccess world, BlockPos pos) {
				return EnumPlantType.Plains;
			}

			@Override
			public Item getHerb() {
				return Item.getItemFromBlock(this);
			}
		};
		CORE_ROOT_CROP = new BlockHerbBase("core_root", true) {
			@Override
			public EnumPlantType getPlantType(IBlockAccess world, BlockPos pos) {
				return EnumPlantType.Cave;
			}

			@Override
			public Item getHerb() {
				return CORE_ROOT;
			}
		};
		DEATHSTALK = new BlockHerbBase("deathstalk_mushroom", false) {
			@Override
			public EnumPlantType getPlantType(IBlockAccess world, BlockPos pos) {
				return EnumPlantType.Cave;
			}

			@Override
			public Item getHerb() {
				return Item.getItemFromBlock(this);
			}
		};
		GINSENG_CROP = new BlockHerbBase("ginseng", true){
			@Override
			public EnumPlantType getPlantType(IBlockAccess world, BlockPos pos) {
				return EnumPlantType.Plains;
			}

			@Override
			public Item getHerb() {
				return GINSENG;
			}
		};
		HORSETAIL = new BlockHerbBase("horsetail", false) {
			@Override
			public EnumPlantType getPlantType(IBlockAccess world, BlockPos pos) {
				return EnumPlantType.Plains;
			}

			@Override
			public Item getHerb() {
				return Item.getItemFromBlock(this);
			}
		};
		MARSH_MALLOW_CROP = new BlockHerbBase("marsh_mallow", true) {
			@Override
			public EnumPlantType getPlantType(IBlockAccess world, BlockPos pos) {
				return EnumPlantType.Plains;
			}

			@Override
			public Item getHerb() {
				return MARSH_MALLOW;
			}
		};
		MOONCAP = new BlockHerbBase("mooncap_mushroom", false) {
			@Override
			public EnumPlantType getPlantType(IBlockAccess world, BlockPos pos) {
				return EnumPlantType.Cave;
			}

			@Override
			public Item getHerb() {
				return Item.getItemFromBlock(this);
			}
			
			@Override
			 public int getLightValue(IBlockState state) {
				return 8;
			}
		};
		WIND_THISTLE = new BlockHerbBase("wind_thistle", false) {
			@Override
			public EnumPlantType getPlantType(IBlockAccess world, BlockPos pos) {
				return EnumPlantType.Plains;
			}

			@Override
			public Item getHerb() {
				return Item.getItemFromBlock(this);
			}
		};
		
		CORE_ROOT = new ItemHerbEdible(CORE_ROOT_CROP, 2, 0.3F);
		GINSENG = new ItemHerbEdible(GINSENG_CROP, 2, 0.3F);
		MARSH_MALLOW = new ItemHerbEdible(MARSH_MALLOW_CROP, 3, 0.3F);
	}
	
	public static void initModels() {
		ALOE_VERA.initModel();
		BLOOD_ORCHID.initModel();
		CHAMOMILE.initModel();
		COHOSH.initModel();
		CORE_ROOT_CROP.initModel();
		DEATHSTALK.initModel();
		GINSENG_CROP.initModel();
		HORSETAIL.initModel();
		MARSH_MALLOW_CROP.initModel();
		MOONCAP.initModel();
		WIND_THISTLE.initModel();
		
		CORE_ROOT.initModel();
		GINSENG.initModel();
		MARSH_MALLOW.initModel();
	}
	
	public static BlockHerbBase getRandomHerbForBiome(Biome biome, Random rand) {
		List<BlockHerbBase> herbs = new ArrayList<BlockHerbBase>();
		//Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(biome);
		
		if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.JUNGLE)) {
			herbs.add(BLOOD_ORCHID);
			herbs.add(HORSETAIL);
			herbs.add(MARSH_MALLOW_CROP);
			herbs.add(MOONCAP);
		} else if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.SANDY)) {
			herbs.add(ALOE_VERA);
		} else if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.SAVANNA)) {
			herbs.add(ALOE_VERA);
		} else if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.MESA)) {
			herbs.add(ALOE_VERA);
		} else if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.MOUNTAIN) && !BiomeDictionary.hasType(biome, BiomeDictionary.Type.SNOWY)) {
			herbs.add(WIND_THISTLE);
		} else if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.SWAMP) && !BiomeDictionary.hasType(biome, BiomeDictionary.Type.SNOWY)) {
			herbs.add(CHAMOMILE);
			herbs.add(HORSETAIL);
			herbs.add(MARSH_MALLOW_CROP);
		} else if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.FOREST) && !BiomeDictionary.hasType(biome, BiomeDictionary.Type.SNOWY)) {
			herbs.add(CHAMOMILE);
			herbs.add(COHOSH);
			herbs.add(GINSENG_CROP);
			herbs.add(HORSETAIL);
		} else if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.PLAINS) && !BiomeDictionary.hasType(biome, BiomeDictionary.Type.SNOWY)) {
			herbs.add(CHAMOMILE);
			herbs.add(GINSENG_CROP);
			herbs.add(HORSETAIL);
			herbs.add(WIND_THISTLE);
		} else {
			return null;
		}
		
		return herbs.get(rand.nextInt(herbs.size()));
	}
	
	public static BlockHerbBase getRandomCaveHerb(Random rand) {
		BlockHerbBase[] herbs = new BlockHerbBase[] {
				CORE_ROOT_CROP,
				MOONCAP
		};
		return herbs[rand.nextInt(herbs.length)];
	}
	
	public static BlockHerbBase getRandomNetherHerb(Random rand) {
		return DEATHSTALK;
	}
	
}
