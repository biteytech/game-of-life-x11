// Generated by jextract

package tech.bitey.golpanama.xlib;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$65 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$65() {}
    static final VarHandle const$0 = constants$63.const$3.varHandle(MemoryLayout.PathElement.groupElement("height"));
    static final VarHandle const$1 = constants$63.const$3.varHandle(MemoryLayout.PathElement.groupElement("count"));
    static final VarHandle const$2 = constants$63.const$3.varHandle(MemoryLayout.PathElement.groupElement("major_code"));
    static final VarHandle const$3 = constants$63.const$3.varHandle(MemoryLayout.PathElement.groupElement("minor_code"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        JAVA_INT.withName("type"),
        MemoryLayout.paddingLayout(4),
        JAVA_LONG.withName("serial"),
        JAVA_INT.withName("send_event"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("display"),
        JAVA_LONG.withName("drawable"),
        JAVA_INT.withName("major_code"),
        JAVA_INT.withName("minor_code")
    ).withName("");
    static final VarHandle const$5 = constants$65.const$4.varHandle(MemoryLayout.PathElement.groupElement("type"));
}


