// Generated by jextract

package tech.bitey.golpanama.xlib;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$95 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$95() {}
    static final VarHandle const$0 = constants$93.const$5.varHandle(MemoryLayout.PathElement.groupElement("new"));
    static final VarHandle const$1 = constants$93.const$5.varHandle(MemoryLayout.PathElement.groupElement("state"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        JAVA_INT.withName("type"),
        MemoryLayout.paddingLayout(4),
        JAVA_LONG.withName("serial"),
        JAVA_INT.withName("send_event"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("display"),
        JAVA_LONG.withName("window"),
        JAVA_LONG.withName("message_type"),
        JAVA_INT.withName("format"),
        MemoryLayout.paddingLayout(4),
        MemoryLayout.unionLayout(
            MemoryLayout.sequenceLayout(20, JAVA_BYTE).withName("b"),
            MemoryLayout.sequenceLayout(10, JAVA_SHORT).withName("s"),
            MemoryLayout.sequenceLayout(5, JAVA_LONG).withName("l")
        ).withName("data")
    ).withName("");
    static final VarHandle const$3 = constants$95.const$2.varHandle(MemoryLayout.PathElement.groupElement("type"));
    static final VarHandle const$4 = constants$95.const$2.varHandle(MemoryLayout.PathElement.groupElement("serial"));
    static final VarHandle const$5 = constants$95.const$2.varHandle(MemoryLayout.PathElement.groupElement("send_event"));
}

