// Generated by jextract

package tech.bitey.golpanama.xlib;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$96 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$96() {}
    static final VarHandle const$0 = constants$95.const$2.varHandle(MemoryLayout.PathElement.groupElement("display"));
    static final VarHandle const$1 = constants$95.const$2.varHandle(MemoryLayout.PathElement.groupElement("window"));
    static final VarHandle const$2 = constants$95.const$2.varHandle(MemoryLayout.PathElement.groupElement("message_type"));
    static final VarHandle const$3 = constants$95.const$2.varHandle(MemoryLayout.PathElement.groupElement("format"));
    static final UnionLayout const$4 = MemoryLayout.unionLayout(
        MemoryLayout.sequenceLayout(20, JAVA_BYTE).withName("b"),
        MemoryLayout.sequenceLayout(10, JAVA_SHORT).withName("s"),
        MemoryLayout.sequenceLayout(5, JAVA_LONG).withName("l")
    ).withName("");
    static final StructLayout const$5 = MemoryLayout.structLayout(
        JAVA_INT.withName("type"),
        MemoryLayout.paddingLayout(4),
        JAVA_LONG.withName("serial"),
        JAVA_INT.withName("send_event"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("display"),
        JAVA_LONG.withName("window"),
        JAVA_INT.withName("request"),
        JAVA_INT.withName("first_keycode"),
        JAVA_INT.withName("count"),
        MemoryLayout.paddingLayout(4)
    ).withName("");
}


