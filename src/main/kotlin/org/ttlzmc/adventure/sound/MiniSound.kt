package org.ttlzmc.adventure.sound

import net.kyori.adventure.key.Key
import net.kyori.adventure.sound.Sound
import org.jetbrains.annotations.Contract

@Suppress("MemberVisibilityCanBePrivate", "unused")
object MiniSounds {

    @Contract("_, _, _ -> new")
    fun disc(disc: MusicDisc, volume: Float, pitch: Float): Sound {
        return Sound.sound(disc.key, Sound.Source.RECORD, volume, pitch)
    }

    @Contract("_, _, _ -> new")
    fun master(key: Key, volume: Float, pitch: Float): Sound {
        return Sound.sound(key, Sound.Source.MASTER, volume, pitch)
    }

    @Contract("_, _, _ -> new")
    fun music(key: Key, volume: Float, pitch: Float): Sound {
        return Sound.sound(key, Sound.Source.MUSIC, volume, pitch)
    }

    @Contract("_, _, _ -> new")
    fun record(key: Key, volume: Float, pitch: Float): Sound {
        return Sound.sound(key, Sound.Source.RECORD, volume, pitch)
    }

    @Contract("_, _, _ -> new")
    fun record(disc: MusicDisc, volume: Float, pitch: Float): Sound {
        return disc(disc, volume, pitch)
    }

    @Contract("_, _, _ -> new")
    fun weather(key: Key, volume: Float, pitch: Float): Sound {
        return Sound.sound(key, Sound.Source.WEATHER, volume, pitch)
    }

    @Contract("_, _, _ -> new")
    fun block(key: Key, volume: Float, pitch: Float): Sound {
        return Sound.sound(key, Sound.Source.BLOCK, volume, pitch)
    }

    @Contract("_, _, _ -> new")
    fun hostile(key: Key, volume: Float, pitch: Float): Sound {
        return Sound.sound(key, Sound.Source.HOSTILE, volume, pitch)
    }

    @Contract("_, _, _ -> new")
    fun neutral(key: Key, volume: Float, pitch: Float): Sound {
        return Sound.sound(key, Sound.Source.NEUTRAL, volume, pitch)
    }

    @Contract("_, _, _ -> new")
    fun player(key: Key, volume: Float, pitch: Float): Sound {
        return Sound.sound(key, Sound.Source.PLAYER, volume, pitch)
    }

    @Contract("_, _, _ -> new")
    fun ambient(key: Key, volume: Float, pitch: Float): Sound {
        return Sound.sound(key, Sound.Source.AMBIENT, volume, pitch)
    }

    @Contract("_, _, _ -> new")
    fun voice(key: Key, volume: Float, pitch: Float): Sound {
        return Sound.sound(key, Sound.Source.VOICE, volume, pitch)
    }
}