// Generated by jextract

package tech.bitey.golpanama.xlib;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$222 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$222() {}
    static final VarHandle const$0 = constants$220.const$3.varHandle(MemoryLayout.PathElement.groupElement("visualid"));
    static final VarHandle const$1 = constants$220.const$3.varHandle(MemoryLayout.PathElement.groupElement("killid"));
    static final FunctionDescriptor const$2 = FunctionDescriptor.of(RuntimeHelper.POINTER);
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "XAllocClassHint",
        constants$222.const$2
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "XAllocIconSize",
        constants$222.const$2
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "XAllocSizeHints",
        constants$222.const$2
    );
}


