// Generated by jextract

package tech.bitey.golpanama.xlib;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$123 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$123() {}
    static final VarHandle const$0 = constants$122.const$4.varHandle(MemoryLayout.PathElement.groupElement("supported_values"));
    static final VarHandle const$1 = JAVA_INT.varHandle();
    static final MemorySegment const$2 = RuntimeHelper.lookupGlobalVariable("_Xdebug", JAVA_INT);
    static final FunctionDescriptor const$3 = FunctionDescriptor.of(RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "XLoadQueryFont",
        constants$123.const$3
    );
    static final FunctionDescriptor const$5 = FunctionDescriptor.of(RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_LONG
    );
    static final MethodHandle const$6 = RuntimeHelper.downcallHandle(
        "XQueryFont",
        constants$123.const$5
    );
}

