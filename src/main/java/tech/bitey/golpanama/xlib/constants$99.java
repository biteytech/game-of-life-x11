// Generated by jextract

package tech.bitey.golpanama.xlib;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$99 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$99() {}
    static final VarHandle const$0 = constants$98.const$2.varHandle(MemoryLayout.PathElement.groupElement("serial"));
    static final VarHandle const$1 = constants$98.const$2.varHandle(MemoryLayout.PathElement.groupElement("error_code"));
    static final VarHandle const$2 = constants$98.const$2.varHandle(MemoryLayout.PathElement.groupElement("request_code"));
    static final VarHandle const$3 = constants$98.const$2.varHandle(MemoryLayout.PathElement.groupElement("minor_code"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        JAVA_INT.withName("type"),
        MemoryLayout.paddingLayout(4),
        JAVA_LONG.withName("serial"),
        JAVA_INT.withName("send_event"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("display"),
        JAVA_LONG.withName("window")
    ).withName("");
    static final VarHandle const$5 = constants$99.const$4.varHandle(MemoryLayout.PathElement.groupElement("type"));
}

