package com.junethewoods.themato.sound;

import com.junethewoods.themato.TheMato;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class MTSounds {
    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, TheMato.MOD_ID);

    // Biome Music
    public static final RegistryObject<SoundEvent> MEADOW_MUSIC = SOUNDS.register("music.overworld.meadow", () -> new SoundEvent(TheMato.resourceLoc("music.overworld.meadow")));
    public static final RegistryObject<SoundEvent> FROZEN_PEAKS_MUSIC = SOUNDS.register("music.overworld.frozen_peaks", () -> new SoundEvent(TheMato.resourceLoc("music.overworld.frozen_peaks")));
    public static final RegistryObject<SoundEvent> SNOWY_SLOPES_MUSIC = SOUNDS.register("music.overworld.snowy_slopes", () -> new SoundEvent(TheMato.resourceLoc("music.overworld.snowy_slopes")));
    public static final RegistryObject<SoundEvent> JAGGED_PEAKS_MUSIC = SOUNDS.register("music.overworld.jagged_peaks", () -> new SoundEvent(TheMato.resourceLoc("music.overworld.jagged_peaks")));
    public static final RegistryObject<SoundEvent> STONY_PEAKS_MUSIC = SOUNDS.register("music.overworld.stony_peaks", () -> new SoundEvent(TheMato.resourceLoc("music.overworld.stony_peaks")));
    public static final RegistryObject<SoundEvent> GROVE_MUSIC = SOUNDS.register("music.overworld.grove", () -> new SoundEvent(TheMato.resourceLoc("music.overworld.grove")));

    // Blocks
    public static final RegistryObject<SoundEvent> POWDER_SNOW_BREAK = SOUNDS.register("block.powder_snow.break", () -> new SoundEvent(TheMato.resourceLoc("block.powder_snow.break")));
    public static final RegistryObject<SoundEvent> POWDER_SNOW_FALL = SOUNDS.register("block.powder_snow.fall", () -> new SoundEvent(TheMato.resourceLoc("block.powder_snow.fall")));
    public static final RegistryObject<SoundEvent> POWDER_SNOW_HIT = SOUNDS.register("block.powder_snow.hit", () -> new SoundEvent(TheMato.resourceLoc("block.powder_snow.hit")));
    public static final RegistryObject<SoundEvent> POWDER_SNOW_PLACE = SOUNDS.register("block.powder_snow.place", () -> new SoundEvent(TheMato.resourceLoc("block.powder_snow.place")));
    public static final RegistryObject<SoundEvent> POWDER_SNOW_STEP = SOUNDS.register("block.powder_snow.step", () -> new SoundEvent(TheMato.resourceLoc("block.powder_snow.step")));
    public static final RegistryObject<SoundEvent> CALCITE_BREAK = SOUNDS.register("block.calcite.break", () -> new SoundEvent(TheMato.resourceLoc("block.calcite.break")));
    public static final RegistryObject<SoundEvent> CALCITE_FALL = SOUNDS.register("block.calcite.fall", () -> new SoundEvent(TheMato.resourceLoc("block.calcite.fall")));
    public static final RegistryObject<SoundEvent> CALCITE_HIT = SOUNDS.register("block.calcite.hit", () -> new SoundEvent(TheMato.resourceLoc("block.calcite.hit")));
    public static final RegistryObject<SoundEvent> CALCITE_PLACE = SOUNDS.register("block.calcite.place", () -> new SoundEvent(TheMato.resourceLoc("block.calcite.place")));
    public static final RegistryObject<SoundEvent> CALCITE_STEP = SOUNDS.register("block.calcite.step", () -> new SoundEvent(TheMato.resourceLoc("block.calcite.step")));

    // Items
    public static final RegistryObject<SoundEvent> POWDER_SNOW_BUCKET_EMPTY = SOUNDS.register("item.powder_snow_bucket.empty", () -> new SoundEvent(TheMato.resourceLoc("item.powder_snow_bucket.empty")));
}
