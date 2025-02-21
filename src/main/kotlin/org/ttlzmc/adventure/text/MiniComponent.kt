package org.ttlzmc.adventure.text

import net.kyori.adventure.text.Component
import net.kyori.adventure.text.JoinConfiguration
import net.kyori.adventure.text.format.NamedTextColor
import net.kyori.adventure.text.format.TextColor
import net.kyori.adventure.text.format.TextDecoration
import net.kyori.adventure.text.minimessage.MiniMessage
import net.kyori.adventure.text.minimessage.tag.resolver.Placeholder
import net.kyori.adventure.text.serializer.plain.PlainTextComponentSerializer
import net.kyori.adventure.text.event.ClickEvent;
import net.kyori.adventure.text.event.HoverEvent;
import org.jetbrains.annotations.Contract
import org.jetbrains.annotations.Nullable

/**
 * A class that allows you to easily create text components.
 * @author xw1w1
 */
@Suppress("MemberVisibilityCanBePrivate", "unused")
object MiniComponent {

    /**
     * Connects provided [Component]'s together.
     * @param components components
     * @author xw1w1
     */
    @Contract("_ -> new")
    fun single(vararg components: Component): Component {
        return Component.join(JoinConfiguration.noSeparators(), components.toList())
    }

    /**
     * Creates a new [Component] from provided object.
     * @param any An object, can be [Int], [String], [Component] or anything else.
     * @author xw1w1
     */
    @Contract("_ -> new")
    fun component(any: Any?): Component {
        return if (any == null) Component.empty() else if (any is Component) any else Component.text(any.toString())
    }

    /**
     * Creates a new [Component]'s from provided objects.
     * @param objects An object list, objects can be [Int], [String], [Component] or anything else.
     * @author xw1w1
     */
    @Contract("_ -> new")
    fun components(vararg objects: Any?): Array<Component> {
        return objects.toList().map { component(it) }.toTypedArray()
    }

    /**
     * Creates a new [Component] from provided objects by placing all of them to new lines.
     * @param objects An object list, objects can be [Int], [String], [Component] or anything else.
     * @author xw1w1
     */
    @Contract("_ -> new")
    fun newlined(vararg objects: Any?): Component {
        return Component.join(JoinConfiguration.newlines(), components(*objects).toList())
    }

    /**
     * Creates a [Component.newline].
     * @author xw1w1
     */
    fun newline(): Component = Component.newline()

    /**
     * Creates a [Component.empty].
     * @author xw1w1
     */
    fun empty(): Component = Component.empty()

    /**
     * Turns these objects into components, then glues them together and turns them into a string.
     * @param objects An object list, objects can be [Int], [String], [Component] or anything else.
     * @author xw1w1
     */
    @Contract("_ -> new")
    fun toString(vararg objects: Any): String {
        return PlainTextComponentSerializer.plainText().serialize(single(*components(*objects)))
    }

    /**
     * Creates a new gradient [Component] using MiniMessage.
     * @param color0 First color in HEX format, with or without '#'
     * @param color1 Second color in HEX format, with or without '#'
     * @author xw1w1
     */
    @Contract("_, _, _ -> new")
    fun gradient(color0: String, color1: String, vararg objects: Any): Component {
        val color2 = if (color0.startsWith("#")) color0.substring(1) else color0
        val color3 = if (color1.startsWith("#")) color1.substring(1) else color1
        return MiniMessage.miniMessage().deserialize(
            "<gradient:#$color2:#$color3><content></gradient>",
            Placeholder.component("content", single(*components(*objects)))
        )
    }

    /**
     * Creates a new [Component] with provided hex color.
     * @param color HEX color string.
     * @author xw1w1
     */
    @Contract("_, _ -> new")
    fun hex(color: String, @Nullable vararg objects: Any): Component {
        return single(*components(*objects)).colorIfAbsent(TextColor.fromHexString(color))
    }

    /**
     * Resets all [TextDecoration] from given objects.
     * @param objects An object list, objects can be [Int], [String], [Component] or anything else.
     * @author xw1w1
     */
    @Contract("_ -> new")
    fun reset(@Nullable vararg objects: Any?): Component {
        return single(*components(*objects)).decoration(TextDecoration.ITALIC, false)
            .decoration(TextDecoration.BOLD, false).decoration(TextDecoration.UNDERLINED, false)
            .decoration(TextDecoration.STRIKETHROUGH, false).decoration(TextDecoration.OBFUSCATED, false)
    }

    /**
     * Creates a new [Component] with [TextDecoration.BOLD].
     * @param objects An object list, objects can be [Int], [String], [Component] or anything else.
     * @author xw1w1
     */
    @Contract("_ -> new")
    fun bold(@Nullable vararg objects: Any?): Component {
        return single(*components(*objects)).decorate(TextDecoration.BOLD)
    }

    /**
     * Creates a new [Component] with [TextDecoration.ITALIC].
     * @param objects An object list, objects can be [Int], [String], [Component] or anything else.
     * @author xw1w1
     */
    @Contract("_ -> new")
    fun italic(@Nullable vararg objects: Any?): Component {
        return single(*components(*objects)).decorate(TextDecoration.ITALIC)
    }

    /**
     * Creates a new [Component] with [TextDecoration.STRIKETHROUGH].
     * @param objects An object list, objects can be [Int], [String], [Component] or anything else.
     * @author xw1w1
     */
    @Contract("_ -> new")
    fun strikethrough(@Nullable vararg objects: Any?): Component {
        return single(*components(*objects)).decorate(TextDecoration.STRIKETHROUGH)
    }

    /**
     * Creates a new [Component] with [TextDecoration.UNDERLINED].
     * @param objects An object list, objects can be [Int], [String], [Component] or anything else.
     * @author xw1w1
     */
    @Contract("_ -> new")
    fun underlined(@Nullable vararg objects: Any?): Component {
        return single(*components(*objects)).decorate(TextDecoration.UNDERLINED)
    }

    /**
     * Creates a new [Component] with [TextDecoration.OBFUSCATED].
     * @param objects An object list, objects can be [Int], [String], [Component] or anything else.
     * @author xw1w1
     */
    @Contract("_ -> new")
    fun obfuscated(@Nullable vararg objects: Any?): Component {
        return single(*components(*objects)).decorate(TextDecoration.OBFUSCATED)
    }

    /**
     * Creates a new [Component] with [HoverEvent.showText] which text is passed to objects.
     * @param objects An object list, objects can be [Int], [String], [Component] or anything else.
     * @author xw1w1
     */
    @Contract("_, _ -> new")
    fun hover(component: Component, @Nullable vararg objects: Any?): Component {
        return component.hoverEvent(HoverEvent.showText(single(*components(*objects))))
    }

    /**
     * Creates a new [Component] with [ClickEvent.openUrl] with a given link.
     * @param link link to open.
     * @author xw1w1
     */
    @Contract("_, _ -> new")
    fun openUrl(component: Component, link: String): Component {
        return component.clickEvent(ClickEvent.openUrl(link))
    }

    /**
     * Creates a new [Component] with [ClickEvent.suggestCommand] with a given command.
     * @param command command to suggest.
     * @author xw1w1
     */
    @Contract("_, _ -> new")
    fun suggestCommand(component: Component, command: String): Component {
        return component.clickEvent(ClickEvent.suggestCommand(command))
    }

    /**
     * Creates a new [Component] with [ClickEvent.runCommand] with a given command.
     * @param command command to run.
     * @author xw1w1
     */
    @Contract("_, _ -> new")
    fun runCommand(component: Component, command: String): Component {
        return component.clickEvent(ClickEvent.runCommand(command))
    }

    /**
     * Creates a new colored [Component] with [NamedTextColor.RED]
     * @param objects An object list, objects can be [Int], [String], [Component] or anything else.
     * @author xw1w1
     */
    @Contract("_ -> new")
    fun red(@Nullable vararg objects: Any?): Component {
        return single(*components(*objects)).colorIfAbsent(NamedTextColor.RED)
    }

    /**
     * Creates a new colored [Component] with [NamedTextColor.DARK_RED]
     * @param objects An object list, objects can be [Int], [String], [Component] or anything else.
     * @author xw1w1
     */
    @Contract("_ -> new")
    fun darkRed(@Nullable vararg objects: Any?): Component {
        return single(*components(*objects)).colorIfAbsent(NamedTextColor.DARK_RED)
    }

    /**
     * Creates a new colored [Component] with [NamedTextColor.GOLD]
     * @param objects An object list, objects can be [Int], [String], [Component] or anything else.
     * @author xw1w1
     */
    @Contract("_ -> new")
    fun gold(@Nullable vararg objects: Any?): Component {
        return single(*components(*objects)).colorIfAbsent(NamedTextColor.GOLD)
    }

    /**
     * Creates a new colored [Component] with [NamedTextColor.YELLOW]
     * @param objects An object list, objects can be [Int], [String], [Component] or anything else.
     * @author xw1w1
     */
    @Contract("_ -> new")
    fun yellow(@Nullable vararg objects: Any?): Component {
        return single(*components(*objects)).colorIfAbsent(NamedTextColor.YELLOW)
    }

    /**
     * Creates a new colored [Component] with [NamedTextColor.GREEN]
     * @param objects An object list, objects can be [Int], [String], [Component] or anything else.
     * @author xw1w1
     */
    @Contract("_ -> new")
    fun green(@Nullable vararg objects: Any?): Component {
        return single(*components(*objects)).colorIfAbsent(NamedTextColor.GREEN)
    }

    /**
     * Creates a new colored [Component] with [NamedTextColor.DARK_GREEN]
     * @param objects An object list, objects can be [Int], [String], [Component] or anything else.
     * @author xw1w1
     */
    @Contract("_ -> new")
    fun darkGreen(@Nullable vararg objects: Any?): Component {
        return single(*components(*objects)).colorIfAbsent(NamedTextColor.DARK_GREEN)
    }

    /**
     * Creates a new colored [Component] with [NamedTextColor.AQUA]
     * @param objects An object list, objects can be [Int], [String], [Component] or anything else.
     * @author xw1w1
     */
    @Contract("_ -> new")
    fun aqua(@Nullable vararg objects: Any?): Component {
        return single(*components(*objects)).colorIfAbsent(NamedTextColor.AQUA)
    }

    /**
     * Creates a new colored [Component] with [NamedTextColor.DARK_AQUA]
     * @param objects An object list, objects can be [Int], [String], [Component] or anything else.
     * @author xw1w1
     */
    @Contract("_ -> new")
    fun darkAqua(@Nullable vararg objects: Any?): Component {
        return single(*components(*objects)).colorIfAbsent(NamedTextColor.DARK_AQUA)
    }

    /**
     * Creates a new colored [Component] with [NamedTextColor.BLUE]
     * @param objects An object list, objects can be [Int], [String], [Component] or anything else.
     * @author xw1w1
     */
    @Contract("_ -> new")
    fun blue(@Nullable vararg objects: Any?): Component {
        return single(*components(*objects)).colorIfAbsent(NamedTextColor.BLUE)
    }

    /**
     * Creates a new colored [Component] with [NamedTextColor.DARK_RED]
     * @param objects An object list, objects can be [Int], [String], [Component] or anything else.
     * @author xw1w1
     */
    @Contract("_ -> new")
    fun darkBlue(@Nullable vararg objects: Any?): Component {
        return single(*components(*objects)).colorIfAbsent(NamedTextColor.DARK_BLUE)
    }

    /**
     * Creates a new colored [Component] with [NamedTextColor.LIGHT_PURPLE]
     * @param objects An object list, objects can be [Int], [String], [Component] or anything else.
     * @author xw1w1
     */
    @Contract("_ -> new")
    fun lightPurple(@Nullable vararg objects: Any?): Component {
        return single(*components(*objects)).colorIfAbsent(NamedTextColor.LIGHT_PURPLE)
    }

    /**
     * Creates a new colored [Component] with [NamedTextColor.DARK_PURPLE]
     * @param objects An object list, objects can be [Int], [String], [Component] or anything else.
     * @author xw1w1
     */
    @Contract("_ -> new")
    fun darkPurple(@Nullable vararg objects: Any?): Component {
        return single(*components(*objects)).colorIfAbsent(NamedTextColor.DARK_PURPLE)
    }

    /**
     * Creates a new colored [Component] with [NamedTextColor.GRAY]
     * @param objects An object list, objects can be [Int], [String], [Component] or anything else.
     * @author xw1w1
     */
    @Contract("_ -> new")
    fun gray(@Nullable vararg objects: Any?): Component {
        return single(*components(*objects)).colorIfAbsent(NamedTextColor.GRAY)
    }

    /**
     * Creates a new colored [Component] with [NamedTextColor.DARK_GRAY]
     * @param objects An object list, objects can be [Int], [String], [Component] or anything else.
     * @author xw1w1
     */
    @Contract("_ -> new")
    fun darkGray(@Nullable vararg objects: Any?): Component {
        return single(*components(*objects)).colorIfAbsent(NamedTextColor.DARK_GRAY)
    }

    /**
     * Creates a new colored [Component] with [NamedTextColor.BLACK]
     * @param objects An object list, objects can be [Int], [String], [Component] or anything else.
     * @author xw1w1
     */
    @Contract("_ -> new")
    fun black(@Nullable vararg objects: Any?): Component {
        return single(*components(*objects)).colorIfAbsent(NamedTextColor.BLACK)
    }

    /**
     * Creates a new colored [Component] with [NamedTextColor.WHITE]
     * @param objects An object list, objects can be [Int], [String], [Component] or anything else.
     * @author xw1w1
     */
    @Contract("_ -> new")
    fun white(@Nullable vararg objects: Any?): Component {
        return single(*components(*objects)).colorIfAbsent(NamedTextColor.WHITE)
    }

    /**
     * Creates a new [Component].
     * @param objects An object list, objects can be [Int], [String], [Component] or anything else.
     * @author xw1w1
     */
    @Contract("_ -> new")
    fun text(@Nullable vararg objects: Any?): Component {
        return single(*components(*objects))
    }
}