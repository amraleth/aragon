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

    int ARAGON_PROTOCOL_VERSION = 0x01;

    /**
     * Specifies the opcode of this packet.
     *
     * @return The opcode of the packet.
     */
    AragonProtocolOpcode getProtocolOpcode();

    /**
     * Generates the protocol header.
     *
     * @return The header as a string.
     */
    default String genProtocolHeader() {
        return "%d,%d,".formatted(ARAGON_PROTOCOL_VERSION, getProtocolOpcode().getOpcode());
    }

    /**
     * Serializes a value into the specified type {@code T}.
     *
     * @param value The value to serialize into a string.
     * @return The output string.
     * @throws AragonProtocolException.AragonProtocolSerializeException If an error during serialization occurred.
     */
    String serializePacketFromValue(T value) throws AragonProtocolException.AragonProtocolSerializeException;

    /**
     * Deserializes a string into the specified type {@code T}.
     *
     * @param from The string to deserialize from.
     * @return The output data.
     * @throws AragonProtocolException.AragonProtocolDeserializeException If an error during deserialization occurred.
     */
    T deserializePacketFromString(String from) throws AragonProtocolException.AragonProtocolDeserializeException;
}