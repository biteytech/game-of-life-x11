// Generated by jextract

package tech.bitey.golpanama.xlib;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$101 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$101() {}
    static final VarHandle const$0 = constants$100.const$4.varHandle(MemoryLayout.PathElement.groupElement("serial"));
    static final VarHandle const$1 = constants$100.const$4.varHandle(MemoryLayout.PathElement.groupElement("send_event"));
    static final VarHandle const$2 = constants$100.const$4.varHandle(MemoryLayout.PathElement.groupElement("display"));
    static final VarHandle const$3 = constants$100.const$4.varHandle(MemoryLayout.PathElement.groupElement("extension"));
    static final VarHandle const$4 = constants$100.const$4.varHandle(MemoryLayout.PathElement.groupElement("evtype"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        JAVA_INT.withName("type"),
        MemoryLayout.paddingLayout(4),
        JAVA_LONG.withName("serial"),
        JAVA_INT.withName("send_event"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("display"),
        JAVA_INT.withName("extension"),
        JAVA_INT.withName("evtype"),
        JAVA_INT.withName("cookie"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("data")
    ).withName("");
}

