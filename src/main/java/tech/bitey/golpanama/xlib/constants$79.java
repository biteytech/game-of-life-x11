// Generated by jextract

package tech.bitey.golpanama.xlib;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$79 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$79() {}
    static final VarHandle const$0 = constants$77.const$1.varHandle(MemoryLayout.PathElement.groupElement("border_width"));
    static final VarHandle const$1 = constants$77.const$1.varHandle(MemoryLayout.PathElement.groupElement("above"));
    static final VarHandle const$2 = constants$77.const$1.varHandle(MemoryLayout.PathElement.groupElement("override_redirect"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        JAVA_INT.withName("type"),
        MemoryLayout.paddingLayout(4),
        JAVA_LONG.withName("serial"),
        JAVA_INT.withName("send_event"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("display"),
        JAVA_LONG.withName("event"),
        JAVA_LONG.withName("window"),
        JAVA_INT.withName("x"),
        JAVA_INT.withName("y")
    ).withName("");
    static final VarHandle const$4 = constants$79.const$3.varHandle(MemoryLayout.PathElement.groupElement("type"));
    static final VarHandle const$5 = constants$79.const$3.varHandle(MemoryLayout.PathElement.groupElement("serial"));
}


