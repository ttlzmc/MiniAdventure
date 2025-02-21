package org.ttlzmc.adventure.title

import net.kyori.adventure.text.Component
import net.kyori.adventure.title.Title
import net.kyori.adventure.title.Title.Times
import net.kyori.adventure.util.Ticks
import org.jetbrains.annotations.Contract
import java.time.Duration

/**
 * A class that allows you to create titles a little faster.
 * @author xw1w1
 */
@Suppress("MemberVisibilityCanBePrivate", "unused")
object MiniTitle {

    /**
     * Creates a new [Title.Times] with given fade out, stay and fade out durations.
     * @author xw1w1
     */
    @Contract("_, _, _ -> new")
    fun times(fin: Duration, stay: Duration, fout: Duration): Times {
        return Times.times(fin, stay, fout)
    }

    /**
     * Creates a new [Title.Times] with given fade out, stay and fade out durations in ticks.
     * @author xw1w1
     */
    @Contract("_, _, _ -> new")
    fun times(fin: Long, stay: Long, fout: Long): Times {
        return Times.times(Ticks.duration(fin), Ticks.duration(stay), Ticks.duration(fout))
    }

    /**
     * Creates a new [Title] with given title and subtitle components.
     * @author xw1w1
     */
    @Contract("_, _ -> new")
    fun title(title: Component, subtitle: Component): Title {
        return Title.title(title, subtitle)
    }

    /**
     * Creates a new [Title] with given [Times], title and subtitle components.
     * @author xw1w1
     */
    @Contract("_, _, _ -> new")
    fun title(title: Component, subtitle: Component, times: Times): Title {
        return Title.title(title, subtitle, times)
    }

    /**
     * Creates a new [Title] with given title and subtitle components, fade in, stay, fade out durations.
     * @author xw1w1
     */
    @Contract("_, _, _, _, _ -> new")
    fun title(title: Component, subtitle: Component, fin: Duration, stay: Duration, fout: Duration): Title {
        return Title.title(title, subtitle, times(fin, stay, fout))
    }

    /**
     * Creates a new [Title] with given title and subtitle components, fade in, stay, fade out durations in ticks.
     * @author xw1w1
     */
    @Contract("_, _, _, _, _ -> new")
    fun title(title: Component, subtitle: Component, fin: Long, stay: Long, fout: Long): Title {
        return Title.title(title, subtitle, times(fin, stay, fout))
    }
}