// Generated by jextract

package tech.bitey.golpanama.xlib;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$214 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$214() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        JAVA_LONG.withName("flags"),
        JAVA_INT.withName("input"),
        JAVA_INT.withName("initial_state"),
        JAVA_LONG.withName("icon_pixmap"),
        JAVA_LONG.withName("icon_window"),
        JAVA_INT.withName("icon_x"),
        JAVA_INT.withName("icon_y"),
        JAVA_LONG.withName("icon_mask"),
        JAVA_LONG.withName("window_group")
    ).withName("");
    static final VarHandle const$1 = constants$214.const$0.varHandle(MemoryLayout.PathElement.groupElement("flags"));
    static final VarHandle const$2 = constants$214.const$0.varHandle(MemoryLayout.PathElement.groupElement("input"));
    static final VarHandle const$3 = constants$214.const$0.varHandle(MemoryLayout.PathElement.groupElement("initial_state"));
    static final VarHandle const$4 = constants$214.const$0.varHandle(MemoryLayout.PathElement.groupElement("icon_pixmap"));
    static final VarHandle const$5 = constants$214.const$0.varHandle(MemoryLayout.PathElement.groupElement("icon_window"));
}


