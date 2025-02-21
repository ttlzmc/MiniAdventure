package org.ttlzmc.adventure.bossbar

import net.kyori.adventure.bossbar.BossBar
import net.kyori.adventure.bossbar.BossBar.Overlay
import net.kyori.adventure.bossbar.BossBar.Color
import net.kyori.adventure.text.Component
import org.jetbrains.annotations.Contract

/**
 * A class that allows you to create BossBars a little faster.
 * @author xw1w1
 */
@Suppress("MemberVisibilityCanBePrivate", "unused")
object MiniBossBar {

    /**
     * Creates a new [BossBar] with 0 progress, specified [Color] and [Overlay.PROGRESS]
     * @author xw1w1
     */
    @Contract("_ -> new")
    fun empty(color: Color): BossBar {
        return BossBar.bossBar(Component.empty(), 0f, color, Overlay.PROGRESS)
    }

    /**
     * Creates a new [BossBar] with half progress, specified [Color] and [Overlay.PROGRESS]
     * @author xw1w1
     */
    @Contract("_ -> new")
    fun half(color: Color): BossBar {
        return BossBar.bossBar(Component.empty(), 0.5f, color, Overlay.PROGRESS)
    }

    /**
     * Creates a new [BossBar] with full progress, specified [Color] and [Overlay.PROGRESS]
     * @author xw1w1
     */
    @Contract("_ -> new")
    fun full(color: Color): BossBar {
        return BossBar.bossBar(Component.empty(), 1.0f, color, Overlay.PROGRESS)
    }

    /**
     * Creates a new [BossBar] with 0 progress, specified [Color] and [Overlay]
     * @author xw1w1
     */
    @Contract("_, _ -> new")
    fun empty(color: Color, overlay: Overlay): BossBar {
        return BossBar.bossBar(Component.empty(), 0f, color, overlay)
    }

    /**
     * Creates a new [BossBar] with half progress, specified [Color] and [Overlay]
     * @author xw1w1
     */
    @Contract("_, _ -> new")
    fun half(color: Color, overlay: Overlay): BossBar {
        return BossBar.bossBar(Component.empty(), 0.5f, color, overlay)
    }

    /**
     * Creates a new [BossBar] with full progress, specified [Color] and [Overlay]
     * @author xw1w1
     */
    @Contract("_, _ -> new")
    fun full(color: Color, overlay: Overlay): BossBar {
        return BossBar.bossBar(Component.empty(), 1.0f, color, overlay)
    }

    /**
     * Creates a new [BossBar] with 0 progress, specified name, [Color] and [Overlay]
     * @author xw1w1
     */
    @Contract("_, _, _ -> new")
    fun empty(name: Component, color: Color, overlay: Overlay): BossBar {
        return BossBar.bossBar(name, 0f, color, overlay)
    }

    /**
     * Creates a new [BossBar] with half progress, specified name, [Color] and [Overlay]
     * @author xw1w1
     */
    @Contract("_, _, _ -> new")
    fun half(name: Component, color: Color, overlay: Overlay): BossBar {
        return BossBar.bossBar(name, 0.5f, color, overlay)
    }

    /**
     * Creates a new [BossBar] with full progress, specified name, [Color] and [Overlay]
     * @author xw1w1
     */
    @Contract("_, _, _ -> new")
    fun full(name: Component, color: Color, overlay: Overlay): BossBar {
        return BossBar.bossBar(name, 1.0f, color, overlay)
    }

    /**
     * Creates a new [BossBar] with specified name, progress, [Color] and [Overlay]
     * @author xw1w1
     */
    @Contract("_, _, _, _ -> new")
    fun bossBar(name: Component, color: Color, overlay: Overlay, progress: Float): BossBar {
        return BossBar.bossBar(name, progress, color, overlay)
    }

}