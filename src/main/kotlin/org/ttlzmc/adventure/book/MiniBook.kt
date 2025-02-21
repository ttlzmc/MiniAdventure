package org.ttlzmc.adventure.book

import net.kyori.adventure.inventory.Book
import net.kyori.adventure.text.Component
import org.jetbrains.annotations.Contract

/**
 * A class that allows you to create [Book] a little faster.
 * @author xw1w1
 */
@Suppress("MemberVisibilityCanBePrivate", "unused")
object MiniBook {

    /**
     * Creates an empty [Book].
     * @author xw1w1
     */
    fun empty(): Book {
        return Book.book(Component.empty(), Component.empty())
    }

    /**
     * Creates an empty [Book] with given title.
     * @param title Book title.
     * @author xw1w1
     */
    @Contract("_ -> new")
    fun book(title: Component): Book {
        return Book.book(title, Component.empty())
    }

    /**
     * Creates an empty [Book] with given title and author name.
     * @param title Book title.
     * @param author Author name [Component]
     * @author xw1w1
     */
    @Contract("_, _ -> new")
    fun book(title: Component, author: Component): Book {
        return Book.book(title, author)
    }

    /**
     * Creates an empty [Book] with given title, author name and pages.
     * @param title Book title.
     * @param author Author name [Component]
     * @param pages Collection of pages. Any component that surpasses the game limit for text per page will be truncated client side, same with pages amount.
     * @author xw1w1
     */
    @Contract("_, _, _ -> new")
    fun book(title: Component, author: Component, pages: Collection<Component>): Book {
        return Book.book(title, author, pages)
    }

    /**
     * Creates an empty [Book] with given title, author name and pages.
     * @param title Book title.
     * @param author Author name [Component]
     * @param pages Collection of pages. Any component that surpasses the game limit for text per page will be truncated client side, same with pages amount.
     * @author xw1w1
     */
    @Contract("_, _, _ -> new")
    fun book(title: Component, author: Component, vararg pages: Component): Book {
        return Book.book(title, author, pages.toList())
    }
}