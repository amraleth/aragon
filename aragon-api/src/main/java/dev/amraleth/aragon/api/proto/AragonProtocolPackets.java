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
        public String serialize(AragonProtocolPacketPayloads.AragonProtocolInsertPacketPayload value) throws AragonProtocolException.AragonProtocolSerializeException {
            return "";
        }

        @Override
        public AragonProtocolPacketPayloads.AragonProtocolInsertPacketPayload deserialize(String from) throws AragonProtocolException.AragonProtocolDeserializeException {
            return new AragonProtocolPacketPayloads.AragonProtocolInsertPacketPayload();
        }

    }

    public static final class AragonProtocolUpdatePacket implements AragonProtocolPacket<AragonProtocolPacketPayloads.AragonProtocolUpdatePacketPayload> {

        @Override
        public AragonProtocolOpcode getProtocolOpcode() {
            return AragonProtocolOpcode.UPDATE;
        }

        @Override
        public String serialize(AragonProtocolPacketPayloads.AragonProtocolUpdatePacketPayload value) throws AragonProtocolException.AragonProtocolSerializeException {
            return "";
        }

        @Override
        public AragonProtocolPacketPayloads.AragonProtocolUpdatePacketPayload deserialize(String from) throws AragonProtocolException.AragonProtocolDeserializeException {
            return new AragonProtocolPacketPayloads.AragonProtocolUpdatePacketPayload();
        }

    }

    public static final class AragonProtocolDeletePacket implements AragonProtocolPacket<AragonProtocolPacketPayloads.AragonProtocolDeletePacketPayload> {

        @Override
        public AragonProtocolOpcode getProtocolOpcode() {
            return AragonProtocolOpcode.DELETE;
        }

        @Override
        public String serialize(AragonProtocolPacketPayloads.AragonProtocolDeletePacketPayload value) throws AragonProtocolException.AragonProtocolSerializeException {
            return "";
        }

        @Override
        public AragonProtocolPacketPayloads.AragonProtocolDeletePacketPayload deserialize(String from) throws AragonProtocolException.AragonProtocolDeserializeException {
            return new AragonProtocolPacketPayloads.AragonProtocolDeletePacketPayload();
        }

    }

}
