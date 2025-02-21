package org.ttlzmc.adventure.sound

import net.kyori.adventure.key.Key

/**
 * A [Key] holder for all available music disks.
 * @param key Key of this sound.
 * @author xw1w1
 */
@Suppress("unused")
enum class MusicDisc(val key: Key) {
    DISC13(Key.key("music_disc.13")),
    CAT(Key.key("music_disc.cat")),
    BLOCKS(Key.key("music_disc.blocks")),
    CHIRP(Key.key("music_disc.chirp")),
    FAR(Key.key("music_disc.far")),
    MALL(Key.key("music_disc.mall")),
    MELLOHI(Key.key("music_disc.mellohi")),
    STAL(Key.key("music_disc.stal")),
    STRAD(Key.key("music_disc.strad")),
    WARD(Key.key("music_disc.ward")),
    DISC11(Key.key("music_disc.11")),
    WAIT(Key.key("music_disc.wait")),
    OTHERSIDE(Key.key("music_disc.otherside")),
    DISC5(Key.key("music_disc.5")),
    PIGSTEP(Key.key("music_disс.pigstep")),
    RELIC(Key.key("music_disc.relic")),
    CREATOR(Key.key("music_disc.creator")),
    CREATOR_MUSIC_BOX(Key.key("music_disc.creator_music_box")),
    PRECIPE(Key.key("music_disc.precipe")),
}