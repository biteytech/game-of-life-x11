// Generated by jextract

package tech.bitey.golpanama.xlib;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$9 {

    static final FunctionDescriptor XCreateSimpleWindow$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle XCreateSimpleWindow$MH = RuntimeHelper.downcallHandle(
        "XCreateSimpleWindow",
        constants$9.XCreateSimpleWindow$FUNC, false
    );
    static final FunctionDescriptor XGetSelectionOwner$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle XGetSelectionOwner$MH = RuntimeHelper.downcallHandle(
        "XGetSelectionOwner",
        constants$9.XGetSelectionOwner$FUNC, false
    );
    static final FunctionDescriptor XCreateWindow$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XCreateWindow$MH = RuntimeHelper.downcallHandle(
        "XCreateWindow",
        constants$9.XCreateWindow$FUNC, false
    );
    static final FunctionDescriptor XListInstalledColormaps$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XListInstalledColormaps$MH = RuntimeHelper.downcallHandle(
        "XListInstalledColormaps",
        constants$9.XListInstalledColormaps$FUNC, false
    );
    static final FunctionDescriptor XListFonts$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XListFonts$MH = RuntimeHelper.downcallHandle(
        "XListFonts",
        constants$9.XListFonts$FUNC, false
    );
    static final FunctionDescriptor XListFontsWithInfo$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XListFontsWithInfo$MH = RuntimeHelper.downcallHandle(
        "XListFontsWithInfo",
        constants$9.XListFontsWithInfo$FUNC, false
    );
}


