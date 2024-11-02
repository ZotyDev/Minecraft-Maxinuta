package dev.zoty.maxinuta.vocabulary;

import java.util.Optional;

public interface Language {
    /**
     * Returns a random prefix based on the language's rules.
     * If the language doesn't use prefixes, it can return empty.
     *
     * @return Random prefix, or empty.
     */
    default Optional<String> getRandomPrefix() {
        return Optional.empty();
    }

    /**
     * Returns a random suffix based on the language's rules.
     * If the language doesn't use suffixes, it can return empty.
     *
     * @return Random suffix, or empty.
     */
    default Optional<String> getRandomSuffix() {
        return Optional.empty();
    }

    /**
     * Returns a random syllable based on the language's rules.
     * This method **MUST** be implemented.
     *
     * @return Random syllable from the language.
     */
    String getRandomSyllable();

    /**
     * Generate a word based on the language's rules.
     * This method **MUST** be implemented.
     *
     * @param syllableCount Number of syllables for this word.
     * @return
     */
    String generateWord(int syllableCount);
}
