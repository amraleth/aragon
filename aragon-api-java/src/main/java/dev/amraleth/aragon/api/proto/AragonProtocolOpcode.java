package dev.amraleth.aragon.api.proto;

import org.jspecify.annotations.NonNull;

/**
 * Represents the different opcodes for the aragon protocol.
 *
 * @author amraleth
 * @since 1.0.0
 */
public enum AragonProtocolOpcode {

    MIGRATE(0x00),
    INSERT(0x01),
    UPDATE(0x02),
    DELETE(0x03),

    UNKNOWN(-1);

    private final int opcode;

    /**
     * @param opcode The internal opcode of the request.
     */
    AragonProtocolOpcode(int opcode) {
        this.opcode = opcode;
    }

    /**
     * Specifies the primitive opcode of the OpCode.
     *
     * @return The primitive opcode.
     */
    public int getOpcode() {
        return this.opcode;
    }

    /**
     * Constructs a OpCode from a primitive opcode.
     *
     * @param opcode The primitive opcode to construct from.
     * @return The OpCode.
     */
    public static @NonNull AragonProtocolOpcode fromOpcode(int opcode) {
        return switch (opcode) {
            case 0x00 -> MIGRATE;
            case 0x01 -> INSERT;
            case 0x02 -> UPDATE;
            case 0x03 -> DELETE;
            default -> UNKNOWN;
        };
    }
}
