package dev.amraleth.aragon.api.proto;

import dev.amraleth.aragon.api.exception.AragonProtocolException;
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

    public static final class AragonProtocolInsertPacket implements AragonProtocolPacket<AragonProtocolPacketPayloads.AragonProtocolInsertPacketPayload> {

        @Override
        public AragonProtocolOpcode getProtocolOpcode() {
            return AragonProtocolOpcode.INSERT;
        }

        @Override
        public String serializePacketFromValue(AragonProtocolPacketPayloads.AragonProtocolInsertPacketPayload value) throws AragonProtocolException.AragonProtocolSerializeException {
            return "";
        }

        @Override
        public AragonProtocolPacketPayloads.AragonProtocolInsertPacketPayload deserializePacketFromString(String from) throws AragonProtocolException.AragonProtocolDeserializeException {
            return new AragonProtocolPacketPayloads.AragonProtocolInsertPacketPayload();
        }

    }

    public static final class AragonProtocolUpdatePacket implements AragonProtocolPacket<AragonProtocolPacketPayloads.AragonProtocolUpdatePacketPayload> {

        @Override
        public AragonProtocolOpcode getProtocolOpcode() {
            return AragonProtocolOpcode.UPDATE;
        }

        @Override
        public String serializePacketFromValue(AragonProtocolPacketPayloads.AragonProtocolUpdatePacketPayload value) throws AragonProtocolException.AragonProtocolSerializeException {
            return "";
        }

        @Override
        public AragonProtocolPacketPayloads.AragonProtocolUpdatePacketPayload deserializePacketFromString(String from) throws AragonProtocolException.AragonProtocolDeserializeException {
            return new AragonProtocolPacketPayloads.AragonProtocolUpdatePacketPayload();
        }

    }

    public static final class AragonProtocolDeletePacket implements AragonProtocolPacket<AragonProtocolPacketPayloads.AragonProtocolDeletePacketPayload> {

        @Override
        public AragonProtocolOpcode getProtocolOpcode() {
            return AragonProtocolOpcode.DELETE;
        }

        @Override
        public String serializePacketFromValue(AragonProtocolPacketPayloads.AragonProtocolDeletePacketPayload value) throws AragonProtocolException.AragonProtocolSerializeException {
            return "";
        }

        @Override
        public AragonProtocolPacketPayloads.AragonProtocolDeletePacketPayload deserializePacketFromString(String from) throws AragonProtocolException.AragonProtocolDeserializeException {
            return new AragonProtocolPacketPayloads.AragonProtocolDeletePacketPayload();
        }

    }

}
