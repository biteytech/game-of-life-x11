// Generated by jextract

package tech.bitey.golpanama.xlib;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$105 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$105() {}
    static final VarHandle const$0 = constants$104.const$5.varHandle(MemoryLayout.PathElement.groupElement("name"));
    static final VarHandle const$1 = constants$104.const$5.varHandle(MemoryLayout.PathElement.groupElement("card32"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("ext_data"),
        JAVA_LONG.withName("fid"),
        JAVA_INT.withName("direction"),
        JAVA_INT.withName("min_char_or_byte2"),
        JAVA_INT.withName("max_char_or_byte2"),
        JAVA_INT.withName("min_byte1"),
        JAVA_INT.withName("max_byte1"),
        JAVA_INT.withName("all_chars_exist"),
        JAVA_INT.withName("default_char"),
        JAVA_INT.withName("n_properties"),
        RuntimeHelper.POINTER.withName("properties"),
        MemoryLayout.structLayout(
            JAVA_SHORT.withName("lbearing"),
            JAVA_SHORT.withName("rbearing"),
            JAVA_SHORT.withName("width"),
            JAVA_SHORT.withName("ascent"),
            JAVA_SHORT.withName("descent"),
            JAVA_SHORT.withName("attributes")
        ).withName("min_bounds"),
        MemoryLayout.structLayout(
            JAVA_SHORT.withName("lbearing"),
            JAVA_SHORT.withName("rbearing"),
            JAVA_SHORT.withName("width"),
            JAVA_SHORT.withName("ascent"),
            JAVA_SHORT.withName("descent"),
            JAVA_SHORT.withName("attributes")
        ).withName("max_bounds"),
        RuntimeHelper.POINTER.withName("per_char"),
        JAVA_INT.withName("ascent"),
        JAVA_INT.withName("descent")
    ).withName("");
    static final VarHandle const$3 = constants$105.const$2.varHandle(MemoryLayout.PathElement.groupElement("ext_data"));
    static final VarHandle const$4 = constants$105.const$2.varHandle(MemoryLayout.PathElement.groupElement("fid"));
    static final VarHandle const$5 = constants$105.const$2.varHandle(MemoryLayout.PathElement.groupElement("direction"));
}

