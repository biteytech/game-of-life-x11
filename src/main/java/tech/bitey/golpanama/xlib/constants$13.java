// Generated by jextract

package tech.bitey.golpanama.xlib;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$13 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$13() {}
    static final VarHandle const$0 = constants$12.const$4.varHandle(MemoryLayout.PathElement.groupElement("bits_per_pixel"));
    static final VarHandle const$1 = constants$12.const$4.varHandle(MemoryLayout.PathElement.groupElement("scanline_pad"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        JAVA_INT.withName("function"),
        MemoryLayout.paddingLayout(4),
        JAVA_LONG.withName("plane_mask"),
        JAVA_LONG.withName("foreground"),
        JAVA_LONG.withName("background"),
        JAVA_INT.withName("line_width"),
        JAVA_INT.withName("line_style"),
        JAVA_INT.withName("cap_style"),
        JAVA_INT.withName("join_style"),
        JAVA_INT.withName("fill_style"),
        JAVA_INT.withName("fill_rule"),
        JAVA_INT.withName("arc_mode"),
        MemoryLayout.paddingLayout(4),
        JAVA_LONG.withName("tile"),
        JAVA_LONG.withName("stipple"),
        JAVA_INT.withName("ts_x_origin"),
        JAVA_INT.withName("ts_y_origin"),
        JAVA_LONG.withName("font"),
        JAVA_INT.withName("subwindow_mode"),
        JAVA_INT.withName("graphics_exposures"),
        JAVA_INT.withName("clip_x_origin"),
        JAVA_INT.withName("clip_y_origin"),
        JAVA_LONG.withName("clip_mask"),
        JAVA_INT.withName("dash_offset"),
        JAVA_BYTE.withName("dashes"),
        MemoryLayout.paddingLayout(3)
    ).withName("");
    static final VarHandle const$3 = constants$13.const$2.varHandle(MemoryLayout.PathElement.groupElement("function"));
    static final VarHandle const$4 = constants$13.const$2.varHandle(MemoryLayout.PathElement.groupElement("plane_mask"));
    static final VarHandle const$5 = constants$13.const$2.varHandle(MemoryLayout.PathElement.groupElement("foreground"));
}


