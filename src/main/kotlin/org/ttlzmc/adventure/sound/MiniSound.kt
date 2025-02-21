package org.ttlzmc.adventure.sound

import net.kyori.adventure.key.Key
import net.kyori.adventure.sound.Sound
import org.jetbrains.annotations.Contract

/**
 * A class that allows you to create [Sound]s a little faster.
 * @author xw1w1
 */
@Suppress("MemberVisibilityCanBePrivate", "unused")
object MiniSound {

    /**
     * Creates a new sound with selected [MusicDisc] and default volume, pitch.
     * @author xw1w1
     */
    @Contract("_, _, _ -> new")
    fun disc(disc: MusicDisc, volume: Float, pitch: Float): Sound {
        return Sound.sound(disc.key, Sound.Source.RECORD, volume, pitch)
    }

    /**
     * Creates a new sound with [Sound.Source.MASTER], selected volume and pitch.
     * @author xw1w1
     */
    @Contract("_, _, _ -> new")
    fun master(key: Key, volume: Float, pitch: Float): Sound {
        return Sound.sound(key, Sound.Source.MASTER, volume, pitch)
    }

    /**
     * Creates a new sound with [Sound.Source.MUSIC], selected volume and pitch.
     * @author xw1w1
     */
    @Contract("_, _, _ -> new")
    fun music(key: Key, volume: Float, pitch: Float): Sound {
        return Sound.sound(key, Sound.Source.MUSIC, volume, pitch)
    }

    /**
     * Creates a new sound with [Sound.Source.RECORD], selected volume and pitch.
     * @author xw1w1
     */
    @Contract("_, _, _ -> new")
    fun record(key: Key, volume: Float, pitch: Float): Sound {
        return Sound.sound(key, Sound.Source.RECORD, volume, pitch)
    }

    /**
     * Creates a new sound with [Sound.Source.MASTER], selected [MusicDisc], volume and pitch.
     * @author xw1w1
     */
    @Contract("_, _, _ -> new")
    fun record(disc: MusicDisc, volume: Float, pitch: Float): Sound {
        return disc(disc, volume, pitch)
    }

    /**
     * Creates a new sound with [Sound.Source.WEATHER], selected volume and pitch.
     * @author xw1w1
     */
    @Contract("_, _, _ -> new")
    fun weather(key: Key, volume: Float, pitch: Float): Sound {
        return Sound.sound(key, Sound.Source.WEATHER, volume, pitch)
    }

    /**
     * Creates a new sound with [Sound.Source.BLOCK], selected volume and pitch.
     * @author xw1w1
     */
    @Contract("_, _, _ -> new")
    fun block(key: Key, volume: Float, pitch: Float): Sound {
        return Sound.sound(key, Sound.Source.BLOCK, volume, pitch)
    }

    /**
     * Creates a new sound with [Sound.Source.HOSTILE], selected volume and pitch.
     * @author xw1w1
     */
    @Contract("_, _, _ -> new")
    fun hostile(key: Key, volume: Float, pitch: Float): Sound {
        return Sound.sound(key, Sound.Source.HOSTILE, volume, pitch)
    }

    /**
     * Creates a new sound with [Sound.Source.NEUTRAL], selected volume and pitch.
     * @author xw1w1
     */
    @Contract("_, _, _ -> new")
    fun neutral(key: Key, volume: Float, pitch: Float): Sound {
        return Sound.sound(key, Sound.Source.NEUTRAL, volume, pitch)
    }

    /**
     * Creates a new sound with [Sound.Source.PLAYER], selected volume and pitch.
     * @author xw1w1
     */
    @Contract("_, _, _ -> new")
    fun player(key: Key, volume: Float, pitch: Float): Sound {
        return Sound.sound(key, Sound.Source.PLAYER, volume, pitch)
    }

    /**
     * Creates a new sound with [Sound.Source.AMBIENT], selected volume and pitch.
     * @author xw1w1
     */
    @Contract("_, _, _ -> new")
    fun ambient(key: Key, volume: Float, pitch: Float): Sound {
        return Sound.sound(key, Sound.Source.AMBIENT, volume, pitch)
    }

    /**
     * Creates a new sound with [Sound.Source.VOICE], selected volume and pitch.
     * @author xw1w1
     */
    @Contract("_, _, _ -> new")
    fun voice(key: Key, volume: Float, pitch: Float): Sound {
        return Sound.sound(key, Sound.Source.VOICE, volume, pitch)
    }
}