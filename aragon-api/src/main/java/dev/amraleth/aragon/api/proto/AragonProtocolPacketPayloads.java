package dev.amraleth.aragon.api.proto;

/**
 * Contains the payloads for all packets specified in {@link AragonProtocolPackets}.
 *
 * @author amraleth
 * @see AragonProtocolPackets
 * @since 1.0.0
 */
public final class AragonProtocolPacketPayloads {

    public record AragonProtocolDeletePacketPayload() {
    }

    public record AragonProtocolUpdatePacketPayload() {
    }

    public record AragonProtocolInsertPacketPayload() {
    }
}
