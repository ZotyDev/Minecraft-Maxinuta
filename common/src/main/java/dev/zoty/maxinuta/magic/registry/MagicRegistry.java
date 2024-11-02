package dev.zoty.maxinuta.magic.registry;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * Abstract class for managing magic registries. Provides basic functionality for registering and retrieving items and
 * their associated words.
 *
 * @param <T> The type of object being registered (e.g., Effect, Target).
 */
public class AbstractMagicRegistry<T> {
    private static final Map<T, String> itemToWord = new HashMap<>();
    private static final Map<String, T> wordToItem = new HashMap<>();

    /**
     * Registers an object with a corresponding word.
     *
     * @param item The object to register.
     * @param word The word representing this object.
     */
    public void register(T item, String word) {
        itemToWord.put(item, word);
        wordToItem.put(word, item);
    }

    /**
     * Retrieves the word associated with the given object.
     *
     * @param item The object to look up.
     * @return The word associated with the object, or Optional.empty() if not found.
     */
    Optional<String> getWord(T item) {
        return Optional.ofNullable(itemToWord.get(item));
    }

    /**
     * Retrieves the object associated with the given word.
     *
     * @param word The word to loop up.
     * @return The object associated with the word, or Optional.empty() if not found.
     */
    Optional<T> getItem(String word) {
        return Optional.ofNullable(wordToItem.get(word));
    }
}
