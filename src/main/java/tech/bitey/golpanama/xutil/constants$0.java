// Generated by jextract

package tech.bitey.golpanama.xutil;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$0 {

    static final FunctionDescriptor __bswap_16$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle __bswap_16$MH = RuntimeHelper.downcallHandle(
        "__bswap_16",
        constants$0.__bswap_16$FUNC, false
    );
    static final FunctionDescriptor __bswap_32$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle __bswap_32$MH = RuntimeHelper.downcallHandle(
        "__bswap_32",
        constants$0.__bswap_32$FUNC, false
    );
    static final FunctionDescriptor __bswap_64$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle __bswap_64$MH = RuntimeHelper.downcallHandle(
        "__bswap_64",
        constants$0.__bswap_64$FUNC, false
    );
    static final FunctionDescriptor __uint16_identity$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle __uint16_identity$MH = RuntimeHelper.downcallHandle(
        "__uint16_identity",
        constants$0.__uint16_identity$FUNC, false
    );
    static final FunctionDescriptor __uint32_identity$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle __uint32_identity$MH = RuntimeHelper.downcallHandle(
        "__uint32_identity",
        constants$0.__uint32_identity$FUNC, false
    );
    static final FunctionDescriptor __uint64_identity$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle __uint64_identity$MH = RuntimeHelper.downcallHandle(
        "__uint64_identity",
        constants$0.__uint64_identity$FUNC, false
    );
}

