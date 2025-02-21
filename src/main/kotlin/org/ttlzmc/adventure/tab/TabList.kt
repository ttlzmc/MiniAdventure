package org.ttlzmc.adventure.tab

import net.kyori.adventure.audience.Audience
import net.kyori.adventure.text.ComponentLike

/**
 * A class concerned with setting the top and bottom of the player list for a particular player.
 * @author xw1w1
 */
@Suppress("MemberVisibilityCanBePrivate", "unused")
object TabList {

    /**
     * Sends a header component to the specific Audience
     * @param target target
     * @param header Header [ComponentLike]
     * @author xw1w1
     */
    fun setHeader(target: Audience, header: ComponentLike) {
        target.sendPlayerListHeader(header)
    }

    /**
     * Sends a footer component to the specific Audience
     * @param target target
     * @param footer Header [ComponentLike]
     * @author xw1w1
     */
    fun setFooter(target: Audience, footer: ComponentLike) {
        target.sendPlayerListFooter(footer)
    }

    /**
     * Sends both header and footer components to the specific Audience
     * @param target target
     * @param header Header [ComponentLike]
     * @param footer Footer [ComponentLike]
     * @author xw1w1
     */
    fun set(target: Audience, header: ComponentLike, footer: ComponentLike) {
        target.sendPlayerListHeaderAndFooter(header, footer)
    }
}