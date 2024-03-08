package com.junethewoods.themato.sound;

import net.minecraft.util.SoundEvent;
import net.minecraftforge.common.util.ForgeSoundType;

import java.util.function.Supplier;

public class MTSoundTypes extends ForgeSoundType {
    public static final MTSoundTypes POWDER_SNOW = new MTSoundTypes(1, 1, MTSounds.POWDER_SNOW_BREAK, MTSounds.POWDER_SNOW_STEP, MTSounds.POWDER_SNOW_PLACE, MTSounds.POWDER_SNOW_HIT, MTSounds.POWDER_SNOW_FALL);
    public static final MTSoundTypes CALCITE = new MTSoundTypes(1, 1, MTSounds.CALCITE_BREAK, MTSounds.CALCITE_STEP, MTSounds.CALCITE_PLACE, MTSounds.CALCITE_HIT, MTSounds.CALCITE_FALL);

    public MTSoundTypes(float volume, float pitch, Supplier<SoundEvent> breakSound, Supplier<SoundEvent> stepSound, Supplier<SoundEvent> placeSound, Supplier<SoundEvent> hitSound, Supplier<SoundEvent> fallSound) {
        super(volume, pitch, breakSound, stepSound, placeSound, hitSound, fallSound);
    }
}
