// Generated by jextract

package tech.bitey.golpanama.xlib;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$70 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$70() {}
    static final FunctionDescriptor XIMOfIC$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XIMOfIC$MH = RuntimeHelper.downcallHandle(
        "XIMOfIC",
        constants$70.XIMOfIC$FUNC
    );
    static final FunctionDescriptor XFilterEvent$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle XFilterEvent$MH = RuntimeHelper.downcallHandle(
        "XFilterEvent",
        constants$70.XFilterEvent$FUNC
    );
    static final FunctionDescriptor XmbLookupString$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XmbLookupString$MH = RuntimeHelper.downcallHandle(
        "XmbLookupString",
        constants$70.XmbLookupString$FUNC
    );
    static final FunctionDescriptor XwcLookupString$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XwcLookupString$MH = RuntimeHelper.downcallHandle(
        "XwcLookupString",
        constants$70.XwcLookupString$FUNC
    );
    static final FunctionDescriptor Xutf8LookupString$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Xutf8LookupString$MH = RuntimeHelper.downcallHandle(
        "Xutf8LookupString",
        constants$70.Xutf8LookupString$FUNC
    );
    static final FunctionDescriptor XVaCreateNestedList$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle XVaCreateNestedList$MH = RuntimeHelper.downcallHandleVariadic(
        "XVaCreateNestedList",
        constants$70.XVaCreateNestedList$FUNC
    );
}


