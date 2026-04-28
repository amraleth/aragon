package dev.amraleth.aragon.api.exception;

import org.jspecify.annotations.NullMarked;

/**
 * Base protocol exception all other protocol exception are derived from.
 *
 * @author amraleth
 * @since 1.0.0
 */

@NullMarked
public sealed class AragonProtocolException extends RuntimeException {
    public AragonProtocolException(String message) {
        super(message);
    }

    /**
     * Indicates an error during serialization of a packet.
     */
    public static final class AragonProtocolSerializeException extends AragonProtocolException {
        public AragonProtocolSerializeException(String message) {
            super(message);
        }
    }

    /**
     * Indicates an error during deserialization of a raw packet.
     */
    public static final class AragonProtocolDeserializeException extends AragonProtocolException {
        public AragonProtocolDeserializeException(String message) {
            super(message);
        }
    }
}
