// Generated by jextract

package tech.bitey.golpanama.xlib;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$70 {

    static final FunctionDescriptor XSetICValues$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XSetICValues$MH = RuntimeHelper.downcallHandle(
        "XSetICValues",
        constants$70.XSetICValues$FUNC, true
    );
    static final FunctionDescriptor XGetICValues$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XGetICValues$MH = RuntimeHelper.downcallHandle(
        "XGetICValues",
        constants$70.XGetICValues$FUNC, true
    );
    static final FunctionDescriptor XIMOfIC$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XIMOfIC$MH = RuntimeHelper.downcallHandle(
        "XIMOfIC",
        constants$70.XIMOfIC$FUNC, false
    );
    static final FunctionDescriptor XFilterEvent$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle XFilterEvent$MH = RuntimeHelper.downcallHandle(
        "XFilterEvent",
        constants$70.XFilterEvent$FUNC, false
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
        constants$70.XmbLookupString$FUNC, false
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
        constants$70.XwcLookupString$FUNC, false
    );
}


