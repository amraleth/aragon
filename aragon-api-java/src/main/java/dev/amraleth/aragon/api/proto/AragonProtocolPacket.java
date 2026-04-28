package dev.amraleth.aragon.api.proto;

import dev.amraleth.aragon.api.exception.AragonProtocolException;
import org.jspecify.annotations.NullMarked;

/**
 * Represents a singular protocol packet that can be sent using the aragon protocol.
 *
 * @param <T> The type of data this packet "holds".
 */

@NullMarked
public sealed interface AragonProtocolPacket<T> permits AragonProtocolPackets.AragonProtocolDeletePacket,
        AragonProtocolPackets.AragonProtocolInsertPacket, AragonProtocolPackets.AragonProtocolUpdatePacket {

    /**
     * Specifies the opcode of this packet, defaults to {@link AragonProtocolOpcode#UNKNOWN}.
     *
     * @return The opcode of the packet.
     */
    default AragonProtocolOpcode getProtocolOpcode() {
        return AragonProtocolOpcode.UNKNOWN;
    }

    /**
     * Serializes a value into the specified type {@code T}.
     *
     * @param value The value to serialize into a string.
     * @return The output string.
     * @throws AragonProtocolException.AragonProtocolSerializeException If an error during serialization occurred.
     */
    String serialize(T value) throws AragonProtocolException.AragonProtocolSerializeException;

    /**
     * Deserializes a string into the specified type {@code T}.
     *
     * @param from The string to deserialize from.
     * @return The output data.
     * @throws AragonProtocolException.AragonProtocolDeserializeException If an error during deserialization occurred.
     */
    T deserialize(String from) throws AragonProtocolException.AragonProtocolDeserializeException;
}