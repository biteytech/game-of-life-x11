// Generated by jextract

package tech.bitey.golpanama.xlib;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$111 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$111() {}
    static final VarHandle const$0 = constants$110.const$3.varHandle(MemoryLayout.PathElement.groupElement("delta"));
    static final VarHandle const$1 = constants$110.const$3.varHandle(MemoryLayout.PathElement.groupElement("font_set"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        JAVA_INT.withName("charset_count"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("charset_list")
    ).withName("");
    static final VarHandle const$3 = constants$111.const$2.varHandle(MemoryLayout.PathElement.groupElement("charset_count"));
    static final VarHandle const$4 = constants$111.const$2.varHandle(MemoryLayout.PathElement.groupElement("charset_list"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        JAVA_INT.withName("num_orientation"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("orientation")
    ).withName("");
}


