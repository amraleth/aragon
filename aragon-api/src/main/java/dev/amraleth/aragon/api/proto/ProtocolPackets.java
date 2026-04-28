package dev.amraleth.aragon.api.proto;

import dev.amraleth.aragon.api.proto.bindings.DeleteStatementData;
import dev.amraleth.aragon.api.proto.bindings.InsertStatementData;
import dev.amraleth.aragon.api.proto.bindings.UpdateStatementData;
import org.jspecify.annotations.NullMarked;

/**
 * Contains all protocol packets.
 *
 * @author amraleth
 * @since 1.0.0
 */
@NullMarked
public final class ProtocolPackets {

    /**
     * Private constructor.
     */
    private ProtocolPackets() {

    }

    /**
     * Base protocol exception all other protocol exception are derived from.
     */
    public static sealed class ProtocolException extends RuntimeException {
        public ProtocolException(String message) {
            super(message);
        }
    }

    /**
     * Indicates an error during serialization of a packet.
     */
    public static final class ProtocolSerializeException extends ProtocolException {
        public ProtocolSerializeException(String message) {
            super(message);
        }
    }

    /**
     * Indicates an error during deserialization of a raw packet.
     */
    public static final class ProtocolDeserializeException extends ProtocolException {
        public ProtocolDeserializeException(String message) {
            super(message);
        }
    }

    /**
     * Represents a singular protocol packet that can be sent using the aragon protocol.
     *
     * @param <T> The type of data this packet "holds".
     */
    public sealed interface ProtocolPacket<T> {

        /**
         * Specifies the opcode of this packet, defaults to {@link ProtocolOpcode#UNKNOWN}.
         *
         * @return The opcode of the packet.
         */
        default ProtocolOpcode getProtocolOpcode() {
            return ProtocolOpcode.UNKNOWN;
        }

        /**
         * Serializes a value into the specified type {@code T}.
         *
         * @param value The value to serialize into a string.
         * @return The output string.
         * @throws ProtocolSerializeException If an error during serialization occurred.
         */
        String serialize(T value) throws ProtocolSerializeException;

        /**
         * Deserializes a string into the specified type {@code T}.
         *
         * @param from The string to deserialize from.
         * @return The output data.
         * @throws ProtocolDeserializeException If an error during deserialization occurred.
         */
        T deserialize(String from) throws ProtocolDeserializeException;
    }

    public static final class InsertPacket implements ProtocolPacket<InsertStatementData> {

        @Override
        public ProtocolOpcode getProtocolOpcode() {
            return ProtocolOpcode.INSERT;
        }

        @Override
        public String serialize(InsertStatementData value) throws ProtocolSerializeException {
            return "";
        }

        @Override
        public InsertStatementData deserialize(String from) throws ProtocolDeserializeException {
            return new InsertStatementData();
        }

    }

    public static final class UpdatePacket implements ProtocolPacket<UpdateStatementData> {

        @Override
        public ProtocolOpcode getProtocolOpcode() {
            return ProtocolOpcode.UPDATE;
        }

        @Override
        public String serialize(UpdateStatementData value) throws ProtocolSerializeException {
            return "";
        }

        @Override
        public UpdateStatementData deserialize(String from) throws ProtocolDeserializeException {
            return new UpdateStatementData();
        }

    }

    public static final class DeletePacket implements ProtocolPacket<DeleteStatementData> {

        @Override
        public ProtocolOpcode getProtocolOpcode() {
            return ProtocolOpcode.DELETE;
        }

        @Override
        public String serialize(DeleteStatementData value) throws ProtocolSerializeException {
            return "";
        }

        @Override
        public DeleteStatementData deserialize(String from) throws ProtocolDeserializeException {
            return new DeleteStatementData();
        }

    }

}
