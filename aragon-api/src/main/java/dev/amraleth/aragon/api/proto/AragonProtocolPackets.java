package dev.amraleth.aragon.api.proto;

import org.jspecify.annotations.NullMarked;

/**
 * Contains all protocol packets.
 *
 * @author amraleth
 * @since 1.0.0
 */
@NullMarked
public final class AragonProtocolPackets {

    /**
     * Private constructor.
     */
    private AragonProtocolPackets() {

    }

    /**
     * Base protocol exception all other protocol exception are derived from.
     */
    public static sealed class AragonProtocolException extends RuntimeException {
        public AragonProtocolException(String message) {
            super(message);
        }
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

    /**
     * Represents a singular protocol packet that can be sent using the aragon protocol.
     *
     * @param <T> The type of data this packet "holds".
     */
    public sealed interface AragonProtocolPacket<T> {

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
         * @throws AragonProtocolSerializeException If an error during serialization occurred.
         */
        String serialize(T value) throws AragonProtocolSerializeException;

        /**
         * Deserializes a string into the specified type {@code T}.
         *
         * @param from The string to deserialize from.
         * @return The output data.
         * @throws AragonProtocolDeserializeException If an error during deserialization occurred.
         */
        T deserialize(String from) throws AragonProtocolDeserializeException;
    }

    public static final class AragonProtocolInsertPacket implements AragonProtocolPacket<AragonProtocolPacketPayloads.AragonProtocolInsertPacketPayload> {

        @Override
        public AragonProtocolOpcode getProtocolOpcode() {
            return AragonProtocolOpcode.INSERT;
        }

        @Override
        public String serialize(AragonProtocolPacketPayloads.AragonProtocolInsertPacketPayload value) throws AragonProtocolSerializeException {
            return "";
        }

        @Override
        public AragonProtocolPacketPayloads.AragonProtocolInsertPacketPayload deserialize(String from) throws AragonProtocolDeserializeException {
            return new AragonProtocolPacketPayloads.AragonProtocolInsertPacketPayload();
        }

    }

    public static final class AragonProtocolUpdatePacket implements AragonProtocolPacket<AragonProtocolPacketPayloads.AragonProtocolUpdatePacketPayload> {

        @Override
        public AragonProtocolOpcode getProtocolOpcode() {
            return AragonProtocolOpcode.UPDATE;
        }

        @Override
        public String serialize(AragonProtocolPacketPayloads.AragonProtocolUpdatePacketPayload value) throws AragonProtocolSerializeException {
            return "";
        }

        @Override
        public AragonProtocolPacketPayloads.AragonProtocolUpdatePacketPayload deserialize(String from) throws AragonProtocolDeserializeException {
            return new AragonProtocolPacketPayloads.AragonProtocolUpdatePacketPayload();
        }

    }

    public static final class AragonProtocolDeletePacket implements AragonProtocolPacket<AragonProtocolPacketPayloads.AragonProtocolDeletePacketPayload> {

        @Override
        public AragonProtocolOpcode getProtocolOpcode() {
            return AragonProtocolOpcode.DELETE;
        }

        @Override
        public String serialize(AragonProtocolPacketPayloads.AragonProtocolDeletePacketPayload value) throws AragonProtocolSerializeException {
            return "";
        }

        @Override
        public AragonProtocolPacketPayloads.AragonProtocolDeletePacketPayload deserialize(String from) throws AragonProtocolDeserializeException {
            return new AragonProtocolPacketPayloads.AragonProtocolDeletePacketPayload();
        }

    }

}
