// Generated by jextract

package tech.bitey.golpanama.xlib;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$226 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$226() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "XGetTextProperty",
        constants$225.const$3
    );
    static final FunctionDescriptor const$1 = FunctionDescriptor.of(RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_LONG,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "XGetVisualInfo",
        constants$226.const$1
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "XGetWMClientMachine",
        constants$149.const$0
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "XGetWMHints",
        constants$123.const$5
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "XGetWMIconName",
        constants$149.const$0
    );
}


